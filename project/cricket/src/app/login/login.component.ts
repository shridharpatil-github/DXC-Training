import { Component, OnInit } from '@angular/core';
import { User } from '../model/user';
import { AuthenticationService } from '../service/authentication.service';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user : User = new User();
  constructor( private authService : AuthenticationService, private toastr : ToastrService, private route : Router) { }

  ngOnInit(): void {
  }

  login(){
    console.log(this.user);
    this.authService.login(this.user).subscribe( response =>{
      if(response.httpStatus === 'OK'){

        this.authService.setStatus(true);
      console.log(response);
      console.log(response['token']);
      this.authService.setBearerToken(response.token);
      this.authService.setEmail(response.email);
      this.toastr.success(response.message)
      this.route.navigate(['/']);
      }else {
      console.log(response);
      this.toastr.warning(response.message);
      }
    }, err =>{
      console.log(err);
      this.toastr.error(err.error);
    });
  }
}
