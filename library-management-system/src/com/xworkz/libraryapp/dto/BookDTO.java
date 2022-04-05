package com.xworkz.libraryapp.dto;

public class BookDTO {
	private int bookId;
	private String bookName;
	private String bookAuthorName;
	private String bookPublisher;
	private String bookAddition;
	private float bookPrice;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthorName() {
		return bookAuthorName;
	}
	public void setBookAuthorName(String bookAuthorName) {
		this.bookAuthorName = bookAuthorName;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public void setBookAddition(String bookAddition) {
		this.bookAddition = bookAddition;
	}
	public String getBookAddition() {
		return bookAddition;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "BookDTO [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthorName=" + bookAuthorName
				+ ", bookPublisher=" + bookPublisher + ", bookAddition=" + bookAddition + ", bookPrice=" + bookPrice
				+ "]";
	}
	
	
	
}
