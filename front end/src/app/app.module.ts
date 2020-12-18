import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { NumDataService } from './services/num-data.service'
import { AppComponent } from './app.component';
import { NumDataComponent } from './component/num-data/num-data.component';
import { VerifyNumberComponent } from './component/verify-number/verify-number.component';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: 'verify', component: VerifyNumberComponent },
  { path: 'data', component: NumDataComponent },
  { path: '', redirectTo: '/data', pathMatch: 'full' },
  { path: '**', redirectTo: '/data', pathMatch: 'full' }
];

@NgModule({
  declarations: [
    AppComponent,
    NumDataComponent,
    VerifyNumberComponent
  ],
  imports: [
    RouterModule.forRoot(routes),
    BrowserModule,
    HttpClientModule
  ],
  providers: [NumDataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
