import { MusicService } from './../music.service';
import { Component } from '@angular/core';
import { BreakpointObserver, Breakpoints } from '@angular/cdk/layout';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { containsElement } from '@angular/animations/browser/src/render/shared';

@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.css']
})
export class UserProfileComponent {


  tracksReceived = false;

  tracks = [];
  album = '';
  a = 'aa';



  isHandset$: Observable<boolean> = this.breakpointObserver
    .observe(Breakpoints.Handset)
    .pipe(map(result => result.matches));

  constructor(
    private breakpointObserver: BreakpointObserver,
    private musicService: MusicService
  ) {}


  getTrack() {
    this.musicService.getTopTrack().subscribe((e) => {
      this.tracksReceived = true;

      this.musicService.getAlbumImage().subscribe((b) => {
        this.tracks = this.musicService.getAlbumImageImage();

        });
      });
    }

 }
