package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.util.*;
public class Library {
	
	protected String user_name;
	private String user_pass;
	double admin_wallet;
	int userIndex ;
	
	LocalDate issueDate;
	LocalDate returnDate;
	
	static ArrayList<AdminRegister> admin = new ArrayList<>();
	
	static ArrayList<BookStock> booklist = new ArrayList<>();
	
	static ArrayList<Student> student_list = new ArrayList<>();
	
public static void main(String[] args) {

	admin.add(new AdminRegister("Vishal","Vishal12@"));
	admin.add(new AdminRegister("Ram","Ram2@"));
	booklist.add(new BookStock(1,"Maths","Ram",234,5,null,null));
	booklist.add(new BookStock(2,"Science","Raj",230,2,null,null));
	booklist.add(new BookStock(3,"English","Ramraj",2324,3,null,null));
	Library l = new Library();
	l.displayLibrary();
}
	public  void displayLibrary()
	{
		
		System.out.println("************************* Welcome to Library *******************************");
		System.out.println("\n1.admin Register(press 1)\n2.Admin Login(press 2)\n3.Student Login");
		
		
		switch(takeInput())
		{
			case 1:System.out.println("************************* welcome to Admin Registration *******************"); 
					adminRegister();
					System.out.println("\n Successfully Registered \n");
					displayLibrary();
			break;
		
			case 2:System.out.println("************************** welcome to Admin Login ************************"); 
					adminLogin(takeInputForLoginUsername(),takeInputForLoginPassword());
					displayLibrary();
			break;
			
			case 3 :System.out.println("****************** Welcome to Student Login ***********************"); 
					student_Login(takeInputForLoginUsername(),takeInputForLoginPassword());
			break;
		
			default:System.out.println("Please enter right option");
					displayLibrary();
		}
		
	}
	
//************************************ Admin Registration ****************************************************//	
	public void adminRegister()
	{
		
		
		
		Scanner sc = new Scanner(System.in);
		
	       
	
    	boolean check_username = false;
        do
        {
        	System.out.print("Enter user name : ");
        	
        	 user_name = sc.nextLine();
        
           if(isValidUsername(user_name))
           {
        	  check_username = false;
           }
           else
           {
        	   check_username = true;
        	   System.out.println("\n*****  username should be more than 4 charater and you can not  use number at the start *****\n");
           }
            
        }while(check_username == true);
        
     
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
        admin.add(new AdminRegister(user_name,user_pass));
	}
	
	public void student_Register()
	{
		
		
		String s_name;
		//String s_branch;
		String s_email;
		String s_pass;
		String phno;
		
		Scanner sc = new Scanner(System.in);
		
	       
		//userName Validation
    	boolean check_username = false;
        do
        {
        	System.out.print("Enter user name : ");
        	
        	s_name = sc.nextLine();
//            System.out.println(isValidUsername("1Vishal"));
           if(isValidUsername(s_name))
           {
        	  check_username = false;
           }
           else
           {
        	   check_username = true;
        	   System.out.println("\n***** you can not  use number at the start and username should be more than 4 charater*****\n");
           }
            
        }while(check_username == true);
        
        //Password Validation
        boolean check_userpass = true;
        do
        {
        	System.out.print("Enter user Password : ");
        	s_pass = sc.nextLine();
        	
        	
        		if(isValidUserpassword(s_pass))
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
        	s_email = sc.nextLine();
        	
        	
        		if(isValidUserEmail(s_email))
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
        	phno = sc.nextLine();
        	
        	
        		if(isValidUserPhno(phno))
		           {
        			  break;
		           }
		           else
		           {
		        	   check_userPhno = true;
		        	   System.out.println("\n*****  use only number \nand number not should be greater than 10 or less than 10\n number can start between 7 to 9 *****\n");
		        	   
		           }
        	
        	
	            
        }while(check_userPhno = true);
        
        student_list.add(new Student(s_name,s_pass,s_email,phno,null));
        	


    
    
		
	 
    

		
	}
	
//************************************ Admin Login ****************************************************//	
	
	public void adminLogin(String userInput,String userPassword)
	{
		boolean b = false;
		
		//System.out.println(admin.size());
		
//		for(AdminRegister a : admin)
//		{
//			if(!(a.getAdmin_name().equals(userInput) && a.getAdmin_pass().equals(userPassword)))
//			{
//				return "";
//			}
//		}
		 
			for(AdminRegister a : admin)
			{
				if(a.getAdmin_name().equals(userInput) && a.getAdmin_pass().equals(userPassword))
				{
					System.out.println("\n Login Success FUlly");
					
					
					
					
					boolean b1 = false;
					do
					{	
						System.out.println("\n********************************** Admin Menu *****************************");
						System.out.println("\n1. Book \n2. Student Registe\n3. Wallet \n4. Student Issue Books \n5. Issue Book to user \n6. Logout ");
						int n = takeInput();
						switch(n)
						{
							case 1: bookMenu(userInput, userPassword);
							
							break;
							case 2 : 
								student_Register();
//								LocalDate li= LocalDate.now();
//								ArrayList<BookStock> boklist = new ArrayList<BookStock>();
//								boklist.add(new BookStock(1, "Maths", "Ram", 560, 1,  LocalDate.now(), LocalDate.parse("2023-02-02")));
								student_list.add(new Student("Ganesh","Ganesh2@","ganesh2@gmail.com","9619181626",null));
								student_list.add(new Student("Ramesh","Ramesh2@","ramesh2@gmail.com","8975685485",null));
								System.out.println("\nStudent Registered Successfully");
								b1 = true;
							break;
							case 3: System.out.println(admin_wallet);
							b1 = true;
							break;
							
							case 4:
								studentIssueBooksList();
								b1 = true;
								break;
							case 5:
								IssueBooktoUser(userInput,userPassword);
								adminLogin(userInput, userPassword);
								b1=false;
								break;
							case 6: 
								for(Student s : student_list)
								{
									System.out.println(s.s_name);
								}
							displayLibrary();
							b1 = false;
							break;
							default :
								System.out.println("You enter Wrong Option please choose Valid Option");
								
								b1 = true;
								break;
						}
						
					}while(b1 == true);
					
					displayLibrary();
					b = false;
					break;
				}
				
				//System.out.println(a.admin_name);
				
			}
		
			if(b == false)
			{
				System.out.println("please enter right login details");
				
				adminLogin(takeInputForLoginUsername(),takeInputForLoginPassword());
			}
			
			
		
		
		
		
	}
	//*************************************************** Student Login **********************************************************
	public void student_Login(String student_name, String student_password)
	{
		Scanner sc = new Scanner(System.in);
		boolean b = false;
		boolean ask = false;
		
		for(Student s : student_list)
		{
			
			if(s.getS_name().equals(student_name) && s.getS_pass().equals(student_password))
			{
				
				System.out.println("Login Sucessfully");
				
				do
				{	System.out.println("\n\n1.Book\n2.Add Money\n3.Show Wallet\n4.Issue Book\n5.Logout");
					try
					{
						
						int n = takeInput();
						switch(n)
						{
						case 1: System.out.println("*********************** Books Table **************************");
						System.out.println("Book ID\t Book Name\tBook Author\tBook Price \t Book Stock ");
						for(BookStock dis : booklist)
						{
							System.out.println(dis.getBookId()+"\t  "+dis.getBook_name()+"\t\t "+dis.book_author+"\t\t"+dis.getBook_price()+"\t\t\t "+dis.getBook_stock());
						}
						System.out.println("please enter Book Id : ");
						int user_ask = takeInput();
						
						
						int quantity = 1;
						
						System.out.println(booklist.contains(user_ask));
//							for(BookStock st_b : booklist)
//							{
//								if(st_b.getBookId() == user_ask)
//								{
//									System.out.println("Book isssue Successfully");
//									
//								}
//								else
//								{
//									System.out.println("Please enter valid id ");
//									
//									student_Login(student_name, student_password);
//								}
//							}
						issueBook(student_name, student_password,user_ask-1,quantity);
						
						
						ask = true;
						break;
						case 2:
							System.out.println("Enter a money : ");
							double money = sc.nextDouble();
							if(money > 0)
							{
								s.setS_wallet(money+s.getS_wallet());
							}
							else
							{
								System.out.println("Please valid amount");
								ask = true;
							}
							ask = true;
							break;
						case 3 :
							System.out.println("Wallet Balance is : "+s.getS_wallet());
							ask = true;
							break;
						
						case 4:
							 issueBooks(student_name, student_password);
							
							
							ask = true;
							break;
						case 5:
							ask = true;
							displayLibrary();
							break;
						default:
							student_Login(student_name, student_password);
							ask = false;
							break;
								//student_Login(student_name, student_password);
								
								
							
						}
					}
					catch(Exception e)
					{
						
						ask = true;
					}
					
					
					
				}while(ask == true);
				
				
			}
			b = true;
			
		}
		if(!b)
		{
			System.out.println("User is not available please regsister first then login");
//			student_Login(student_name, student_password);
			//displayLibrary();
			b = false;
		}
		
	}
	//************************************ User Choice Input ****************************************************//	
	public int takeInput()
	{
		Scanner sc = new Scanner(System.in);
		 int n = 0;
		try
		{
			n = sc.nextInt();			 
		}
		catch(Exception e)
		{
			System.out.println("Enter Only Number");
//			takeInput();
		}
		return n;
	}
	//************************************ user username Input ****************************************************//	
	public String takeInputForLoginUsername()
	{
		Scanner sc = new Scanner(System.in);
		String userInput = "";
		try
		{
			System.out.print("Admin Name : ");
			userInput = sc.nextLine();
			
		}catch(Exception e)
		{
			System.out.println("enter only String");
			takeInputForLoginUsername();
		}
		return userInput;
	}
	//************************************ user password input ****************************************************//	
	public String takeInputForLoginPassword()
	{
		Scanner sc = new Scanner(System.in);
		String userInput = "";
		try
		{System.out.print("Admin Password : ");
			userInput = sc.nextLine();
			
		}catch(Exception e)
		{
			System.out.println("enter only String");
			takeInputForLoginUsername();
		}
		return userInput;
	}
	//************************************ username validation during Registration ****************************************************//
	public static boolean isValidUsername(String name)
    {
  
        String regex = "^[A-Za-z]\\w{5,29}+$";
  
        Pattern p = Pattern.compile(regex);
  
       
        if (name == null) {
            return false;
        }
  
    
        Matcher m = p.matcher(name);
  
        return m.matches();
    }
	//************************************ userpassword validation during Registration ****************************************************//
	public static boolean isValidUserpassword(String userPassword)
	{
		
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
  
        Pattern p = Pattern.compile(regex);
  
   
        if (userPassword == null) {
            return false;
        }
  
       
        Matcher m = p.matcher(userPassword);
  
      
        return m.matches();
	}
	//************************************** isValidUserEmail ****************************************************//
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
	//************************************** phone number validation ****************************************************
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
	//*************************************************** Book Add ******************************************************************
	public void bookAdd(String studentName, String studenPassword)
	{
		int bookId = 0;
		String bookName="";
		double bookPrice;
		String bookAuthor;
		int bookStock=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		boolean bokId = false;
		boolean bokstok = false;
		
			
			
				try
				{
					do
					{
						System.out.println("\nplease enter Book ID : ");
						bookId = sc.nextInt();
						if(bookId > 0)
						{
							for(BookStock b : booklist)
							{
								if(b.getBookId() == bookId)
								{
									System.out.print("Book Id is already present in List \nAdd Quantity : ");
									int checkQuantity = takeInput();
//									b.setBook_stock(b.getBook_stock()+checkQuantity);
									if(checkQuantity > 0)
									{
										b.setBook_stock(b.getBook_stock()+checkQuantity);
										System.out.println("Quantity added success fully");
									}
									else
									{
										System.out.println("Quantity Not added ");
									}
									
									
									
									
//									System.out.println("Quantity added success fully ");
									bookMenu(studentName, studenPassword);
									
								}
							}
							bokId = false;
						}
						else
						{
							bokId = true;
						}
						
					}while( bokId == true);
						
						System.out.println("\nplease enter Book Name : ");
						sc.nextLine();
						bookName = sc.nextLine();
						
						
						
						
						System.out.println("Please enter Book Author : ");
						
						bookAuthor = sc.nextLine();
						
						System.out.println("please enter Book Price : ");
						bookPrice = sc.nextDouble();
						
						
						
						do
						{
							System.out.println("please enter Book Stock : ");
							bookStock = sc.nextInt();
							
							if(bookStock > 0)
							{
							
								bokstok = false;
								
							}
							else
							{
								bokstok = true;
							}
							
							
						}while(bokstok == true);
//						if(bookId > 0 && bookStock > 0)
//						{
//							booklist.add(new BookStock(bookId,bookName,bookAuthor,bookPrice,bookStock,null,null));
//							
//							System.out.println("Book Added Successfully");
//						}
//						else
//						{
//							bookAdd(studentName, studenPassword);
//						}
						
						System.out.println(bookName+""+bookAuthor);
//							if(b.getBook_name() == bookName)
							//System.out.println(booklist.contains(bookName));
							booklist.add(new BookStock(bookId,bookName,bookAuthor,bookPrice,bookStock,null,null));
//							
							System.out.println("Book Added Successfully");
					
					
					
					//booklist.add(new BookStock(bookName,bookAuthor,bookPrice,bookStock));
					
					
						
					

					
					
				
					
				}catch(Exception e)
				{
					System.out.println("Please enter valid Detaails");
					bookMenu(studentName, studenPassword);
				}
			
		
		
		
		//********************************* Book Display *************************************************
	}
	public void bookDisplay()
	{
		if(booklist.isEmpty())
		{
			System.out.println("please add some Books ");
			
		}
		else
		{
			System.out.println("\nBook ID\t\t\tBook Name\tBook Author\t\tBook Price\tBook Stock");
			
			for(BookStock b :booklist)
			{
				System.out.println(b.getBookId()+"\t\t\t"+b.getBook_name()+" \t \t"+b.book_author+"\t\t"+b.book_price+"\t\t  "+b.book_stock);
			}
		}
	}
	public void bookMenu(String studentName, String studentPassword)
	{
		
		System.out.println("\n 1. for Book Add \n2. for Book display\n3. for back menu");
		
		System.out.println("\n please enter choice : ");
		
		int n = takeInput();
		switch(n)
		{
		case 1: 
//		if(booklist.isEmpty())
//				{
//					bookAdd();
//				}
////		else if ()
//				else
//				{
//				for(BookStock b : booklist)
//				{
//					if(b.getBook_name().equals(b))
//				}
				//}
			
			bookAdd(studentName,studentPassword);
			
			//booklist.add(new BookStock(4,"Geo","Shyam",234,3,null,null));
		bookMenu(studentName,studentPassword);
		break;
		
		case 2: bookDisplay();
		bookMenu(studentName,studentPassword);
		break;
		
		case 3 : adminLogin(studentName, studentPassword);
		break;
		default:
			
			System.out.println("Plesase enter valide input");
			
			bookMenu(studentName,studentPassword);
		}
	}
	public void issueBook(String studentName , String studentPassword, int book_id, int quantity)
	{
		BookStock selectedBook = booklist.get(book_id);
		
//		System.out.println("for issue book please enter book Id : ");
//		int userask = takeInput();
		for(Student s : student_list)
		{
		
			if(s.getS_name().equals(studentName) && s.getS_pass().equals(studentPassword))
			{
			
				userIndex = student_list.indexOf(s);
				System.out.println(userIndex);
				
				
					if(selectedBook.getBook_stock() >= quantity)
					{
						boolean b = false;
						System.out.println(booklist);
						for(int i = 0; i < student_list.get(userIndex).user_book_list.size(); i++)
						{
							if(student_list.get(userIndex).user_book_list.get(i).getBookId() == selectedBook.getBookId())
							{
								System.out.println("Book already exist");
								student_Login(studentName, studentPassword);
								b = true;
								break;
							}
//							else
//							{
//								student_list.get(userIndex).user_book_list.get(i).book_stock = 1;
//								b = true;
//							}
						}
						if(!b) {
							System.out.println("asda");
							issueDate = LocalDate.now();
							
					        returnDate = issueDate.plusDays(7);
					        
					        
					        
							student_list.get(userIndex).user_book_list.add(new BookStock(selectedBook.bookId,selectedBook.book_name,selectedBook.book_author,selectedBook.book_price,quantity,issueDate,returnDate));
							
							System.out.println(student_list.get(userIndex).user_book_list.size());
							
							booklist.get(book_id).setBook_stock(booklist.get(book_id).getBook_stock()-1);
						}
						
						//booklist.get(selectedBook.bookId).setBook_stock(booklist.get(selectedBook.bookId).getBook_stock() - 1);
						break;
					}
					else
					{
						System.out.println("Book is out of stock");
						break;
					}
				
				
				
			}
		}
	}
	public void  issueBooks(String studentName, String studentPassword)
	{
		for(Student s : student_list)
		{
			if(studentName.equals(s.getS_name()) &&studentPassword.equals(s.getS_pass()) )
			{
				userIndex = student_list.indexOf(s);
				System.out.println(student_list.get(userIndex).getS_name());
			}
		}
		if(student_list.get(userIndex).user_book_list.isEmpty())
		{
			System.out.println("please Issue Some Books ");
			student_Login(studentName, studentName);
		}
		System.out.println("Book Id\t\t\tBook Name\t Book Author\tBook Price\tBook Stock\tBook Issue Date\t\tBook Return Date");
		for(Student s : student_list)
		{
			if(studentName.equals(s.getS_name()) &&studentPassword.equals(s.getS_pass()) )
			{
				userIndex = student_list.indexOf(s);
				System.out.println(student_list.get(userIndex).getS_name());
				System.out.println(student_list.get(userIndex).user_book_list.size());
				for(BookStock b : student_list.get(userIndex).user_book_list)
				{
					System.out.println(b.getBookId()+"\t\t\t"+b.getBook_name()+"\t\t    "+b.getBook_author()+"\t\t"+b.getBook_price()+"\t\t"+b.getBook_stock()+"\t\t"+b.getIssuDate()+"\t\t"+b.getReurnDate());
				}
			}
		}
		
		try
		{
			System.out.println("1. For Book Return /n2. For Back menu");
			int user_ask = takeInput();
			switch(user_ask)
			{
			case 1 :
				System.out.print("Please enter Book Id : ");
				int user_ask1 = takeInput();
				
				returnBook(studentName, studentPassword, user_ask1,userIndex);
				break;
			case 2: 
				student_Login(studentName, studentPassword);
				break;
			default:
				System.out.println("Please enter Valid Option");
					student_Login(studentName, studentPassword);
					break;
			}
		}catch(Exception e)
		{
			System.out.println("This Book is not available in your cart  first please add then return ");
			
		}
		
		//student_Login(studentName, studentPassword);
		
	}
	public void returnBook(String studentName , String studentPassword, int book_id, int studentIndex)
	{
		LocalDate fineCheck = LocalDate.parse("2023-02-04");
		
		//BookStock selectedBook = student_list.get(studentIndex).user_book_list.get(book_id);
		


		System.out.println("student Book list size : = "+student_list.get(studentIndex).user_book_list.size());
		
		//System.out.println("Selected Book Id : = "+selectedBook.getBookId());
		
		//System.out.println("student Booklist Id : = "+student_list.get(studentIndex).user_book_list.get(book_id).bookId);
		
		//System.out.println("Selected Book Id Index : = "+booklist.indexOf(selectedBook));
		
		//System.out.println("student Booklist Id Index : = "+student_list.get(studentIndex).user_book_list.get(book_id));
		
		
		for(int i = 0; i < student_list.get(studentIndex).user_book_list.size();i++)
		{
			BookStock use_bok_list = student_list.get(studentIndex).user_book_list.get(i);
			if(book_id == use_bok_list.getBookId())
			{
				
//				student_list.get(studentIndex).user_book_list.remove(i);
//				for(int j = 0 ; j < booklist.size(); j++)
//					{
//						BookStock us_bokstok = booklist.get(j);
//						if(us_bokstok.getBookId() == book_id)
//						{
//							us_bokstok.setBook_stock(us_bokstok.getBook_stock()+1);
//							
//						}
//						
//					}
//				System.out.println(booklist.get(i).getBook_name()+"\t"+booklist.get(i).getBook_stock());
//				booklist.get(i).setBook_stock(booklist.get(i).getBook_stock()+1);
//				System.out.println(booklist.get(i).getBook_name()+"\t"+booklist.get(i).getBook_stock());
//				student_list.get(studentIndex).setS_wallet(student_list.get(studentIndex).getS_wallet() - 50);
//				admin_wallet+=50;
				
				if(fineCheck.compareTo(student_list.get(studentIndex).user_book_list.get(i).getReurnDate()) > 0)
				{
					if(student_list.get(studentIndex).getS_wallet() >= 50) 
					{
						student_list.get(studentIndex).user_book_list.remove(i);
						for(int j = 0 ; j < booklist.size(); j++)
						{
							BookStock us_bokstok = booklist.get(j);
							if(us_bokstok.getBookId() == use_bok_list.getBookId())
							{
								booklist.get(j).setBook_stock(booklist.get(j).getBook_stock()+1);
							}
						}
						student_list.get(studentIndex).setS_wallet(student_list.get(studentIndex).getS_wallet() - 50);
						admin_wallet+=50;
					}
					else
					{
						System.out.print("Add Money in Wallet : ");
						
						int n = takeInput();
						student_list.get(studentIndex).setS_wallet(n);
						
					}
				}
				else
				{
					student_list.get(studentIndex).user_book_list.remove(i);
					for(int j = 0 ; j < booklist.size(); j++)
					{
						BookStock us_bokstok = booklist.get(j);
						if(us_bokstok.getBookId() == use_bok_list.getBookId())
						{
							booklist.get(j).setBook_stock(booklist.get(j).getBook_stock()+1);
						}
					}
//					booklist.get(i).setBook_stock(booklist.get(i).getBook_stock()+1);
					//student_list.get(studentIndex).setS_wallet(student_list.get(studentIndex).getS_wallet() - 50);
					//admin_wallet+=50;
				}
				
				
				//student_list.get(userIndex).user_book_list.remove(student_list.get(studentIndex).user_book_list.get(i));
				//student_list.get(userIndex).user_book_list.remove(i);
				
				//System.out.println(i);
				//selectedBook.setBook_stock(selectedBook.getBook_stock() + 1);
				//System.out.println("No Fine Book Return Successfullly");
				//break;
			}
			
			
		}
		
		/*if(student_list.get(studentIndex).user_book_list.contains(student_list.get(studentIndex).user_book_list.get(studentIndex)))
		{
			
			if(fineCheck.compareTo(student_list.get(studentIndex).user_book_list.get(book_id).getReurnDate()) > 0)
			{
				System.out.println("Your return date is exceed");
				if(student_list.get(studentIndex).getS_wallet() >= 50) 
				{
					
					student_list.get(studentIndex).user_book_list.remove(booklist.indexOf(selectedBook));
					selectedBook.setBook_stock(selectedBook.getBook_stock() + 1);
					student_list.get(studentIndex).setS_wallet(student_list.get(studentIndex).getS_wallet() - 50);
					admin_wallet+=50;
					
					System.out.println("!! Book return successfully !!");
				}
				else
				{
					System.out.print("Add Money in Wallet : ");
					
					int n = takeInput();
					student_list.get(studentIndex).setS_wallet(n);
					
				}
			}
			else
			{
				for(int i = 0; i < student_list.get(studentIndex).user_book_list.size();i++)
				{
					BookStock use_bok_list = student_list.get(studentIndex).user_book_list.get(i);
					if(book_id == use_bok_list.getBookId())
					{
						
						
						
						
						//student_list.get(userIndex).user_book_list.remove(student_list.get(studentIndex).user_book_list.get(i));
						student_list.get(userIndex).user_book_list.remove(i);
						
						System.out.println(i);
						selectedBook.setBook_stock(selectedBook.getBook_stock() + 1);
						System.out.println("No Fine Book Return Successfullly");
						break;
					}
					
				}
//				System.out.println("Book is removed "+student_list.get(studentIndex).user_book_list.get(i).bookId);
//				System.out.println("Book ID : = "+selectedBook.getBookId());
				//student_list.get(userIndex).user_book_list.remove(book_id);
//				selectedBook.setBook_stock(selectedBook.getBook_stock() + 1);
//				System.out.println("No Fine Book Return Successfullly");
			}
		}*/
		
//		if(fineCheck.compareTo(student_list.get(studentIndex).user_book_list.get(book_id).getReurnDate()) > 0)
//		{
//	 
//			
//		        	System.out.println("Fine");
//		        	if(student_list.get(userIndex).getS_wallet() >= 50) 
//		        	{
//		        		student_list.get(userIndex).user_book_list.remove(selectedBook.getBookId());
//		        		student_list.get(userIndex).setS_wallet(student_list.get(userIndex).getS_wallet() - 50);
//		        		admin_wallet+=50;
//		        	}
//		        
//		        
//		}
		
//		System.out.println("for issue book please enter book Id : ");
////		int userask = takeInput();
//		for(Student s : student_list)
//		{
//		
//			if(s.getS_name().equals(studentName) && s.getS_pass().equals(studentPassword))
//			{
//			
//				userIndex = student_list.indexOf(s);
//				System.out.println(userIndex);
//				
//				
////					if(selectedBook.getBook_stock() >= quantity)
////					{
////						boolean b = false;
////						System.out.println(booklist);
////						for(int i = 0; i < student_list.get(userIndex).user_book_list.size(); i++)
////						{
////							if(student_list.get(userIndex).user_book_list.get(i).getBookId() == selectedBook.getBookId())
////							{
////								System.out.println("Book already exist");
////								student_Login(studentName, studentPassword);
////								b = true;
////								break;
////							}
//////							else
//////							{
//////								student_list.get(userIndex).user_book_list.get(i).book_stock = 1;
//////								b = true;
//////							}
////						}
////						if(!b) {
////							System.out.println("asda");
////							issueDate = LocalDate.now();
////							
////					        returnDate = issueDate.plusDays(7);
////					        
////					        if(fineCheck.compareTo(selectedBook.getReurnDate()) > 0)
////					        {
////					        	student_list.get(userIndex).setS_wallet(student_list.get(userIndex).getS_wallet() - 50);
////					        	admin_wallet+=50;
////					        }
////					        	
////							student_list.get(userIndex).user_book_list.remove(new BookStock(selectedBook.bookId,selectedBook.book_name,selectedBook.book_author,selectedBook.book_price,quantity,issueDate,returnDate));
////							
////							System.out.println(student_list.get(userIndex).user_book_list.size());
////							
////							booklist.get(book_id).setBook_stock(booklist.get(book_id).getBook_stock()+1);
////						}
////						
////						//booklist.get(selectedBook.bookId).setBook_stock(booklist.get(selectedBook.bookId).getBook_stock() - 1);
////						break;
////					}
////					else
////					{
////						System.out.println("Book is out of stock");
////						break;
////					}
//				
//				
//				
//			}
//		}
	}
	public void studentIssueBooksList()
	{
		int i = 0;
		System.out.println("Book ID \t\tBook Name\t Book Author \t Student Name \t Book Issue Date \t Book Return Date ");
		for(Student s : student_list)
		{
			if(i < student_list.size())
			{
				for(BookStock b : student_list.get(i).user_book_list)
				{
					System.out.println(b.getBookId()+"\t\t\t"+b.getBook_name()+"\t\t    "+b.getBook_author()+"\t\t    "+s.getS_name()+"\t "+b.getIssuDate()+"\t\t"+b.getReurnDate());
				}
			}
			
			i++;
			
		}
	}
	public void IssueBooktoUser(String sname, String spass)
	{
		Scanner sc = new Scanner(System.in);
		if(booklist.isEmpty())
		{
			adminLogin(sname, spass);
		}
		else
		{
			bookDisplay();
			System.out.print("Please enter a book id : ");
			
			int n = takeInput();
			
			
			System.out.print("\nPlease enter student name : ");
			
			String name = sc.nextLine();
			boolean stu = false;
			
			int sbok = n-1;
			//System.out.println("inndex of book "+sbok);
			BookStock fb = booklist.get(sbok+1);
			//System.out.println(fb.getBook_name());
			int studIndex = 0;
			if(stu == false)
			{
				for(BookStock books : booklist)
				{
					if(books.getBookId() == n)
					{
						for(int i=0;i<student_list.size();i++)
						{
							if(student_list.get(i).s_name.equals(name)) {
						studIndex=i;
							break;
							}
						}
						//System.out.println("index of student" +studIndex);
						//System.out.println(studIndex);
						for(Student s : student_list)
	//					{
							
							if(s.getS_name().equals(name))
							{
								//System.out.println(student_list.get(studIndex).user_book_list.contains(books));
									
	//							//System.out.println(student_list.get(studIndex).user_book_list.contains(books)+""+s.getS_name()+" has already issue this book "+student_list.get(studIndex).user_book_list.contains(books.getBook_name()));
	//							student_list.get(studIndex).user_book_list.add(books);
								//System.out.println("book is already issue by "+s.getS_name());
								for(BookStock sb : s.user_book_list)
								{
									//System.out.println(sb.getBookId());
									if(sb.getBookId() == books.getBookId())
									{
										System.out.println(s.getS_name()+" has alredy issue "+sb.getBook_name()+" Book ");
	//									IssueBooktoUser(sname, spass);;
										
										stu=true;
										
										break;
									}
	//								else
	//								{
	//									student_list.get(studIndex).user_book_list.add(booklist.get(n));
	//									System.out.println("Book is Succcessfullly issue to "+s.getS_name());
	//									IssueBooktoUser();
	//									
	//								}
								}
							}
	//						for(BookStock bok : s.user_book_list)
	//						{
	//							
	//						}
	//						
	//					}
					}
					
				}
			
			}
			if(!stu)
			{
//				System.out.println("Book is added suceessfully");
				BookStock bookStock=booklist.get(n-1);
				student_list.get(studIndex).user_book_list.add(new BookStock(bookStock.bookId,bookStock.book_name,bookStock.book_author,bookStock.book_price,1, LocalDate.now(), LocalDate.now().plusDays(7)));
				bookStock.setBook_stock(bookStock.getBook_stock()-1);
				System.out.println("Book is added suceessfully");
//				System.out.println(	"book size"+student_list.get(studIndex).user_book_list.size());
//				System.out.println(fb.getBook_name());
				adminLogin(sname, spass);
				stu = false;
				
			}
		}
			
	}
	
	
	
}
