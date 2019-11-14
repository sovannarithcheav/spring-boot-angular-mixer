import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {DailyArticlesComponent} from './daily-articles.component';

describe('DailyArticlesComponent', () => {
    let component: DailyArticlesComponent;
    let fixture: ComponentFixture<DailyArticlesComponent>;

    beforeEach(async(() => {
        TestBed.configureTestingModule({
            declarations: [DailyArticlesComponent]
        })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(DailyArticlesComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it('should create', () => {
        expect(component).toBeTruthy();
    });
});