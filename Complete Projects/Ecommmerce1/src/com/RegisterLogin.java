package com;

import java.util.ArrayList;
import java.util.Scanner;

public class RegisterLogin {
	
	
	Register user_register = new Register();
	MainMenu n = new MainMenu();
	static ArrayList<Products> plist = new ArrayList<>();
	
	Login l = new Login();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegisterLogin r = new RegisterLogin();
		
		plist.add(new Products(01,"Apple ipad",95000,1));
		plist.add(new Products(02,"Samsug A33",87000,6));
		plist.add(new Products(03,"Iphone 11",78000,8));
		plist.add(new Products(04,"Realme c3",20000,20));
		plist.add(new Products(05,"Asus rog 2",35000,20));
		plist.add(new Products(06,"Google Pixel",65000,15));
		
		r.userRegisterLogin();
		
		
		
	}
	public  void userRegisterLogin()
	{
		user_register.userlist.add(new User("Vishal","Vishal12@","vishalkerlekar4@gmail.cmom","3422424242",500,null));
//		user_register.userlist.add(new User("username","password","Ram23@gmail.com","234242342",200,null));
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" ************* Welcome to Ecommerce Store ************** \n\n1. for Register \n2. for Login ");
		
		
		
		
		try
		{
			System.out.print("\nEnter your Choice : =  ");
			int choice_1  = sc.nextInt();
			
			boolean user_ask = true;
			
				switch(choice_1)
				{
				case 1: user_register.user_Register();
					
						
							break;
				case 2 :    
					
					//System.out.println("Login Sucessfull");
						l.login(user_register.userlist,n.user_product_list);
							break;
							
				case 3 : System.out.println("display users");
						user_register.display();
						break;
			
				default:    
					System.out.println("You chose Wrong option");
					userRegisterLogin();
				}
				System.out.println("\nDo you want to continue 1 for yes or 0 for no : ");
				int user_ask1 = sc.nextInt();
				if(user_ask1 == 1)
				{
					l.login(user_register.userlist,n.user_product_list);
					
				}
				else
				{
					System.out.println("\nsuccessfully registered");
					userRegisterLogin();
				}
				
				
			
		}catch(Exception e)
		{
			System.out.println("You enter Wrong input");
			userRegisterLogin();
		}
	}
	
	

}
