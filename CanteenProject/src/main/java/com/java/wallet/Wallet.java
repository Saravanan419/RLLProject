package com.java.wallet;

public class Wallet {
private int customerid;
private int walletid;
private String wallettype;
private int amount;
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public int getWalletid() {
	return walletid;
}
public void setWalletid(int walletid) {
	this.walletid = walletid;
}
public String getWallettype() {
	return wallettype;
}
public void setWallettype(String wallettype) {
	this.wallettype = wallettype;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "Wallet [customerid=" + customerid + ", walletid=" + walletid + ", wallettype=" + wallettype + ", amount="
			+ amount + "]";
}

}
