package com;

import java.util.Iterator;

public class Products {
	int product_id;
	String product_Name;
	double price;
	int product_stock;
	
	

	public Products(int product_id, String product_Name, double price,int product_stock) {
		
		this.product_id = product_id;
		this.product_Name = product_Name;
		this.price = price;
		this.product_stock = product_stock;
	} 
	
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getProduct_stock() {
		return product_stock;
	}

	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}

	
	
	
	
	
}
