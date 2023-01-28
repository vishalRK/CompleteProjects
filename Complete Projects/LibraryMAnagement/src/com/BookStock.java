package com;
import java.time.LocalDate;
public class BookStock {
	int bookId;
	

	String book_name;
	
	

	String book_author;
	
	double  book_price;
	
	int book_stock;
	LocalDate issuDate;
	

	LocalDate returnDate;
	

	public BookStock(int book_id,String book_name, String book_author, double book_price,int book_stock,LocalDate issuDate,LocalDate returnDate) {
		//super();
		this.bookId = book_id;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_price = book_price;
		this.book_stock = book_stock ;
		this.issuDate = issuDate;
		this.returnDate = returnDate;
		
	}
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public double getBook_price() {
		return book_price;
	}

	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	public int getBook_stock() {
		return book_stock;
	}

	public void setBook_stock(int book_stock) {
		this.book_stock = book_stock;
	}
	public LocalDate getIssuDate() {
		return issuDate;
	}
	public void setIssuDate(LocalDate issuDate) {
		this.issuDate = issuDate;
	}
	public LocalDate getReurnDate() {
		return returnDate;
	}
	public void setReurnDate(LocalDate reurnDate) {
		this.returnDate = reurnDate;
	}
	
	
	
}
