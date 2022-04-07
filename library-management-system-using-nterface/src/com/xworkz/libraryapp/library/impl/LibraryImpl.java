package com.xworkz.libraryapp.library.impl;

import com.xworkz.libraryapp.dto.BookDTO;
import com.xworkz.libraryapp.library.LibraryApp;

public class LibraryImpl implements LibraryApp{
	BookDTO bookDTO[];
	int index;
	
	public LibraryImpl(int size) {
		bookDTO =new BookDTO[size];
	}

	@Override
	public boolean createBookDetails(BookDTO dto) {
		System.out.println("invoked createBookDetails()");
		boolean bookAdded=false;
		try {
		if(dto != null) {
			bookDTO[index++]=dto;
			bookAdded=true;
		}
		else {
			System.out.println("no book found");
		}
		System.out.println("end of createBookDetails()");
		
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		return bookAdded;
	}
	
	@Override
	public void getAllBookDetails() {
		try {
		for (int i = 0; i < bookDTO.length; i++) {
			System.out.println(bookDTO[i]);
		}
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
	}
	
	@Override
	public boolean updateAdditionByAuthor(String authorName, String bookAddition) {
		boolean isBookAdditionUpdated=false;
		try {
		for (int i = 0; i < bookDTO.length; i++) {
			
			if(bookDTO[i].getBookAuthorName().equals(authorName)) {
				bookDTO[i].setBookAddition(bookAddition);
				isBookAdditionUpdated=true;
				System.out.println(bookDTO[i]);
			}
			else {
				System.out.println("book addition is no updated");
			}
		}
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		return isBookAdditionUpdated;
		
	}

	@Override
	public boolean deleteBookDetailsByName(String bookName) {
		boolean delete=false;
		try {
			for (int i = 0; i < bookDTO.length; i++) {
				if(bookDTO[i].getBookName().equals(bookName)) {
					bookDTO[i]=null;
					System.out.println(bookDTO[i]);
					System.out.println("book ddetails are deleted");
					delete=true;
				}
				else {
					System.out.println("book ddetails are not deleted");
				}
			}
		}
		catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		return delete;
	}
	
	@Override
	public String[] getAllPublisherByName(String bookName) {
		System.out.println("inside getAllPublisherByName()..");
		String[] publishers=new String[bookDTO.length];		
		try {
		for (int i = 0; i < bookDTO.length; i++) {
			if(bookDTO[i].getBookName().equals(bookName)){
			
			publishers[i]=bookDTO[i].getBookPublisher();
			
			}
			else {
				System.out.println("no publisher found");
			}
				
			
		}
		}catch (Exception e) {
			System.out.println();
		}
		return publishers;
		
	}
	@Override
	public String[] getAllPublishers() {
		System.out.println(" inside getAllPublishers()");
		String[] publishers=new String[bookDTO.length];
		try {
		for (int i = 0; i < publishers.length; i++) {
			publishers[i]=bookDTO[i].getBookPublisher();
		}
		}
		catch (Exception e) {
			System.out.println();
		}
		return publishers;
	}

	@Override
	public String[] getAllAuthors() {
		System.out.println("inside getAllAuthors");
		String[] authors=new String[bookDTO.length];
		try {
		for (int i = 0; i < authors.length; i++) {
			authors[i]=bookDTO[i].getBookAuthorName();
		}
		}catch (Exception e) {
			System.out.println();
		}
		return authors;
	}

	
	@Override
	public String getPriceByBookName(String bookName) {
		System.out.println("insied getPriceByBookName()..");
		String price=null;
		try {
		for (int i = 0; i < bookDTO.length; i++) {
			if(bookDTO[i].getBookName().equals(bookName)) {
				System.out.println(bookDTO[i].getBookPrice());
			
			}
			else {
				System.out.println("no book found");
			}
		}
		}catch (Exception e) {
			System.out.println();
		}
		return price;
	}

	@Override
	public String getAuthorNameByPublisher(String bookPublisherName) {
		System.out.println("inside getAuthorNameByPublisher()");
		String author=null;
		try {
		for (int i = 0; i < bookDTO.length; i++) {
			if(bookDTO[i].getBookPublisher().equals(bookPublisherName)) {
				System.out.println(bookDTO[i].getBookAuthorName());
			}
		}
		}catch (Exception e) {
			System.out.println();
		}
		return author;
	}

	
	
	
	
	
	

}
