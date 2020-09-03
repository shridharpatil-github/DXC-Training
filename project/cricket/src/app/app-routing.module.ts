import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UpcomingMatchesComponent } from './upcoming-matches/upcoming-matches.component';
import { OldMatchesComponent } from './old-matches/old-matches.component';
import { NewMatchesComponent } from './new-matches/new-matches.component';
import { HomeComponent } from './home/home.component';
import { RecommendedComponent } from './recommended/recommended.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import {AuthGuardService } from './auth-guard.service';
import { FaveriteComponent } from './faverite/faverite.component';
import { ProfileComponent } from './profile/profile.component';

export const routes: Routes = [
  {path : '', component : HomeComponent},
  {path : 'up-coming-matches', component : UpcomingMatchesComponent},
  {path : 'old-matches', component : OldMatchesComponent},
  {path : 'new-matches', component : NewMatchesComponent},
  {path : 'recommended-matches', component : RecommendedComponent, canActivate : [AuthGuardService]},
  {path : 'login', component: LoginComponent},
  {path : 'register', component : RegisterComponent},
  {path : 'faverites', component : FaveriteComponent, canActivate : [AuthGuardService]},
  {path : 'profile', component : ProfileComponent, canActivate : [AuthGuardService]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
