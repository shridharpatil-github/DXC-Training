import { Component, OnInit, DoCheck } from '@angular/core';
import { CricketService } from '../service/cricket.service';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';
import { NewMatch } from '../model/newmatch';

@Component({
  selector: 'app-faverite',
  templateUrl: './faverite.component.html',
  styleUrls: ['./faverite.component.css']
})
export class FaveriteComponent implements OnInit{

  // holds recommended matches list data 
  recommendedMatches : Array<NewMatch>;
  favorites : Array<any> = new Array<any>();
  email : string;
  users : Array<string> = new Array<string>();
  count : number =0;
  // injected service class and toastr service class 
  // CricketService provides methods.
  // ToastrService provides service for display message for in our application match is
  // recommended or not it will shows message
  constructor(private service : CricketService, private toastr : ToastrService,private route : Router) { 
    // this.recommendedMatches = null;
    this.recommendedMatches = new Array<NewMatch>();
    this.getFavoriteMatches();
  }

  

  // it will invokes when page initialize(when page loads)
  ngOnInit(): void {
    // this.recommendedMatches = null;
    
    // this.getFavoriteMatches();
    // retrives data and subscribe recommended matches 
    // this.service.getAllRecommededMatches().subscribe( response => {
    //   console.log(response);
    //   // this.recommendedMatches = response.newMatches;
    //   this.favorites = response.newMatches.email;
     
    //   for(let i=0; i<response.newMatches.length; i++){
    //     // console.log('i-',i,response.newMatches[i].email);
    //     this.users = response.newMatches[i].email;
    //     // console.log('i-',this.users);


    //     for(let j=0; j<this.users.length ; j++){
    //       // console.log('j->',this.users[j]);
    //       if(this.users[j] == this.email){
    //         console.log(response.newMatches[i])
    //         this.recommendedMatches.push(response.newMatches[i]);
    //       }
    //     }
    //   }
    //   console.log('faver ',this.favorites);
    //   // this.count = this.favorites.length;
    // }, err=>{
    //   console.log((err));
    // });
  }
 // it will invokes when user clicks un recommend button
  // accepts match data for un recommend
  unRecommendMatch(match) {
    this.service.unRecommendNewMatch(match).subscribe( response => {
      console.log('Match has unrecommended');
      this.toastr.info('Match Unrecommended');
      this.getFavoriteMatches();
      // this.ngOnInit();
      // this.service.fetChAllMatches();
      // this.route.navigate(['recommended-matches']);
      window.location.reload();
    }, err=>{
      console.log(err);
    }, () =>{
      // this.ngOnInit();
    });
    // this.ngOnInit();
  }
  getFavoriteMatches(){
    this.service.fetChAllMatches();
  this.email = localStorage.getItem('user');
  this.service.getAllRecommededMatches().subscribe( response => {
      console.log(response);
      // this.recommendedMatches = response.newMatches;
      this.favorites = response.newMatches.email;
     
      for(let i=0; i<response.newMatches.length; i++){
        // console.log('i-',i,response.newMatches[i].email);
        this.users = response.newMatches[i].email;
        // console.log('i-',this.users);


        for(let j=0; j<this.users.length ; j++){
          // console.log('j->',this.users[j]);
          if(this.users[j] == this.email){
            console.log(response.newMatches[i])
            this.recommendedMatches.push(response.newMatches[i]);
          }
        }
      }
      console.log('faver ',this.favorites);
      // this.count = this.favorites.length;
      // window.location.reload();
    }, err=>{
      console.log((err));
    });
 
  // this.service.getAllNewMatches().subscribe( response =>{
  //   console.log(response);
  //   for(let i=0;i<response.length;i++){
  //     this.users= response[i].email;
  //     for(let j=0;j<this.users.length; j++){
  //       if(this.users[j]=== this.email){
  //         this.recommendedMatches.push(response[i]);
  //       }
  //     }
  //   }
  //   // window.location.reload();
  //   this.route.navigate(['faverites']);
  //   // this.ngOnInit();
  // }, err =>{

  // });
  
  }

}
