package com.simplilearn.lms.service;

import java.sql.*;

import com.simplilearn.lms.book.Book;
import com.simplilearn.lms.utill.JDBCUtil;

public class BookService {

	Connection con= null;
	PreparedStatement ps = null;
	ResultSet rs= null;
			
	public String verifyUsers(String user, String password) {
		System.out.println("*************START-verifyUsers()******************");
		String verifyUser="";
		try {
			  con= JDBCUtil.getMySqlConnection();
			  ps = con.prepareStatement("SELECT * FROM USER WHERE USER_NAME = ? AND USER_PASS= ? ");
			  ps.setString(1, user);
			  ps.setString(2, password);
			  rs=ps.executeQuery();
			  //SELECT * FROM USER WHERE USER_NAME = subhash AND USER_PASS= passsubhash
			  if(rs.next()) {
				  //System.out.println("User Logged Successfully");
				  verifyUser="User Logged Successfully";
			  }else {
				  //System.err.println("The Username or Password is invalid");
				  verifyUser="The Username or Password is invalid";
			  }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(rs, ps, con);
		}
		System.out.println("*************END-verifyUsers()********************");
		return verifyUser;
	}

	public int addBook(Book book) {
		System.out.println("*************START-addBook()******************");
		int numberOfRecord=0;
		try {
			
			con= JDBCUtil.getMySqlConnection();
			  ps = con.prepareStatement("INSERT INTO BOOKS VALUES (?,?,?,?,?,?)");
			  ps.setInt(1, book.getBookid());
			  ps.setString(2, book.getBookname());
			  ps.setString(3, book.getBookauthor());
			  ps.setString(4, book.getBookpublication());
			  ps.setInt(5, book.getBookprice());
			  ps.setInt(6, book.getBookisbn());
			  numberOfRecord=ps.executeUpdate();
			  
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(rs, ps, con);
		}
		
		System.out.println("*************END-addBook()******************");
		return numberOfRecord;
	}

	public Book getBookById(int bookId) {
		System.out.println("*************START-getBookById()******************");
		Book book = null;
		try {
			con= JDBCUtil.getMySqlConnection();
			  ps = con.prepareStatement("SELECT * FROM BOOKS WHERE BOOK_ID = ?");
			  ps.setInt(1, bookId);
			  rs=ps.executeQuery();
			  while(rs.next()) {
				  book = new Book();
				  book.setBookid(rs.getInt(1));
				  book.setBookname(rs.getString(2));
				  book.setBookauthor(rs.getString(3));
				  book.setBookpublication(rs.getString(4));
				  book.setBookprice(rs.getInt(5));
				  book.setBookisbn(rs.getInt(6));
			  }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(rs, ps, con);	
		}
		System.out.println("*************END-getBookById()******************");
		return book;
	}

}
