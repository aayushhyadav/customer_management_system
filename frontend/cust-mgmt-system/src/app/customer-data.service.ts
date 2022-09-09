import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from './Customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerDataService {

  constructor(private _http: HttpClient) { }

  baseUrl = 'http://localhost:8080/customer';
  customerList: Array<Customer> = [];
  customerId: number = -1;
  curCustomerId: number = Math.ceil(Math.random() * 100000);

  getAllCustomers(): Observable<Array<Customer>> {
    return this._http.get<Array<Customer>>(this.baseUrl);
  }

  addCustomer(customer: Customer): Observable<Customer> {
    return this._http.post<Customer>(this.baseUrl, customer);
  }

  deleteCustomer(customerId: number): Observable<Object> {
    return this._http.delete(`${this.baseUrl}/${customerId}`);
  }

  updateCustomer(customer: Customer): Observable<Customer> {
    return this._http.put<Customer>(this.baseUrl, customer);
  }

  updateCustomerList(customerList: Array<Customer>): void {
    this.customerList = customerList;
  }

  updateCurCustomer(): void {
    this.curCustomerId += 1;
  }

  getCustomerById(customerId: number): Observable<Customer> {
    return this._http.get<Customer>(`${this.baseUrl}/${customerId}`);
  }
}
