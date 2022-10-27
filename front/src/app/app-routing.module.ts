import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path:'mecanico',loadChildren:()=>import('./mecanico/mecanico.module').then(m=>m.MecanicoModule)},
  {path:'asignar',loadChildren:()=>import('./asignar/asignar.module').then(m=>m.AsignarModule)}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
