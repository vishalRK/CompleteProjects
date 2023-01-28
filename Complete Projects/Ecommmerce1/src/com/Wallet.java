package com;
import java.util.*;
public class Wallet {

	ArrayList<User> l;
	String name;
	static double total_Balance;
	public void walletMenu(ArrayList<User> blanceList,String user_name)
	{
		Scanner sc = new Scanner(System.in);
		l = blanceList;
		name = user_name;
		
		try
		{
			System.out.print("1. for Wallet Balance\n2. for Add Wallet Balance");
			int n = sc.nextInt();
			switch(n)
			{
				case 1: walllet_balance(l,name);
				break;
				case 2: walllet_Setbalance();
				break;
				default:
					System.out.println("You enter Wrong Operations");
					walletMenu(l,name);
			}
			
		}
		catch(Exception e)
		{
			walletMenu(l,name);
		}
	}
	public void walllet_balance(ArrayList<User> blanceList,String user_name)
	
	{
		l = blanceList;
		name = user_name;
		ArrayList<User> balance = blanceList;
		
		for(User u : balance)
			
		{
			if(user_name.equals(u.getUserName()))
			{
				total_Balance = u.getBalance();
				System.out.println("your total balance is : "+total_Balance);
			}
				
		}
		//System.out.println("Welecome to wallet");
	}
public void walllet_Setbalance()
	
	{
		Scanner sc = new Scanner(System.in);
	
		double money = 0;
		ArrayList<User> balance = l;
		try
		{
			boolean b = false;
			do
			{
				System.out.print("Add Money : ");
				money = sc.nextDouble();
				for(User u : balance)
					
				{
					if(name.equals(u.getUserName()))
					{
						
						if(money > 0)
						{
							total_Balance += money;
							
							u.setBalance(total_Balance);
							b= false;
						}
						else
						{
							b = true;
						}
						
					}
						
				}
			}while(b == true);
			
		}
		catch(Exception e)
		{
			System.out.println("please enter only number ");
			walllet_Setbalance();
		}
		
		//System.out.println("Welecome to wallet");
	}
}
