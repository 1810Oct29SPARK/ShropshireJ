import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
  constructor(private _routerRouter: Router) {}

  ngOnInit() {}

  Profile() {
    this._routerRouter.navigate(['/publisherProfile']);
  }

  userProfile() {
    this._routerRouter.navigate(['/userProfile']);
  }
}
