import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {MixerChannel} from "./mixer-channel";

@Injectable({
  providedIn: 'root'
})
export class MixerChannelService {

  private usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/users';
  }

  public findAll(): Observable<MixerChannel[]> {
    return this.http.get<MixerChannel[]>(this.usersUrl);
  }

}
