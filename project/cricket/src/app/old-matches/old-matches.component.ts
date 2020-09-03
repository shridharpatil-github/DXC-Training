import { Component, OnInit } from '@angular/core';
import { CricketService } from '../service/cricket.service';

@Component({
  selector: 'app-old-matches',
  templateUrl: './old-matches.component.html',
  styleUrls: ['./old-matches.component.css']
})
export class OldMatchesComponent implements OnInit {

  // holds data fetched from third api
  matches : Array<any> = new Array<any>();
  // holds value of entered in search box
  search : string;
  // injected CricketService class
  constructor(private service : CricketService) { }

  // it will calls when page load 
  ngOnInit(): void {
    // data retirived from crick api
    this.service.getOldMatches().subscribe( data => {
      this.matches = data.data;
      // console.log('old matches',this.matches);
    }, err => {
      console.log(err);
    });
  }

}
