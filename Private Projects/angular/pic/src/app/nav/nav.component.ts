import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {


  // tslint:disable-next-line:typedef-whitespace
  appTitle:string = 'myapp';

  nstructor() { }

  ngOnInit() {
  }

}
