package com.cjk.customer.model;

public class customerCJK {

	String custId;
	String name;
	String age;

	public customerCJK(String custId, String name, String age) {
		this.name = name;
		this.custId = custId;
		this.age = age;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge(){
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String toString(){
		return "Customer: CustId = "+ custId +", Name = " +name + "Age = " +age;
	}
}
