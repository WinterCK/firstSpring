package com.cjk.customer.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.cjk.customer.model.customerCJK;
import com.cjk.customer.model.dao.CustomerDAO;

public class JdbcCustomerDAO implements CustomerDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insert(customerCJK customer) {
		String sql = "INSERT INTO CUSTOMERCJK" +
				"(CUST_ID, NAME, AGE) VALUES(?,?,?)";
		Connection conn = null;
		
		try{
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, customer.getCustId());
			ps.setString(2, customer.getName());
			ps.setString(3, customer.getAge());
			ps.executeUpdate();
			ps.close();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			if(conn != null) {
				try{
					conn.close();
				}catch (SQLException e) {
					//²»Å×³öÒì³£
				}
			}
		}
	}
	
	public customerCJK findByCustomerId(String custId){
		
		String sql = "SELECT * FROM CUSTOMERCJK WHERE CUST_ID = ?";
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, custId);
			customerCJK customer =null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				customer = new customerCJK(rs.getString("CUST_ID"),
						rs.getString("NAME"),
						rs.getString("AGE"));
			}
			rs.close();
			ps.close();
			return customer;
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			if (conn != null) {
				try{
					conn.close();
				}catch (SQLException e) {}
			}
		}
	}
}
