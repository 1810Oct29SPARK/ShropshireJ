import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private _routerRouter: Router) { }

  ngOnInit() {
  }
onClick() {
  this._routerRouter.navigate(['/usersPage']);
}
}
