import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes} from '@angular/router';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { FlightDetailsComponent } from './flight-details/flight-details.component';
import { SignupComponent } from './signup/signup.component';
import { PaymentEntryComponent } from './payment-entry/payment-entry.component';
import { ConfirmationComponent } from './confirmation/confirmation.component';
import { SuccessfulComponent } from './successful/successful.component';
import { TripModeComponent } from './trip-mode/trip-mode.component';
import { SuccessfulPaymentComponent } from './successful-payment/successful-payment.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { LandmarksComponent } from './landmarks/landmarks.component';
import { HomepageComponent } from './homepage/homepage.component';
import { DestinationComponent } from './destination/destination.component';
import { HistoryComponent } from './history/history.component';
import { TripDetailsComponent } from './trip-details/trip-details.component';
import { UserAccountComponent } from './user-account/user-account.component';


const appRoutes : Routes = [
  {path:'', component:WelcomeComponent},
  {path:'signin', component:LoginComponent},
  {path:'signup', component:SignupComponent},
  {path:'home', component:HomepageComponent},
  {path:'successful', component:SuccessfulComponent},
  {path:'destination', component:DestinationComponent},
  {path:'landmarks', component:LandmarksComponent},
  {path:'trip_details', component:TripDetailsComponent},
  {path:'flight_details', component:FlightDetailsComponent},
  {path:'user_account', component:UserAccountComponent},
  {path:'trip_mode', component:TripModeComponent},
  {path:'history', component:HistoryComponent},
  {path:'confirmation',component :ConfirmationComponent},
  {path:'payment', component:PaymentEntryComponent},
  {path:'payment_sucess', component:SuccessfulPaymentComponent}
  
]

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    FlightDetailsComponent,
    SignupComponent,
    PaymentEntryComponent,
    ConfirmationComponent,
    SuccessfulComponent,
    TripModeComponent,
    SuccessfulPaymentComponent,
    WelcomeComponent,
    LandmarksComponent,
    HomepageComponent,
    DestinationComponent,
    HistoryComponent,
    TripDetailsComponent,
    UserAccountComponent,
    
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
