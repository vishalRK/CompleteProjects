package com;

import java.util.ArrayList;

public class User {

	String userName;
	private String userpass;
	String userEmail;
	String userPhno;
	double balance;
	ArrayList<Products> product_list = new ArrayList<>();
	ArrayList<Products> product_Order_list = new ArrayList<>();
	//int product_id;
	
	
	
	public User(String userName, String userpass, String userEmail, String userPhno,double balance,ArrayList<Products> product_list) {
		
		this.userName = userName;
		this.userpass = userpass;
		this.userEmail = userEmail;
		this.userPhno = userPhno;
		this.balance = balance;
		this.product_list = new ArrayList<>();
		//this.product_id = product_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhno() {
		return userPhno;
	}
	public void setUserPhno(String userPhno) {
		this.userPhno = userPhno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public ArrayList<Products> getProduct_id() {
			return product_list;
	}
	public void setProduct_id(ArrayList<Products> product_list) {
		this.product_list = product_list;
	}
	
}
