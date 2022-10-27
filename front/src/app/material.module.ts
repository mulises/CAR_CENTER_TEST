import { NgModule } from '@angular/core';
import {MatMenuModule} from '@angular/material/menu';
import {MatButtonModule} from '@angular/material/button';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';

const materialModule = 
[
  MatMenuModule,
  MatButtonModule,
  MatFormFieldModule,
  MatInputModule
];

@NgModule({
  imports:[... materialModule],
  exports:[... materialModule]
})
export class MaterialModule { }
