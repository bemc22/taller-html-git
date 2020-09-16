import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'
import {ServiceService}from '../../Service/service.service'
import {Persona}from 'src/app/Modelo/Persona'
import {Documento}from 'src/app/Modelo/Documento'
import {Lugar}from 'src/app/Modelo/Lugar'

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  personas:Persona[];
  documentos = {};
  lugares = {};

  constructor(private service:ServiceService, private router:Router) { }
  ngOnInit(): void {

    this.service.getPersonas()
    .subscribe(data =>{
      this.personas = data;
    })

    this.service.getDocumentos()
    .subscribe(data =>{

      this.documentos = Object.assign({}, ...data.map((x) => ({[x.id_tipodocumento]: x.nombre})));
      console.log(this.documentos);
    })

    this.service.getLugares()
    .subscribe(data =>{

      this.lugares = Object.assign({}, ...data.map((x) => ({[x.id_lugar]: x.nombre})));
      console.log(this.lugares);
    })





  }

  Editar(persona:Persona){
    localStorage.setItem("id", persona.id.toString());
    this.router.navigate(["edit"]);
  }

  Delete(persona:Persona){
    this.service.deletePersona(persona)
    .subscribe(data =>{
      this.personas = this.personas.filter(p=>p!==persona);
    })
  }

}
