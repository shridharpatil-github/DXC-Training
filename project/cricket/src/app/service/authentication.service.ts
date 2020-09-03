import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {
  status : boolean;
  email : string;
  constructor(private http : HttpClient) { }

  getStatus() : boolean{
    return this.status;
  }

  setStatus(status : boolean){
    this.status = status;
  }

  setEmail( email : string){
    localStorage.setItem('user',email);
  }

  getEmail() : string{
    return localStorage.getItem('user');
  }

  setBearerToken(token)
  {
    localStorage.setItem('bearerToken',token);

  }
  getBearerToken()
  {
    return localStorage.getItem('bearerToken');
  }

login(user : User) : Observable<any>
{
  return this.http.get<any>(`http://localhost:8888/cricketmatch/user/api/login/${user.email}/${user.password}`);
}

  logout(){
    localStorage.clear();
    return this.http.get<any>(`http://localhost:8888/cricketmatch/user/api/logout`);
  }

  registerUser(user : User) :Observable<any> {
    return this.http.post<any>(`http://localhost:8888/cricketmatch/user/api/addUser`,user);
  }
  getUserDetails() : Observable<any>{
    const email : string = localStorage.getItem('user');
    return this.http.get<any>(`http://localhost:8888/cricketmatch/user/api/getUser/${email}`);
  }
  updateProfile(user :User, file :File) : Observable<any>{
    return this.http.put<any>(`http://localhost:8888/cricketmatch/user/api/updateProfile`,user);
  }
}
