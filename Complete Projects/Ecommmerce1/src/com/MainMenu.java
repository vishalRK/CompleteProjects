package com;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainMenu   {
	
	
	ArrayList<Products> user_product_list = new ArrayList<>();
	Register user_register = new Register();
	
	Wallet w = new Wallet();
	ViewCart v = new ViewCart();
//	v.user_products=new Arraylist<Products>();
	
	
	
	//ArrayList<Products> adList = new ArrayList<>();
		public void displayMenu(ArrayList<User> loginlist,String user_name)
		{
			//RegisterLogin r = new RegisterLogin();
			Login u_logn = new Login();
			RegisterLogin again = new RegisterLogin();
			RegisterLogin list = new RegisterLogin();
			Scanner sc = new Scanner(System.in);
			
			System.out.print("\n1.Home \n2.View Cart\n3.Wallet\n4.Logout");
			
			
			try
			{
				System.out.print("\n\nEnter a Choice : ");
				
				int user = sc.nextInt();
				
				switch(user)
				{
						case 1: displayProducts(list.plist,loginlist,user_name);
								//AddtoCart();
							break;
						case 2:System.out.println("Hello"); 
							v.viewCart(loginlist,user_name);
						break;
						case 3: w.walletMenu(loginlist, user_name);
							break;
						case 4://u_logn.login(loginlist,user_product_list);
							again.userRegisterLogin();
						break;
						default:
							displayMenu(loginlist,user_name);
				}
				boolean b = false;
				do
				{
					try
					{
						System.out.println("\nDo you want to  back menu press 0: ");
						int user_ask1 = sc.nextInt();
						switch(user_ask1 )
						{
						case 0:
							displayMenu(loginlist,user_name);
							break;
							default:
								b=true;
								break;
						
						}
						
					}catch(Exception e)
					{
						System.out.println("enter only numbers ");
						b = false;
						displayMenu(loginlist,user_name);
					}
				}while(b == true);
				
			}catch(Exception e)
			{
				System.out.println("You enter wrong option!! please select valid options");
				displayMenu(loginlist, user_name);
			}
			
		}
		
			
		
			
			
		
		public void displayProducts(ArrayList<Products> list,ArrayList<User> u,String user_name)
		{	
			ArrayList<Products> tempp = list;
			//System.out.println(l.size());
			ArrayList<User> temp = u;
//			l.add(new Products(01,"Apple ipad",95000,19));
//			l.add(new Products(02,"Samsug A33",87000,6));
//			l.add(new Products(03,"Iphone 11",78000,8));
//			l.add(new Products(04,"Realme c3",20000,20));
//			l.add(new Products(05,"Asus rog 2",35000,20));
//			l.add(new Products(06,"Google Pixel",65000,15));
			System.out.println("Product ID\tProduct Name\tProduct Price\tProduct Stock");
			for(Products p : tempp)
			{
				System.out.println(p.getProduct_id()+"\t\t"+p.getProduct_Name()+"\t"+p.getPrice()+"\t\t"+p.getProduct_stock());
			}
//			System.out.println("Product ID\tProduct Name\tProduct Price\tProduct Stock");
//			for(Products p : l)
//			{
//				System.out.println(p.getProduct_id()+"\t\t"+p.getProduct_Name()+"\t"+p.getPrice()+"\t"+p.getProduct_stock());
//				
//			}
//			
//			try
//			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Add Product(product Id ) : ");
			
				int n = sc.nextInt();
				
				System.out.println("Add Quantity : = ");
				int quant = sc.nextInt();
				
				v.AddtoCart(temp,tempp,n-1,user_name,quant);
				
				
//			}catch(Exception e)
//			{
//				displayProducts(list,u,user_name);
//				
//			}
//			
			
			
			
		}
//		public void AddtoCart(ArrayList<User> u,ArrayList<Products>temp, int p_id,String usr_name)
//		{
//			//ArrayList<User> temp1 = u;
////			ArrayList<Products> temp2 = temp;
//			ArrayList<Products> tem3 = null;
//			
//			Products selected_prouct =temp.get(p_id);
//			
//			System.out.println(selected_prouct.getProduct_id()+);
////			Iterator<Products> p = selected_prouct.iterator();
////			System.out.println(p);
////			for(Products pl : temp)
////			{
//				//System.out.println();
//			
////			tem3.contains(selected_prouct);
////				if(selected_prouct.getProduct_id() == p_id-1)
////				{
//					
//					for(User u1 : u )
//					{
//						
//						
//						if(usr_name.equals(u1.getUserName()))
//						{
//							
//							u1.product_list.add(selected_prouct);
////							for(Products p: temp)
////							{
////								u1.setProduct_id(temp);
////								tem3 = u1.getProduct_id();
////								for(Products p1 : tem3)
////									{
////										if(p.getProduct_id() == p_id)
////										{
////											user_product_list.add(new Products(p.getProduct_id(),p.getProduct_Name(),p.getPrice(),p.getProduct_stock()));
////											u1.setProduct_id(user_product_list);
////											break;
//////											System.out.println(p.getProduct_id()+"\t\t"+p.getProduct_Name()+"\t"+p.getPrice()+"\t"+p.getProduct_stock());
//////											break;
////										}
////									}
////								System.out.println(user_product_list.size());
////								
////								
////							}
//						}
//						
//						
//						//u1.setProduct_id(p_id);
//						//System.out.println("Successfull SetProductId : "+u1.getProduct_id());
//							
////						for(Products p : tem3)
////						{
////							if(p.getProduct_id() == p_id)
////							{
////								System.out.println(p.getProduct_id()+"\t\t"+p.getProduct_Name()+"\t"+p.getPrice()+"\t"+p.getProduct_stock());
////								break;
////							}
////						}
//						
//						
//					}
////					
////				}
////			}
//			
//		}
//		void ViewCart(ArrayList<User> u1,String username)
//		{
////			ArrayList<User> u = u1;
////			ArrayList<Products> loginuser = userList;
//			for(User neu : u1)
//			{
////				loginuser.clear();
//				if(neu.getUserName().equals(username))
//				{
////					userList.add(neu.getProduct_id()); 
//					for(Products neww : neu.getProduct_id())
//					{
////						System.out.println(neww.getProduct_id());
//					}
//				}
//			}
//			
//		}
		
//			try
//			{
//				Scanner sc = new Scanner(System.in);
//				System.out.println("add product in cart");
//				int n = sc.nextInt();
//				
//				for(Products p : l)
//				{
//					if(n == p.getProduct_id())
//					{
//						adList.add(p);
//						l.remove(p);
//					}
//					System.out.print("Do you want to add product again : ");
//					int ask = sc.nextInt();
//					
//					if(ask == 1)
//					{
//							AddtoCart();
//					}
//					else
//					{
//						break;
//					}
//					
//					
//				}
//			}catch(Exception e)
//			{
//				
//			}
		
}

