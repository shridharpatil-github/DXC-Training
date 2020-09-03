import { Component, OnInit } from '@angular/core';
import { CricketService } from '../service/cricket.service';
import { NewMatch } from '../model/newmatch';
import {ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';

@Component({
  selector: 'app-recommended',
  templateUrl: './recommended.component.html',
  styleUrls: ['./recommended.component.css']
})
export class RecommendedComponent implements OnInit {

  // holds recommended matches list data 
  recommendedMatches : Array<NewMatch> = new Array<NewMatch>();
  favorites : Array<any> = new Array<any>();
  email : string;

  count : number =0;
  // injected service class and toastr service class 
  // CricketService provides methods.
  // ToastrService provides service for display message for in our application match is
  // recommended or not it will shows message
  constructor(private service : CricketService, private toastr : ToastrService,private route : Router) { }

  // it will invokes when page initialize(when page loads)
  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.email = localStorage.getItem('user');
    // retrives data and subscribe recommended matches 
    this.service.getAllRecommededMatches().subscribe( response => {
      console.log(response);

      this.recommendedMatches = response.newMatches;
      this.favorites = response.newMatches.email;
      // for(let i = 0; i< response.newMatches.length; i++){
      //   this.count=response.newMatches[0].email.length;
      //   this.favorites.push({...response.newMatches,...response.newMatches[0].email});
      // }
      console.log('faver ',this.favorites);
      // this.count = this.favorites.length;
      this.ngOnInit();
    }, err=>{
      console.log((err));
    });
  
  }
  // it will invokes when user clicks un recommend button
  // accepts match data for un recommend
  unRecommendMatch(match) {
    this.service.unRecommendNewMatch(match).subscribe( response => {
      console.log('Match has unrecommended');
      this.toastr.info('Match Unrecommended');
      this.route.navigate(['recommended-matches']);
    }, err=>{
      console.log(err);
    }, () =>{
      // this.ngOnInit();
    })
  }
}
