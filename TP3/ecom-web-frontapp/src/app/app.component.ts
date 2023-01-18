import { Component } from '@angular/core';
import {SecurityService} from "./service/security.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  constructor(public securityService:SecurityService) { }
  async login(){
    await this.securityService.kcService.login({
      redirectUri: window.location.origin
    });
  }
  onLogout() {
    this.securityService.kcService.logout("http://localhost:4200/")
      .then(value=>{
        console.log(value);
      });
  }
  title = 'ecom-web-frontapp';
}
