package com.java.jdbc;

public class Restaurant {
	private int restaurantid;
	private String restauratname;
	private String city;
	private String branch;
	private String email;
	private String contactno;
	public int getRestaurantid() {
		return restaurantid;
	}
	public void setRestaurantid(int restaurantid) {
		this.restaurantid = restaurantid;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRestauratname() {
		return restauratname;
	}
	public void setRestauratname(String restauratname) {
		this.restauratname = restauratname;}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantid=" + restaurantid + ", restauratname=" + restauratname + ", city=" + city
				+ ", branch=" + branch + ", email=" + email + ", contactno=" + contactno + "]";
	}
	
	
	 
	}
