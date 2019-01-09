import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-welcome-card',
  templateUrl: './welcome-card.component.html',
  styleUrls: ['./welcome-card.component.css']
})
export class WelcomeCardComponent implements OnInit {

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
