import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { responsePageable } from '../model/responsePageable.model';

@Injectable({
  providedIn: 'root'
})
export class PowerService {
  apiUrl = "http://localhost:8080/api/power";
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(private httpClient: HttpClient) { }

  public getAll(): Observable<responsePageable> {
    return this.httpClient.get<responsePageable>(this.apiUrl);
  }

  public delete(id: any){
    return this.httpClient.delete<any>(this.apiUrl+"/"+id);
  }

  public post(power: any){
    return this.httpClient.post<any>(this.apiUrl, power, this.httpOptions);
  }

  public put(power: any){
    return this.httpClient.put<any>(this.apiUrl, power, this.httpOptions);
  }
}


