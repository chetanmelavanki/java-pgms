package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.dto.BookDTO;

public class LibraryApp {
	BookDTO bookDTO[];
	int index;
	
	public LibraryApp(int size) {
		bookDTO =new BookDTO[size];
	}
	
	public boolean createBookDetails(BookDTO dto) {
		System.out.println("invoked createBookDetails()");
		boolean bookAdded=false;
		if(dto != null) {
			bookDTO[index++]=dto;
			bookAdded=true;
		}
		else {
			System.out.println("no book found");
		}
		System.out.println("end of createBookDetails()");
		return bookAdded;
	}
	
	public void getAllBookDetails() {
		for (int i = 0; i < bookDTO.length; i++) {
			System.out.println(bookDTO[i]);
		}
	}
	
	public boolean updateAdditionByAuthor(String authorName,String bookAddition) {
		boolean isBookAdditionUpdated=false;
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
		return isBookAdditionUpdated;
		
	}
	public boolean deleteBookDetailsByName(String bookName)
	{
		boolean delete=false;
		try {
			for (int i = 0; i < bookDTO.length; i++) {
				if(bookDTO[i].getBookName().equals(bookName)) {
					bookDTO[i]=null;
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
	
	
}
