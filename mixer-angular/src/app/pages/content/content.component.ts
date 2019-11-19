import {Component, OnInit} from '@angular/core';
import {HtmlService} from "../../services/html/html.service";
import {Subscription} from "rxjs";

@Component({
    selector: 'app-content',
    templateUrl: './content.component.html',
    styleUrls: ['./content.component.scss']
})
export class ContentComponent implements OnInit {

    htmlToAdd: Subscription;
    private htmlService: HtmlService;

    constructor(htmlService: HtmlService) {
        this.htmlService = htmlService;
    }

    ngOnInit() {
        this.htmlService.getHtmL().then(value => this.htmlToAdd = value.toString());
    }

}
