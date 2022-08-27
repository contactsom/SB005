package com.simplilearn.lms.book;

/*POJO-Plain Java Object Classes*/
public class Book {

	private int bookid;
	private String bookname;
	private String bookauthor;
	private String bookpublication;
	private int bookprice;
	private int bookisbn;
	
	public Book() {

	}
	
	public Book(int bookid, String bookname, String bookauthor, String bookpublication, int bookprice, int bookisbn) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookpublication = bookpublication;
		this.bookprice = bookprice;
		this.bookisbn = bookisbn;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getBookpublication() {
		return bookpublication;
	}

	public void setBookpublication(String bookpublication) {
		this.bookpublication = bookpublication;
	}

	public int getBookprice() {
		return bookprice;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	public int getBookisbn() {
		return bookisbn;
	}

	public void setBookisbn(int bookisbn) {
		this.bookisbn = bookisbn;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + ", bookpublication="
				+ bookpublication + ", bookprice=" + bookprice + ", bookisbn=" + bookisbn + "]";
	}
	
}
