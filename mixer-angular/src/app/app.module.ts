import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {RouterModule} from '@angular/router';
import {AppRoutingModule} from './app.routing';

import {AppComponent} from './app.component';
import {NavbarComponent} from './shared/navbar/navbar.component';
import {FooterComponent} from './shared/footer/footer.component';

import {ComponentsModule} from './components/components.module';
import {ExamplesModule} from './pages/examples.module';
import {HttpClientModule} from "@angular/common/http";
import {MixerChannelService} from "./services/mixer/mixer-channel.service";
import {MixerChannel} from "./services/mixer/mixer-channel";
import { ContentComponent } from './pages/content/content.component';
import {HtmlService} from "./services/html/html.service";
import {HighlightService} from "./shared/utils/highlight.service";


@NgModule({
    declarations: [
        AppComponent,
        NavbarComponent,
        FooterComponent
    ],
    imports: [
        BrowserModule,
        NgbModule.forRoot(),
        FormsModule,
        RouterModule,
        ComponentsModule,
        ExamplesModule,
        AppRoutingModule,
        HttpClientModule
    ],
    providers: [
        MixerChannel,
        MixerChannelService,
        HighlightService,
        HtmlService
    ],
    bootstrap: [AppComponent]
})
export class AppModule {
}
