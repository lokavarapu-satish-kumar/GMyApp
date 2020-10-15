package com.ofss;

public class Customer {
String customerName;
String customerLocation;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public String getCustomerName() {
	return customerName;
}
public Customer(String customerName, String customerLocation) {
	super();
	this.customerName = customerName;
	this.customerLocation = customerLocation;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerLocation() {
	return customerLocation;
}
public void setCustomerLocation(String customerLocation) {
	this.customerLocation = customerLocation;
}

}
