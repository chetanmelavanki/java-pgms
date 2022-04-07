package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.dto.BookDTO;

public interface LibraryApp {
	
	
	public boolean createBookDetails(BookDTO dto) ;
	
	public void getAllBookDetails() ;
	
	
	public boolean updateAdditionByAuthor(String authorName,String bookAddition) ;
	
	
	public boolean deleteBookDetailsByName(String bookName);
	
	public String[] getAllPublisherByName(String bookName) ;
	
	public String[] getAllPublishers();
	public String[] getAllAuthors();
	public String getPriceByBookName(String bookName);
	public String getAuthorNameByPublisher(String bookPublisherName) ;
	}

	
