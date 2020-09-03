import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../service/authentication.service';
import { User } from '../model/user';
import { HttpClient } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  constructor(private service: AuthenticationService, private http : HttpClient, private toastr : ToastrService,private route: Router) { }
  user : User = new User;
  selectedFile: File;
  password : string;
  cpassword : string;
   //Gets called when the user selects an image
   public onFileChanged(event) {
    //Select File
    this.selectedFile = event.target.files[0];

  }

  uploadImage() {

    let image = new FormData();
    image.append('imageFile', this.selectedFile, this.selectedFile.name);
    const email : string = localStorage.getItem('user');
    return this.http.get<any>(`http://localhost:8888/cricketmatch/user/api/uploadImage/${image}/${email}`).subscribe( response =>{
      console.log(response);
    }, err =>{
      console.log(err);
    });

    
        
  }
  updateProfile(){
    console.log(this.user);
    console.log(this.selectedFile);
      const formData = new FormData();
      if( this.password != null && this.cpassword != null && this.password === this.cpassword){
      // formData.append()
      this.user.password = this.password;
    this.service.updateProfile(this.user,this.selectedFile).subscribe( response =>{
      console.log(response);
      if(response.httpStatus === "OK"){
        this.toastr.success('Profile updated');
        this.service.logout();
        this.route.navigate(['login']);
      }else{
        this.toastr.warning(response.message);
        
      }
      
    }, err => {
      console.log(err);
    })
  }
}
  ngOnInit(): void {
    this.service.getUserDetails().subscribe( response =>{
      console.log(response);
      this.user = response.user;
      console.log(this.user);
    }, err=>{
      console.log(err);
    });
  }

}
