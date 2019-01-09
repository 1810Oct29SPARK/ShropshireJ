import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css']
})
export class MainPageComponent implements OnInit {

  constructor(private _routerService: Router) { }

  ngOnInit() {
  }

  loginFunc() {
    this._routerService.navigate(['/loginPage']);
  }

  signupFunc() {
    this._routerService.navigate(['/signupPage']);
  }
}
