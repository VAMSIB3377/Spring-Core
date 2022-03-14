package com.spring.core.assignments_1;

import org.springframework.stereotype.Repository;

@Repository
public class Customer {
	
	private int customerId;
	private String customerName;
	private long customerContact;
	private Address customerAddress;
	
	
	public Customer(int customerId, String customerName, long customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + "]";
	}
	
	
	
	
	

}
