import { Component, OnInit } from '@angular/core';
import {CricketService } from '../service/cricket.service'

@Component({
  selector: 'app-upcoming-matches',
  templateUrl: './upcoming-matches.component.html',
  styleUrls: ['./upcoming-matches.component.css']
})
export class UpcomingMatchesComponent implements OnInit {

  matches : Array<any> = new Array<any>();
  search : string;
  constructor(private service : CricketService) { }

  ngOnInit(): void {
    this.service.getUpComingMatches().subscribe( data => {
      this.matches = data.data;
      console.log(this.matches);
    }, err => {
      console.log(err);
    })
  }

}
