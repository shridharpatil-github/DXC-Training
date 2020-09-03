import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { NewMatch } from '../model/newmatch';
import { AuthenticationService } from './authentication.service';

@Injectable({
  providedIn: 'root'
})

// service class for interacting between components
// we can share the data between service and components by injecting the service class
export class CricketService {
  matches : Array<NewMatch>;
  matchSubject : BehaviorSubject<Array<NewMatch>>;
  // injecting HttpClient for performs HTTP requests 
  constructor(private http : HttpClient, private authService : AuthenticationService) {
    this.matchSubject=new BehaviorSubject([]);
   }
  
  // fetch up comming match data from third api 
  getUpComingMatches() : Observable<any> {
    return this.http.get<any>('https://cricapi.com/api/matchCalendar?apikey=xRHw8VfrNwSqKFksxOxHEl08OMv2');
  }

  // fetch old match data from third api 
  getOldMatches() : Observable<any> {
    return this.http.get<any>('https://cricapi.com/api/cricket?apikey=xRHw8VfrNwSqKFksxOxHEl08OMv2');
  }

  
  // fetch new match data from third api 
  getNewMatches() : Observable<any> {
    return this.http.get<any>('https://cricapi.com/api/matches?apikey=xRHw8VfrNwSqKFksxOxHEl08OMv2');
  }

  //  recommend macth store it database
  addToRecommend(newMatch : NewMatch) : Observable<any>{

     const token = localStorage.getItem('bearerToken');
    return this.http.post<any>('http://localhost:7777/cricketmatch/api/recommededMatch',newMatch,{
      headers: new HttpHeaders().set("Authorization",`Bearer ${token}`)
    })
  }

  
  // fetch recommended matches data from third api 
  getAllRecommededMatches() : Observable<any>{
    
    const token = localStorage.getItem('bearerToken');
    return this.http.get<any>('http://localhost:7777/cricketmatch/api/getAllRecommeded',{
      headers: new HttpHeaders().set("Authorization",`Bearer ${token}`)})
  }

  fetChAllMatches(){
    const token = localStorage.getItem('bearerToken');
    return this.http.get<any>('http://localhost:7777/cricketmatch/api/getAllRecommeded',{
      headers: new HttpHeaders().set("Authorization",`Bearer ${token}`)}).subscribe(response =>{
        console.log('service',response.newMatches);
        this.matches=response.newMatches;
        console.log(this.matches);
        this.matchSubject.next(this.matches);
      });

 
  }

  getAllNewMatches(){
    return this.matchSubject;
  }
  // un recommend the recommended match
  unRecommendNewMatch(match : NewMatch) : Observable<any>{
    const email : string = localStorage.getItem('user');
    const token = localStorage.getItem('bearerToken');
    return this.http.delete<any>(`http://localhost:7777/cricketmatch/api/unrecommed/${match.matchId}/${email}`,{
      headers: new HttpHeaders().set("Authorization",`Bearer ${token}`)
    });
    // this.getAllRecommededMatches();
  }
  
}
