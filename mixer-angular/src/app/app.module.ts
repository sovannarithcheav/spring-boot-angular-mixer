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
import {ExamplesModule} from './examples/examples.module';
import {HttpClientModule} from "@angular/common/http";
import {MixerChannelService} from "./mixer-channel.service";
import {MixerChannel} from "./mixer-channel";


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
        MixerChannelService
    ],
    exports: [
        FooterComponent
    ],
    bootstrap: [AppComponent]
})
export class AppModule {
}
