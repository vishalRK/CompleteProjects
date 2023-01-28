package com;

public class OrderList {
	int P_id;
	String P_name;
	int P_quantity;
	double P_Price;
	
	public OrderList(int p_id, String p_name, int p_quantity, double p_Price) {
		
		P_id = p_id;
		P_name = p_name;
		P_quantity = p_quantity;
		P_Price = p_Price;
	}
	
	public int getP_id() {
		return P_id;
	}
	public void setP_id(int p_id) {
		P_id = p_id;
	}
	public String getP_name() {
		return P_name;
	}
	public void setP_name(String p_name) {
		P_name = p_name;
	}
	public int getP_quantity() {
		return P_quantity;
	}
	public void setP_quantity(int p_quantity) {
		P_quantity = p_quantity;
	}
	public double getP_Price() {
		return P_Price;
	}
	public void setP_Price(double p_Price) {
		P_Price = p_Price;
	}
	
}
