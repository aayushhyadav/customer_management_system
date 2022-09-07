import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void {
    this.router.navigate(['/view-customers']);
  }
}
