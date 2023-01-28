package com;


import java.util.ArrayList;
import java.util.Scanner;

public class ViewCart {
	
	int userIndex;
	
	int updatestock;
	int count ;
	int previous_stock;

	
	
	
	ArrayList<Products> user_products=new ArrayList<Products>();
	public void viewCart(ArrayList<User> u,String user_name)
	{
		Scanner sc = new Scanner(System.in);
		MainMenu m = new MainMenu();
		int totalprice  = 0;
		
	
		if(Register.userlist.get(userIndex).product_list.isEmpty())
		{
			
			System.out.println("!!! List is Empty !!!! please add some products ");
			m.displayMenu(u, user_name);
		}
//		for(User u1 : u)
//		{
//			if(u1.getUserName().equals(user_name))
//			{
//				for(Products p : u1.getProduct_id())
//				{
//					System.out.println(p.getProduct_id());
//				}
//			}
//		}
		
		
//		System.out.println(Register.userlist.get(userIndex).product_list.get(0).product_stock);
//		System.out.println(Register.userlist.get(userIndex).product_list.get(0).getProduct_stock());
		
		System.out.println("Product ID \tProduct Name \tProduct Quantity \t\t Product Price");
		
		
		for(Products p : 	Register.userlist.get(userIndex).product_list)
		{
			//p.setProduct_stock(p.getProduct_stock()); 
			
			
//				int updatestock = 0;
				
//				updatestock += p.getProduct_stock();
//				int total_Stok = previous_stock - (p.getProduct_stock() - updatestock);
				
				totalprice+=p.getPrice();
				System.out.println(p.getProduct_id()+"\t\t"+p.getProduct_Name()+"\t"+p.getProduct_stock()+"\t\t\t\t  "+p.getPrice());
//				for(int i = 0; i <= n1.length;i++)
//				{
//					n1[i] = p.product_id;
//				}
				//Register.userlist.get(userIndex).product_Order_list.add(new OrderList(p.getProduct_id(),p.product_Name,p.product_stock,p.price));
				//Register.userlist.get(userIndex).product_Order_list.add(p.getProduct_id()+p.getProduct_Name()+p.getProduct_stock()+p.getPrice());
				//count++;
				
			}
		System.out.println("\n\n\t\t\t\tTotal price : =   \t\t  "+totalprice);
		
		try
		{
			
			boolean b = false;
			do
			{
				System.out.println("For buy press 1 for continue and 2 for back menu : ");
				int n = sc.nextInt();
				switch (n) {
				case 1:
					if(Wallet.total_Balance >= totalprice)
					{
						System.out.println("successfully buy");
							
							Wallet.total_Balance -= totalprice;
							Register.userlist.get(userIndex).setBalance(Wallet.total_Balance);
							Register.userlist.get(userIndex).product_list.clear();
							
						
						
					}
					else
					{
						System.out.println("Insufficient balance");
					}
					break;
				case 2:
					m.displayMenu(u, user_name);
					break;
				default:
					b=true;
					break;
					
				}
			}while(b == true);
		}
		catch(Exception e)
		{
			System.out.println("Plese enter only number ");
			m.displayMenu(u, user_name);
		}
			
				
			
		
//		int userindex=-1;	
//		 for( User user:u) {
//			 if(user.getUserName().equals(username)){
//				 Register.userlist.get(0).product_list.
//		add(selected_prouct);
//			 }
//		 }
//				for(Products p : user_products)
//				{
//					System.out.println(p.getProduct_Name());
//				}
//			
			
		
		//System.out.println("Hell");
	}
	public void AddtoCart(ArrayList<User> u, ArrayList<Products> user_p,int n, String username,int quantity)
	{
		Products selected_prouct =user_p.get(n);
		
		
	 for( User user:u) {
		 if(user.getUserName().equals(username)){
			userIndex = u.indexOf(user);
			System.out.println(userIndex);
		
			
		
				
				if( selected_prouct.getProduct_stock() >= quantity)
				{
					boolean b = false;
				
					for(int i = 0; i < Register.userlist.get(userIndex).product_list.size();i++)
					{
						System.out.println(Register.userlist.get(userIndex).product_list.get(i).getProduct_id());
						if(Register.userlist.get(userIndex).product_list.get(i).getProduct_id()==selected_prouct.product_id){
								System.out.println(selected_prouct.getProduct_Name()+"is present");
								int cart_product_index = Register.userlist.get(userIndex).product_list.indexOf(selected_prouct);
								System.out.println("ghjdf"+cart_product_index);
								Register.userlist.get(userIndex).product_list.get(i).product_stock+=quantity;
								//quantity+=quantity;
								Register.userlist.get(userIndex).product_list.get(i).price+=Register.userlist.get(userIndex).product_list.get(i).price;
//									RegisterLogin.plist.get(n).setProduct_stock(RegisterLogin.plist.get(n).getProduct_stock()- quantity); 
									b = true;
								}
					
						
					}
					if(!b) {
						Register.userlist.get(userIndex).product_list.add(new Products(selected_prouct.product_id,selected_prouct.product_Name,selected_prouct.price,quantity));
					}
					
					
					//previous_stock = selected_prouct.getProduct_stock();
					
					
//						System.out.println(selected_prouct.getProduct_stock());
//						System.out.println(quantity);
						RegisterLogin.plist.get(n).setProduct_stock(RegisterLogin.plist.get(n).getProduct_stock()- quantity); 
						
					
						
						//RegisterLogin.plist.get(n).setProduct_stock(RegisterLogin.plist.get(n).getProduct_stock()- quantity); 
					//count++;
					break;
					
					
				}
				else
				{
					System.out.println("this product is out of stock");
					break;
					
				}
			
			
			
			//user_products.add(selected_prouct);
			
			
//			user_products = Register.userlist.get(userIndex).getProduct_id();
//			Register.userlist.get(userIndex).product_list.add(user_products);
//			 //Register.userlist.get(0).product_list.add(selected_prouct);
//			//Register.userlist.get(0).product_list.add(selected_prouct);
//			Register.userlist.get(userIndex).product_list.add(selected_prouct);
			 
			//Register.userlist.get(userIndex).product_list.add(selected_prouct);
		 }
	 }
			
//			 Register.userlist.get(0).product_list.add(selected_prouct);
	 		//System.out.println(user_p.get());
//			System.out.println(selected_prouct.product_Name);
			/*for(Products p : user_p)
			{
				if(p.getProduct_id() == selected_prouct.getProduct_id())
				{
					//System.out.println(p.getProduct_id()+p.getProduct_Name());
		//			user_products.add(selected_prouct);
				}
			}*/
			//user_products.add(selected_prouct);
			//System.out.println(user_products.get(0));
		
		
	}
}
