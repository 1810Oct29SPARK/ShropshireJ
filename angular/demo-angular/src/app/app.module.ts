import { HttpClient, HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { MainPageComponent } from './main-page/main-page.component';
import { WelcomeCardComponent } from './welcome-card/welcome-card.component';
import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { RouterModule } from '@angular/router';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatButtonModule, MatCheckboxModule, MatToolbarModule, MatListModule} from '@angular/material';
import {MatMenuModule} from '@angular/material/menu';
import {MatCardModule} from '@angular/material/card';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatSelectModule} from '@angular/material/select';
import {MatIconModule} from '@angular/material/icon';
import {MatSlideToggleModule} from '@angular/material/slide-toggle';
import {MatTabsModule} from '@angular/material/tabs';
import { UserProfileComponent } from './user-profile/user-profile.component';
import { PublisherProfileComponent } from './publisher-profile/publisher-profile.component';
import {MatSidenavModule} from '@angular/material/sidenav';
import { LayoutModule } from '@angular/cdk/layout';
import { from } from 'rxjs';


@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    MainPageComponent,
    WelcomeCardComponent,
    LoginComponent,
    SignUpComponent,
    UserProfileComponent,
    PublisherProfileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatFormFieldModule,
    MatButtonModule,
    BrowserAnimationsModule,
    MatMenuModule,
    HttpClientModule,

    MatSidenavModule,
    MatCardModule,
    MatSelectModule,
    MatIconModule,
    MatTabsModule,
    MatSlideToggleModule,
    MatInputModule,
    MatCheckboxModule,
    RouterModule.forRoot([
      {path: 'mainPage', component: MainPageComponent},
      {path: 'loginPage', component: LoginComponent},
      {path: 'signupPage', component: SignUpComponent},
      {path: 'userProfile', component: UserProfileComponent},
      {path: 'publisherProfile', component: PublisherProfileComponent},
      {path: '', redirectTo: 'mainPage', pathMatch: 'full'},
      {path: '**', redirectTo: 'mainPage', pathMatch: 'full'}
    ]),
    LayoutModule,
    MatToolbarModule,
    MatListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
