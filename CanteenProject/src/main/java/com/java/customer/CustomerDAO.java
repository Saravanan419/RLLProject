package com.java.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.jdbc.*;

public class CustomerDAO {
	Connection connection;
	PreparedStatement pst;
	
	public String addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Customer1(customerid,customername,customerstate,customercity,customeremail,customerno )   "
				+ " values(?,?,?,?,?,?) ";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, customer.getCustomerid());
		pst.setString(2, customer.getCustomername());
		pst.setString(3, customer.getCustomerstate());
		pst.setString(4, customer.getCustomercity());
		pst.setString(5, customer.getCustomeremail());
		pst.setString(6, customer.getCustomerno());
		pst.executeUpdate();
		return "Record Inserted...";
	}

	public Customer searchCustomer(int customerid) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from customer1 where customerid=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, customerid);
		ResultSet mn = pst.executeQuery();
		Customer customer = null;
		if (mn.next()) {
			customer = new Customer();
			customer.setCustomerid(mn.getInt("customerid"));
			customer.setCustomername(mn.getString("customername"));;
			customer.setCustomerstate(mn.getString("customerstate"));
			customer.setCustomercity(mn.getString("customercity"));
			customer.setCustomeremail(mn.getString("customeremail"));
			customer.setCustomerno(mn.getString("customerno"));
		}
		return customer;

	}
	public List<Customer> showCustomer() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Customer1";
		pst = connection.prepareStatement(cmd);
		ResultSet mn = pst.executeQuery();
		List<Customer> CustomerList = new ArrayList<Customer>();
		Customer customer = null; 
		while(mn.next()) {
			customer = new Customer();
			customer.setCustomerid(mn.getInt("customerid"));
			customer.setCustomername(mn.getString("customername"));
			customer.setCustomerstate(mn.getString("customerstate"));
			customer.setCustomercity(mn.getString("customercity"));
			customer.setCustomeremail(mn.getString("customeremail"));
			customer.setCustomerno(mn.getString("customerno"));
			CustomerList.add(customer );
		}
		return CustomerList;
	}

}

