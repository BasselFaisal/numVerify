import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { NumData } from '../common/num-data';

@Injectable({
  providedIn: 'root'
})
export class NumDataService { 

  private baseUrl = "http://localhost:8080/phoneData";

  constructor(private http: HttpClient) {
   }

   get(): Observable<NumData[]> {
    return this.http.get<NumData[]>(this.baseUrl); 
  } 

  getNumber(number: number): Observable<NumData> {
    const productUrl = `${this.baseUrl}/${number}`;
    return this.http.get<NumData>(productUrl);
  }
}
