import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import { UpcomingMatchesComponent } from './upcoming-matches/upcoming-matches.component';
import { OldMatchesComponent } from './old-matches/old-matches.component';
import { NewMatchesComponent } from './new-matches/new-matches.component';
import { RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { FooterComponent } from './footer/footer.component';
import { SearchMatchesPipe } from './search-matches.pipe';
import { FormsModule } from '@angular/forms';
import { RecommendedComponent } from './recommended/recommended.component';
import { ToastrModule} from 'ngx-toastr';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { FaveriteComponent } from './faverite/faverite.component';
import { ProfileComponent } from './profile/profile.component';

@NgModule({
  declarations: [
    AppComponent,
    UpcomingMatchesComponent,
    OldMatchesComponent,
    NewMatchesComponent,
    HeaderComponent,
    HomeComponent,
    FooterComponent,
    SearchMatchesPipe,
    RecommendedComponent,
    RegisterComponent,
    LoginComponent,
    FaveriteComponent,
    ProfileComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    ToastrModule.forRoot({
      progressBar: true,
      timeOut: 3000,
      positionClass: 'toast-top-center',
      preventDuplicates: false,
    }),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
