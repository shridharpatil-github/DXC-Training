import { Component, OnInit } from '@angular/core';
import { User } from '../model/user';
import { AuthenticationService } from '../service/authentication.service';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  user : User = new User();
  form ;
  confirmPassword;
  constructor(private authService : AuthenticationService, private toastr : ToastrService, private route : Router) { }

  ngOnInit(): void {
  }
  register() {
    // console.log( this.confirmPassword,'  ',this.user);
    if(this.confirmPassword === this.user.password){
    this.authService.registerUser(this.user).subscribe( response=>{
      if(response.httpStatus === 'OK'){
      console.log(response);
      this.toastr.success('Account Creted!!');
      this.route.navigate(['login']);
      }else{
      console.log(response)
      this.toastr.warning(response.message);
      }
    }, err =>{
      this.toastr.error('Invalid Data');
      console.log(err);
    }, () =>{
      this.form.clear();
    })
  } else {
    this.toastr.show('Password Not Matching');
  }
  }
}
