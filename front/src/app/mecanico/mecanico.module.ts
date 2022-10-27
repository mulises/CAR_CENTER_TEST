import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MecanicoRoutingModule } from './mecanico-routing.module';
import { CrearComponent } from './crear/crear.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MaterialModule } from '../material.module';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    CrearComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    MecanicoRoutingModule,
    MaterialModule,
    HttpClientModule
  ]
})
export class MecanicoModule { }
