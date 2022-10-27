import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AsignarComponent } from './asignar/asignar.component';

const routes: Routes = [
  {path:'',component:AsignarComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AsignarRoutingModule { }
