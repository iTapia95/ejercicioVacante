import { Component } from '@angular/core';
import { FormBuilder, FormGroup, MinLengthValidator, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ejercicio';

  public form = new FormGroup({});

  constructor(private formBuilder: FormBuilder){

  }

  ngOnInit(): void{
    this.form = this.formBuilder.group({
      nombre: ['', Validators.required],
      matricula: ['', Validators.required, Validators.maxLength(9)],
      email: ['', [Validators.required, Validators.email]],
      password: ['', Validators.required, Validators.minLength(6)],
      semestre: ['', Validators.required],
      nivelAcademico: ['', Validators.required],
      nvlAcademicoOpc: ['']
    });
  }

  nivelAcademico = [
    'Bachillerato',
    'Licenciatura',
    'Maestria',
    'Doctorado'
  ];

  nvlAcademico = [];

  nvlAcademicoOpc = {
    Bachillerato: [],
    Licenciatura: ['Enfermeria', 'Software', 'Arquitectura'],
    Maestria: ['Fiscal', 'Educacion'],
    Doctorado: ['Comunicacion', 'Gastronomia']
  };

  cambioNvl(dato) {
    this.nvlAcademico = this.nvlAcademicoOpc[dato];
  }

  send(): any {
    console.log(this.form.value);
  }
}
