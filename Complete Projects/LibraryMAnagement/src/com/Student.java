package com;
import java.util.*;
public class Student {
	
	
	
	String s_name;
	//String s_branch;
	String s_email;
	String s_pass;
	double s_wallet;
	


	String phno;
	ArrayList<BookStock> user_book_list = new ArrayList<>();
	
	public Student( String s_name, String s_pass, String s_email, String phno,
			ArrayList<BookStock> user_book_list) {
		
	
		this.s_name = s_name;
		this.s_pass = s_pass;
		this.s_email = s_email;
		this.phno = phno;
		this.user_book_list = new ArrayList<>();
		
	} 
	

	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	
	public String getS_email() {
		return s_email;
	}
	public void setS_email(String s_email) {
		this.s_email = s_email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public ArrayList<BookStock> getUser_book_list() {
		return user_book_list;
	}
	public void setUser_book_list(ArrayList<BookStock> user_book_list) {
		this.user_book_list = user_book_list;
	}
	public String getS_pass() {
		return s_pass;
	}


	public void setS_pass(String s_pass) {
		this.s_pass = s_pass;
	}
	public double getS_wallet() {
		return s_wallet;
	}


	public void setS_wallet(double s_wallet) {
		this.s_wallet = s_wallet;
	}
	
	
}
