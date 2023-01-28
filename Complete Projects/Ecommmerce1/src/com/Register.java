package com;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class Register {
		
//		ArrayList<User> l = new ArrayList();
		protected String user_name;
		private String user_pass;
		protected String user_email;
		protected String user_phno;
		 static ArrayList<User> userlist = new ArrayList<>();
		 
		public void user_Register()
		{
			
				//Scanner sc = new Scanner(System.in);
//				if(userlist.contains(user_name))
//				{
//					
//					System.out.println("User is already Register");
//					user_Register();
//				}
//				else 
//				{
					
			
			Scanner sc = new Scanner(System.in);
			
	       
				//userName Validation
	        	boolean check_username = false;
	            do
	            {
	            	System.out.print("Enter user name : ");
	            	
	            	 user_name = sc.nextLine();
//		            System.out.println(isValidUsername("1Vishal"));
		           if(isValidUsername(user_name))
		           {
		        	  check_username = false;
		           }
		           else
		           {
		        	   check_username = true;
		        	   System.out.println("\n***** you can not  use number at the start*****\n");
		           }
		            
	            }while(check_username == true);
	            
	            //Password Validation
	            boolean check_userpass = true;
	            do
	            {
	            	System.out.print("Enter user Password : ");
	            	user_pass = sc.nextLine();
	            	
	            	
	            		if(isValidUserpassword(user_pass))
				           {
	            				break;
				           }
				           else
				           {
				        	   check_userpass = true;
				        	   System.out.println("\n***** password should be greater than 8 and less than 20 and password mut be include at least 1=>Uppercase 1=>special character 1=>number 1=>lowercase *****\n");
				           }
	            	
	            	
			            
	            }while(check_userpass = true);
//	            
	            boolean check_userEmail = true;
	            do
	            {
	            	System.out.print("Enter user Email ID : ");
	            	user_email = sc.nextLine();
	            	
	            	
	            		if(isValidUserEmail(user_email))
				           {
	            			break;
	            			
				           }
				           else
				           {
				        	   check_userEmail = true;
				        	   System.out.println("\n***** Your email is not valid please enter valid email ex:examl@gmail.com *****\n");
				           }
	            	
	            	
			            
	            }while(check_userEmail = true);
	            boolean check_userPhno = true;
	            do
	            {
	            	System.out.print("Enter user Phone Number : ");
	            	user_phno = sc.nextLine();
	            	
	            	
	            		if(isValidUserPhno(user_phno))
				           {
	            			  break;
				           }
				           else
				           {
				        	   check_userPhno = true;
				        	   System.out.println("\n*****  use only number \nand number not should be greater than 10 or less than 10\n number can start between 7 to 9 *****\n");
				        	   
				           }
	            	
	            	
			            
	            }while(check_userPhno = true);
//	            System.out.println("Enter password : ");
//	            String p = sc.nextLine();

	            //l.add(new User(n, p));

//	            System.out.println("enter choice");
//	            int c = sc.nextInt();
//	            if (c == 1) {
//	            	user_Register();
//	            } else {
//	                i = 2;
//	                System.out.println("Thank you for register");
//	            }
	            //addUser("Vishal","Vishal12@","vishalkerlekar5@gmail.com","9619181626");
	            addUser(user_name, user_pass, user_email, user_phno);
//	            System.out.println("enter choice");
//	            int c = sc.nextInt();
//	            if (c == 1) {
//	            	user_Register();
//	            } else {
//	                i = 2;
//	            }

	        
	        
				
			 
	        

		}
		public static boolean isValidUsername(String name)
	    {
	  
	        // Regex to check valid username.
	        String regex = "^[A-Za-z]\\w{5,29}+$";
	  
	        // Compile the ReGex
	        Pattern p = Pattern.compile(regex);
	  
	        // If the username is empty
	        // return false
	        if (name == null) {
	            return false;
	        }
	  
	        // Pattern class contains matcher() method
	        // to find matching between given username
	        // and regular expression.
	        Matcher m = p.matcher(name);
	  
	        // Return if the username
	        // matched the ReGex
	        return m.matches();
	    }
		public static boolean isValidUserpassword(String userPassword)
		{
			// Regex to check valid username.
	        String regex = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";
	  
	        // Compile the ReGex
	        Pattern p = Pattern.compile(regex);
	  
	        // If the username is empty
	        // return false
	        if (userPassword == null) {
	            return false;
	        }
	  
	        // Pattern class contains matcher() method
	        // to find matching between given username
	        // and regular expression.
	        Matcher m = p.matcher(userPassword);
	  
	        // Return if the username
	        // matched the ReGex
	        return m.matches();
		}
		public static boolean isValidUserEmail(String userEmailId)
		{
			// Regex to check valid username.
	        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	  
	        // Compile the ReGex
	        Pattern p = Pattern.compile(regex);
	  
	        // If the username is empty
	        // return false
	        if (userEmailId == null) {
	            return false;
	        }
	  
	        // Pattern class contains matcher() method
	        // to find matching between given username
	        // and regular expression.
	        Matcher m = p.matcher(userEmailId);
	  
	        // Return if the username
	        // matched the ReGex
	        return m.matches();
		}
		public static boolean isValidUserPhno(String userPhno)
		{
			// Regex to check valid username.
	        String regex = "(0/91)?[7-9][0-9]{9}";
	  
	        // Compile the ReGex
	        Pattern p = Pattern.compile(regex);
	  
	        // If the username is empty
	        // return false
	        if (userPhno == null) {
	            return false;
	        }
	  
	        // Pattern class contains matcher() method
	        // to find matching between given username
	        // and regular expression.
	        Matcher m = p.matcher(userPhno);
	  
	        // Return if the username
	        // matched the ReGex
	        
	        return m.matches();
		}
		public void addUser(String user_name,String user_pass,String user_email,String user_phno)
		{
			userlist.add(new User(user_name,user_pass,user_email,user_phno,0.0,null));
		}
		public void display()
		{
			System.out.println("usernames\tuser emails\t\tuser Phone number\twalletBalance");
			//System.out.println(addUser.size());
			for(User u : userlist)
			{
				System.out.println(u.getUserName()+"\t\t"+u.getUserEmail()+"\t"+u.getUserPhno()+"\t"+u.getBalance());
			}
			
		}
		public  ArrayList<User> userListre()
		{
			ArrayList <User> l = new ArrayList<User>(userlist);
			return l;
		}
		
		

}
