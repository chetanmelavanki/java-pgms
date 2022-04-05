package com.xworkz.libraryapp;

import java.util.Scanner;

import com.xworkz.libraryapp.dto.BookDTO;
import com.xworkz.libraryapp.library.LibraryApp;

public class BookTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size");
		int size=sc.nextInt();
		
		LibraryApp lib=new LibraryApp(size);
		
		for (int i = 0; i <size; i++) {
			
	
		
			BookDTO book=new BookDTO();
			
		System.out.println("enter book id");
		book.setBookId(sc.nextInt());
		
		System.out.println("enter book name");
		book.setBookName(sc.next());
		
		System.out.println("enter author name");
		book.setBookAuthorName(sc.next());
		
		System.out.println("enter price");
		book.setBookPrice(sc.nextFloat());
		
		System.out.println("enter a addition");
		book.setBookAddition(sc.next());;
		
		System.out.println("enter publisher name");
		book.setBookPublisher(sc.next());
		
		System.out.println(lib.createBookDetails(book));
		}
		
		System.out.println();
		lib.getAllBookDetails();
		
		System.out.println("enter author name to update BOOK addition");
		lib.updateAdditionByAuthor(sc.next(), sc.next());
		
		System.out.println("enetr book name to delete all the book details");
		lib.deleteBookDetailsByName(sc.next());
	}
	
}
