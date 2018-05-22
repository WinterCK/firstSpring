package com.cjk.customer.model.dao;

import com.cjk.customer.model.customerCJK;

public interface CustomerDAO {

	public void insert(customerCJK customer);
	public customerCJK findByCustomerId(String custId);
	
}
