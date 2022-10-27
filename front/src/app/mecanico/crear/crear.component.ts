import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MecanicoService } from '../services/mecanico.service';
import Swal from 'sweetalert2'

@Component({
  selector: 'app-crear',
  templateUrl: './crear.component.html',
  styleUrls: ['./crear.component.css']
})
export class CrearComponent implements OnInit {

  mecanico!: FormGroup;

  constructor(private formBuilder: FormBuilder, private mecanicoSvc:MecanicoService) {
    this.inicializarFormulario();
  }

  ngOnInit(): void {
  }

  public crearMecanico():void {
    console.log(this.mecanico.value)
    this.mecanicoSvc.crearMecanicoSvc(this.mecanico.value).subscribe(response => {
      Swal.fire(
        'Excelente',
        `Mecanico ${this.mecanico.controls['primerNombre'].value}` ,
        'success'
      )
    },
    err=>{
      console.log(err.error)
      Swal.fire('Error',err.error,'error')
    }
    )
  }

  private inicializarFormulario(): void {
    this.mecanico = this.formBuilder.group({
      documento:[null,Validators.required],
      email:[null, [Validators.required, Validators.email]],
      tipoDocumento: [null, Validators.required],
      primerNombre: [null, Validators.required],
      segundoNombre: [null],
      primerApellido: [null, Validators.required],
      segundoApellido: [null],
      celular: [null, Validators.required],
      direccion: [null, Validators.required],

    })
  }

}
