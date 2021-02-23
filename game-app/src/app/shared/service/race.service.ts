import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Race } from '../model/race.module';
import { responsePageable } from '../model/responsePageable.model';

@Injectable({
  providedIn: 'root'
})
export class RaceService {
  apiUrl = "http://localhost:8080/api/race";
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };
  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<responsePageable>{
    return this.httpClient.get<responsePageable>(this.apiUrl)
  }

  post(race: Race){
    return this.httpClient.post<any>(this.apiUrl, race, this.httpOptions);
  }

  delete(id: any){
    return this.httpClient.delete<any>(this.apiUrl+"/"+id);
  }
}
