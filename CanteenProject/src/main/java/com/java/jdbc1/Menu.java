package com.java.jdbc1;

public class Menu {
	private int restuarantid;
	private int menuid;
	private String itemname;
	private String menutype;
	private int calories;
	private double price;
	public int getRestuarantid() {
		return restuarantid;
	}
	public void setRestuarantid(int restuarantid) {
		this.restuarantid = restuarantid;
	}
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getMenutype() {
		return menutype;
	}
	public void setMenutype(String menutype) {
		this.menutype = menutype;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Menu [restuarantid=" + restuarantid + ", menuid=" + menuid + ", itemname=" + itemname + ", menutype="
				+ menutype + ", calories=" + calories + ", price=" + price + "]";
	}

	
}
