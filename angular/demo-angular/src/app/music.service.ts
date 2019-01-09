import { map } from 'rxjs/operators';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MusicService {
/**
 * DI - Dependaency Injection
 * Get thhe **HttpClientModule**
 * This eill allow me to send requests
 */

  tracks;
  trackstracks = [];

 constructor(private http: HttpClient) { }



 getTopTrack(): Observable<any> {
  const music =  this.http.get('https://api.napster.com/v2.1/tracks/top?apikey=ZDUzZjhlNDEtY2I5Mi00OGE4LTg5MzYtOGQ0NjU0ZWQ5M2M0');
  console.log(music);
  music.subscribe((e) => {
    this.tracks = e['tracks'];
  });
     return music;
}


getAlbumImage(): Observable<any> {
  console.log('oooo');
  console.log(this.tracks);

  for ( let i = 0; i < this.tracks.length; i++) {
    console.log(this.tracks);
    const musica = this.http.get<any>
        ('https://api.napster.com/v2.2/albums/' + this.tracks[i].albumId
        + '?apikey=ZDUzZjhlNDEtY2I5Mi00OGE4LTg5MzYtOGQ0NjU0ZWQ5M2M0').subscribe((e) => {
          this.trackstracks.push(e.albums[0].links.images.href);
        });
  }
const music = this.http.get<any>
  ('https://api.napster.com/v2.1/tracks/top?apikey=ZDUzZjhlNDEtY2I5Mi00OGE4LTg5MzYtOGQ0NjU0ZWQ5M2M0');
  return music;
}

getAlbumImageImage(): any[] {

  let music;
  for (let i = 0; i < this.trackstracks.length; i++) {
    music = this.http.get<any>
      (this.trackstracks[i]
      + '?apikey=ZDUzZjhlNDEtY2I5Mi00OGE4LTg5MzYtOGQ0NjU0ZWQ5M2M0').subscribe((e) => {
        this.tracks[i].albumUrl = e.images[2].url;
      });
  }

  return this.tracks;

}

}

