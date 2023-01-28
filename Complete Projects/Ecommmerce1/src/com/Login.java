package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
	 String user_name;
	 String user_psword;
	 double walet ;
	 
	 ArrayList<Products> p1;
//	 Register r = new Register();
	
	 MainMenu m = new MainMenu();
	Wallet b = new Wallet();
	static ArrayList<Products> ol = new ArrayList<>();
	
	public void login(ArrayList<User>user ,ArrayList<Products> user1) {
		// TODO Auto-generated constructor stub
		 RegisterLogin r = new RegisterLogin();
			Scanner sc = new Scanner(System.in);
			ArrayList<User> l = user;
			ArrayList<Products> l1 = user1;
			//ArrayList<Products>  new_user_list = 
		
			

			System.out.println("********* Welcome to Login Page *********** ");
		
		 	System.out.print("Enter Username : = ");
		 	user_name = sc.nextLine();

	        System.out.print("Enter Password : = ");
	        user_psword = sc.nextLine();
	        
//	        System.out.println(findUsingEnhancedForLoop(user_name,user_psword,l));
	        
	        boolean login_success = findUsingEnhancedForLoop(user_name,user_psword,l,l1);
	        
	        if(login_success == true)
	        {
	        	System.out.println("Login Successfull");
	        	
	        	
	        	m.displayMenu(user,user_name);
	        }
	        else
	        {
	        	System.out.println("You enter Wrong information");
//	        	login(user, user1);
	        	r.userRegisterLogin();
	        	
	        }
	        
	        
	        
	}
	public  boolean findUsingEnhancedForLoop(
            String user_name, String user_psword,ArrayList<User> user,ArrayList<Products> p) {
		
//		ArrayList<Products> temp = p;

        for (User userl : user) {
            
            	
            		if (userl.getUserName().equals(user_name) && userl.getUserpass().equals(user_psword)) {
            			
                    	System.out.println("Login scuccessfull"+userl.userName);
                    	
                    	walet = userl.balance; 
                    	p1= userl.product_list ;
            	
                return true;
            }
        }
        return false;
    }
	
}
