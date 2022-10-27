import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AsignarRoutingModule } from './asignar-routing.module';
import { AsignarComponent } from './asignar/asignar.component';


@NgModule({
  declarations: [
    AsignarComponent
  ],
  imports: [
    CommonModule,
    AsignarRoutingModule
  ]
})
export class AsignarModule { }
