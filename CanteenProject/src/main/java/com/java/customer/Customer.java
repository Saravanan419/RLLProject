package com.java.customer;

public class Customer {
private int customerid;
private String customername;
private String customerstate;
private String customercity;
private String customeremail;
private String customerno;

public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public String getCustomerstate() {
	return customerstate;
}
public void setCustomerstate(String customerstate) {
	this.customerstate = customerstate;
}
public String getCustomercity() {
	return customercity;
}
public void setCustomercity(String customercity) {
	this.customercity = customercity;
}
public String getCustomeremail() {
	return customeremail;
}
public void setCustomeremail(String customeremail) {
	this.customeremail = customeremail;
}
public String getCustomerno() {
	return customerno;
}
public void setCustomerno(String customerno) {
	this.customerno = customerno;
}
@Override
public String toString() {
	return "Customer [customerid=" + customerid + ", customername=" + customername + ", customerstate=" + customerstate
			+ ", customercity=" + customercity + ", customeremail=" + customeremail + ", customerno=" + customerno
			+ "]";
}

}