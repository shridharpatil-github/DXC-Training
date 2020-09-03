import { Component, OnInit, DoCheck } from '@angular/core';
import { AuthenticationService } from '../service/authentication.service';
import { flatten } from '@angular/compiler';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements DoCheck{

  constructor(private authService : AuthenticationService, private toastr : ToastrService) { }
  status : boolean;
  email = localStorage.getItem('user');
  
  ngDoCheck() {
    this.email = localStorage.getItem('user');
    if(this.email != null){
      this.status = true;
    }else{
      this.status = false;
    }
  }
  logout(){

    console.log('logout');
    this.authService.logout();
    this.authService.logout().subscribe( response=> {
      console.log(response);
      console.log('logout success');
      this.toastr.success('Logout Success');
    }, err =>{
      console.log(err);
    })
  }

}
