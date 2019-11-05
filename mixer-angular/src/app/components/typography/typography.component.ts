import {Component, OnInit} from '@angular/core';
import {MixerChannelService} from "../../mixer-channel.service";
import {MixerChannel} from "../../mixer-channel";
import { WavesModule, TableModule } from 'angular-bootstrap-md';

@Component({
    selector: 'app-typography',
    templateUrl: './typography.component.html',
    styleUrls: ['./typography.component.scss']
})
export class TypographyComponent implements OnInit {

    mixerChannel: MixerChannel;

    constructor(private mixerChannelService: MixerChannelService) {
    }

    ngOnInit() {
        this.mixerChannelService.findAll().subscribe(data => {
            this.mixerChannel = data;
        });
    }

}
