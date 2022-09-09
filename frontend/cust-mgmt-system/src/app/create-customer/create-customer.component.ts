import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../Customer';
import { CustomerDataService } from '../customer-data.service';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {

  constructor(private router: Router, private customerData: CustomerDataService) { }

  ngOnInit(): void {
  }

  onCreate(customer: Customer): void {
    customer.customerId = this.customerData.curCustomerId;
    this.customerData.updateCurCustomer();
    this.customerData.addCustomer(customer).subscribe(
      data => this.router.navigate(['view-customer'])
    )
  }
}
