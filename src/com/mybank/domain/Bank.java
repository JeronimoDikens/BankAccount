package com.mybank.domain;


public class Bank {
		private Customer[] customer;
		private int numberOfCustomer;
		
		public Bank() {
			customer = new Customer[10];
			numberOfCustomer = 0;
			
		};
		
		public void addCustomer(String f, String  l) {
			int i = numberOfCustomer++;
			customer[i] = new Customer(f, l);
		}
		
		public int getNumOfCustomers() {
			return numberOfCustomer;
		}
		
		public Customer getCustomer(int index) {
			return customer[index];
		}

}
