package com.simplilearn.lms.client;

import com.simplilearn.lms.book.Book;
import com.simplilearn.lms.service.BookService;

public class LMSClient {

	public static void main(String[] args) {
		
		BookService bookService = new BookService();
		
		/*1. VERIFY THE USER*/
		/*String isValidUser=bookService.verifyUsers("subhash","passsubhash");
		//String isValidUser=bookService.verifyUsers("subhash","123"); //Invalid User
		System.out.println(isValidUser);
		*/
		
		
		/*2. Add Book */
		/*Book book = new Book(101, "Head First Java, 2nd Edition", "Kathy Sierra", "O'Reilly Media, Inc", 1500, 9780596);
		int record=bookService.addBook(book);
		if(record>0) {
			System.out.println("Record Inseerted Successfully");
		}else {
			System.err.println("Error Occured while inserting the data ");
		}*/
		
		/*6. Get Book by ID*/
		int bookId=101;
		Book book=bookService.getBookById(bookId);
		System.out.println("BOOK_ID- "+book.getBookid()+" BOOK_NAME- "+book.getBookname()+" BOOK_AUTHOR- "+book.getBookauthor());
		
		
		
		/*3. Update Book*/
		/*4. Delete Book*/
		/*5. Get all Books*/
		
		
		
		
		
	}
}
