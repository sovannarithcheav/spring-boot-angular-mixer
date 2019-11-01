import { TestBed } from '@angular/core/testing';

import { MixerChannelService } from './mixer-channel.service';

describe('MixerChannelService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MixerChannelService = TestBed.get(MixerChannelService);
    expect(service).toBeTruthy();
  });
});
