import {Component, OnInit} from '@angular/core';

@Component({
    selector: 'app-daily-articles',
    templateUrl: './daily-articles.component.html',
    styleUrls: ['./daily-articles.component.scss']
})
export class DailyArticlesComponent implements OnInit {
    testContent1: string;
    testContent2: string;
    testTitle1: string;
    testTitle2: string;

    constructor() {
        this.testTitle1 = "Creating a Spring Boot Project with Maven and Eclipse, Maven, Database.";
        this.testTitle2 = "Creating a Spring Boot Project with Eclipse and Maven.";

        this.testContent1 = "Setting up a basic project with Spring Boot is a cake walk. In this article, we will explore the different options of creating Spring Boot Projects with Maven and Eclipse." +
            "Setting up a basic project with Spring Boot is a cake walk. In this article, we will explore the different options of creating Spring Boot Projects with Maven and Eclipse.";
        this.testContent2 = "Setting up a basic project with Spring Boot is a cake walk. In this article, we will explore the different options of creating Spring Boot Projects with Maven and Eclipse.";
    }

    ngOnInit() {
    }

}
