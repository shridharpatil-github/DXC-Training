import { Component, OnInit } from '@angular/core';
import { CricketService } from '../service/cricket.service';
import {NewMatch } from '../model/newmatch';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';
import { AuthenticationService } from '../service/authentication.service';

@Component({
  selector: 'app-new-matches',
  templateUrl: './new-matches.component.html',
  styleUrls: ['./new-matches.component.css']
})
export class NewMatchesComponent implements OnInit {

  //holds value entered in search box
  search : string;
  //holds value of recommended data 
  newMatch : NewMatch = new NewMatch();
  // stores the list of matches subscribed from third party api
  matches : Array<any> = new Array<any>();
  
  email : string;
  // injected service class and toastr service class 
  // CricketService provides methods.
  // ToastrService provides service for display message for in our application match is
  // recommended or not it will shows message
  constructor(private service : CricketService, private authService : AuthenticationService,
     private toastr : ToastrService, private route : Router) { }

  // it will calls when page load 
  ngOnInit(): void {
    // getNewMatches() returns list of new matches from crick api(third party api)
    this.service.getNewMatches().subscribe( data => {
      this.matches = data.matches;
      // console.log('new matches',this.matches);
    }, err => {
      console.log(err);
    });
  }

  // it will calls when user clicked on recommend button
  // accepts mselected match as argument
  // it will pass match data service for recommend match
  addToReccommend(match){
    console.log(match);
    this.email = localStorage.getItem('user');
    if(this.email != null ){
    console.log(match);
    // it will set data to user defined NewMatch model class
    // it will easy for send data to backend service
    this.newMatch = this.newMatch.setData(match);
    // console.log('newmatch details',this.newMatch);
    this.service.addToRecommend(this.newMatch).subscribe( data=>{
      if(data.httpStatus === "OK"){
      // console.log('data added',data);
      // toastr shows message for user confirmation
      this.toastr.success('match recommended');
      }else{
      this.toastr.warning('Match Already Recommended');
      }
    }, err=>{
      // if match is not recommended it will shows the message to user
      this.toastr.error('match not recommended');
      // console.log(err);
    });
  }else {
    this.toastr.warning('You Not Loggedin');
    this.route.navigate(['login']);
  }
} 
}
