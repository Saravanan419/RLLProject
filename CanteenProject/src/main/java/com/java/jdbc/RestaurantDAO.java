package com.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RestaurantDAO {
	Connection connection;
	PreparedStatement pst;
	private int restaurantid;
	
	public String addRestaurant(Restaurant restaurant) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Restaurant(restaurantid,restaurantname,city,branch,email,contactno)"
				             + "values(?,?,?,?,?,?) ";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1,  restaurant.getRestaurantid());
		pst.setString(2,  restaurant.getRestauratname());
		pst.setString(3,  restaurant.getCity());
		pst.setString(4,  restaurant.getBranch());
		pst.setString(5,  restaurant.getEmail());
		pst.setString(6,  restaurant.getContactno());
		pst.executeUpdate();
		return "Record Inserted..";
	}
	

	
	public Restaurant searchRestaurant(int restaurantid) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Restaurant where restaurantid=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, restaurantid);
		ResultSet rs = pst.executeQuery();
		Restaurant restaurant1 = null;
		if (rs.next()) {
			restaurant1 = new Restaurant();
			restaurant1 .setRestaurantid(rs.getInt("restaurantid"));
			restaurant1 .setRestauratname(rs.getString("restaurantname"));
			restaurant1 .setCity(rs.getString("city"));
			restaurant1 .setBranch(rs.getString("branch"));
			restaurant1 .setEmail(rs.getString("email"));
			restaurant1 .setContactno(rs.getString("contactno"));
		}
		return restaurant1 ;
	}
	
	public List<Restaurant> showRestaurant() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Restaurant";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Restaurant> restaurantList = new ArrayList<Restaurant>();
		Restaurant restaurant = null; 
		while(rs.next()) {
			restaurant = new Restaurant();
			restaurant .setRestaurantid(rs.getInt("restaurantid"));
			restaurant.setRestauratname(rs.getString("restaurantname"));
			restaurant .setCity(rs.getString("city"));
			restaurant .setBranch(rs.getString("branch"));
			restaurant .setEmail(rs.getString("email"));
			restaurant.setContactno(rs.getString("contactno"));
			
			restaurantList.add(restaurant );
		}
		return restaurantList;
	}
}


