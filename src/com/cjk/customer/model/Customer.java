package com.cjk.customer.model;

public class Customer {
	
	int custId;
	String name;
	int age;
	
	public Customer(int custId, String name, int age) {
		this.name = name;
		this.custId = custId;
		this.age = age;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Customer [age=" + age + ", custId=" + custId + ", name=" + name
				+ "]";
	}
}
