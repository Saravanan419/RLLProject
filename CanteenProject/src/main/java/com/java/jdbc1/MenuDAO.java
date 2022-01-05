package com.java.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.java.jdbc.*;

public class MenuDAO {

	Connection connection;
	PreparedStatement pst;

	public String addMenu(Menu menu) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Menu(restrauntid,menuid,itemname,menutype,calories,price)"
				             + "values(?,?,?,?,?,?) ";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1,  menu.getRestuarantid());
		pst.setInt(2,  menu.getMenuid());
		pst.setString(3,  menu.getItemname());
		pst.setString(4,  menu.getMenutype());
		pst.setInt(5,  menu.getCalories());
		pst.setDouble(6,  menu.getPrice());
		pst.executeUpdate();
		return "Record Inserted..";
	}
	

	
	public Menu searchMenu(int menuid) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from menu where restrauntid=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, menuid);
		ResultSet mn = pst.executeQuery();
		Menu menu = null;
		if (mn.next()) {
			menu = new Menu();
			menu.setMenuid(mn.getInt("menuid"));
			menu.setRestuarantid(mn.getInt("restrauntid"));
			menu.setItemname(mn.getString("itemname"));
			menu.setMenutype(mn.getString("menutype"));
			menu.setCalories(mn.getInt("calories"));
			menu.setPrice(mn.getInt("price"));
		}
		return menu;

	}
	public List<Menu> showMenu() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Menu";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Menu> MenuList = new ArrayList<Menu>();
		Menu menu = null; 
		while(rs.next()) {
			menu = new Menu();
			menu .setRestuarantid(rs.getInt("restrauntid"));
			menu.setMenuid(rs.getInt("menuid"));
			menu .setItemname(rs.getString("itemname"));
			menu .setMenutype(rs.getString("menutype"));
			menu .setCalories(rs.getInt("calories"));
			menu .setPrice(rs.getDouble("price"));
			MenuList.add(menu );
		}
		return MenuList;
	}

}
