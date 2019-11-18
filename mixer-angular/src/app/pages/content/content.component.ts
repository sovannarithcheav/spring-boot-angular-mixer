import {AfterViewChecked, Component, OnInit} from '@angular/core';
import {HighlightService} from "../../shared/utils/highlight.service";

@Component({
    selector: 'app-content',
    templateUrl: './content.component.html',
    styleUrls: ['./content.component.scss']
})
export class ContentComponent implements OnInit, AfterViewChecked {

    highlighted: boolean = false;

    constructor(private highlightService: HighlightService) {
    }

    ngOnInit() {
    }

    ngAfterViewChecked(): void {
    }

}
