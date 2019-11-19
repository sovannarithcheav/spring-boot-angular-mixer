export class MixerChannel {
    id: string;
    token: string;
    numFollowers: number;
    viewersTotal: number;
    bannerUrl: string;
    online: boolean;
    thumbnail: {
        url: string;
    };
    user: {
        avatarUrl: string;
        username: string;
    }
}
