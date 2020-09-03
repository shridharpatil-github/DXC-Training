import { Injectable } from '@angular/core';
import { CanActivate, Router } from '@angular/router';
import { AuthenticationService } from './service/authentication.service';
import { ToastrService } from 'ngx-toastr';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService implements CanActivate {

  email = localStorage.getItem('user');
  constructor(private authService : AuthenticationService, private route : Router, private toastr : ToastrService) { }
  
  canActivate(){
    if(this.email != null){
      return true;
    }else {
      this.toastr.info('Login');
      this.route.navigate(['login']);
    }
  }
}
