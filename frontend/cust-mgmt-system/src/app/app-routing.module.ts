import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { ViewCustomerComponent } from './view-customer/view-customer.component';

const routes: Routes = [
  {path:'create-customer', component:CreateCustomerComponent},
  {path:'view-customer', component:ViewCustomerComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
