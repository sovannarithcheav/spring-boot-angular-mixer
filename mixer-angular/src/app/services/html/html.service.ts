import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {text} from "@angular/core/src/render3";

@Injectable({
    providedIn: 'root'
})
export class HtmlService {

    private usersUrl: string;
    private htmlStr: string;

    constructor(private http: HttpClient) {
        this.usersUrl = 'http://localhost:8080/html';
    }

    getHtmL(): Promise {
        return new Promise(resolve => {
            this.http.get<string>(this.usersUrl, {responseType: 'text'})
                .subscribe(
                    value => {
                        resolve(value);
                    }
                )
        });
    }
}
