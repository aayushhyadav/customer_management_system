import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../Customer';
import { CustomerDataService } from '../customer-data.service';

@Component({
  selector: 'app-view-customer',
  templateUrl: './view-customer.component.html',
  styleUrls: ['./view-customer.component.css']
})
export class ViewCustomerComponent implements OnInit {

  constructor(public customerData: CustomerDataService, private router: Router) { }

  fetch(): void {
    this.customerData.getAllCustomers().subscribe(
      data => this.customerData.updateCustomerList(data)
    )
  }
  ngOnInit(): void {
    this.fetch();
  }

  onDelete(customerId: number): void {
    this.customerData.deleteCustomer(customerId).subscribe(
      data => {
        this.fetch();
        setTimeout(() => alert('Deleted successfully!'), 1000);
      }
    )
  }

  onUpdate(customerId: number): void {
    this.customerData.customerId = customerId;
    this.router.navigate(['update-customer']);
  }
}
