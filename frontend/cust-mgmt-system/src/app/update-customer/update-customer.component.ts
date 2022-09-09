import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../Customer';
import { CustomerDataService } from '../customer-data.service';

@Component({
  selector: 'app-update-customer',
  templateUrl: './update-customer.component.html',
  styleUrls: ['./update-customer.component.css']
})
export class UpdateCustomerComponent implements OnInit {

  constructor(public customerData: CustomerDataService, private router: Router) { }

  currentCustomer: Customer = {
    customerId: -1,
    customerName: 'default',
    accType: 'DEFAULT',
    email: 'default@gmail.com',
    password: 'password'
  };

  ngOnInit(): void {
    this.customerData.getCustomerById(this.customerData.customerId).subscribe(
      data => this.currentCustomer = data
    )
  }

  onUpdate(customer: Customer): void {
    customer.customerId = this.currentCustomer.customerId;
    customer.password = this.currentCustomer.password;

    if (customer.customerName.length === 0) {
      customer.customerName = this.currentCustomer.customerName;
    }
    if (customer.accType.length === 0) {
      customer.accType = this.currentCustomer.accType;
    }
    if (customer.email.length === 0) {
      customer.email = this.currentCustomer.email;
    }

    this.customerData.updateCustomer(customer).subscribe(
      data => {
        alert('Updated successfully!');
        this.router.navigate(['view-customer']);
      }
    )
  }

}
