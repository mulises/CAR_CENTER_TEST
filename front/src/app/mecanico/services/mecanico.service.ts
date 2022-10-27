import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Observable } from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class MecanicoService {

  constructor(private http: HttpClient) { }

  crearMecanicoSvc(mecanico: any): Observable<any> {
    return this.http.post<any>(`${environment.urlBase}/mecanico`,mecanico)
  }
}
