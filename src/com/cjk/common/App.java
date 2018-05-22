package com.cjk.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjk.customer.model.customerCJK;
import com.cjk.customer.model.dao.CustomerDAO;

public class App {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		CustomerDAO customerdao = (CustomerDAO) context.getBean("customerDAO");
		customerCJK customer = new customerCJK("3", "WinterCJK", "2");
		customerdao.insert(customer);
		
		customerCJK customer1 = customerdao.findByCustomerId("3");
		System.out.println(customer1);
	}
}
