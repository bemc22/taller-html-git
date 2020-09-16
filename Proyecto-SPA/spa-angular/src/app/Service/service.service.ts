import { Injectable } from '@angular/core';
import {HttpClient } from '@angular/common/http';
import {Persona} from '../Modelo/Persona';
import {Documento} from '../Modelo/Documento';
import {Lugar} from '../Modelo/Lugar';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }

  Url = 'http://localhost:8080/spring-spa/personas';
  D_Url = 'http://localhost:8080/spring-spa/documentos';
  L_Url = 'http://localhost:8080/spring-spa/lugares';

  getPersonas(){
    return this.http.get<Persona[]>(this.Url);
  }

  getDocumentos(){
    return this.http.get<Documento[]>(this.D_Url);
  }

  getLugares(){
      return this.http.get<Lugar[]>(this.L_Url);
  }

  createPersona(persona:Persona){
    return this.http.post<Persona>(this.Url, persona)
  }

  getPersona(id:number){
    return this.http.get<Persona>(this.Url+"/"+id);
  }

  updatePersona(persona:Persona){
    return this.http.put<Persona>(this.Url+"/"+persona.id,persona);
  }

  deletePersona(persona:Persona){
    return this.http.delete<Persona>(this.Url+"/"+persona.id);
  }

}
