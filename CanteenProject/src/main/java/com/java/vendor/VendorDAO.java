package com.java.vendor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.java.jdbc.ConnectionHelper;

public class VendorDAO {
	Connection connection;
	PreparedStatement pst;
	private int vendorid;
	
	public String addVendor(Vendor vendor) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Vendor(vendorid,vendorname,vendorstate,vendorcity,vendoremail,vendornumber )   "
				+ " values(?,?,?,?,?,?) ";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, vendor.getVendorid());
		pst.setString(2, vendor.getVendorname());
		pst.setString(3, vendor.getVendorstate());
		pst.setString(4, vendor.getVendorcity());
		pst.setString(5, vendor.getVendoremail());
		pst.setString(6, vendor.getVendornumber());
		pst.executeUpdate();
		return "Record Inserted...";
	}

	public Vendor searchVendor(int vendorid) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Vendor where vendorid=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, vendorid);
		ResultSet rs = pst.executeQuery();
		Vendor vendor = null;
		if (rs.next()) {
			vendor = new Vendor();
			vendor .setVendorid(rs.getInt("vendorid"));
			vendor .setVendorname(rs.getString("vendorname"));
			vendor .setVendorstate(rs.getString("vendorstate"));
			vendor .setVendorcity(rs.getString("vendorcity"));
			vendor .setVendoremail(rs.getString("vendoremail"));
			vendor .setVendornumber(rs.getString("vendornumber"));
		}
		return vendor ;
	}
	
	public List<Vendor> showVendor() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Vendor";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Vendor> vendorList = new ArrayList<Vendor>();
		Vendor vendor = null; 
		while(rs.next()) {
			vendor  = new Vendor();
			vendor .setVendorid(rs.getInt("vendorid"));
			vendor .setVendorname(rs.getString("vendorname"));
			vendor  .setVendorstate(rs.getString("vendorstate"));
			vendor  .setVendorcity(rs.getString("vendorcity"));
			vendor  .setVendoremail(rs.getString("vendoremail"));
			vendor  .setVendornumber(rs.getString("vendornumber"));
			vendorList.add(vendor );
		}
		return vendorList;
	}
}


