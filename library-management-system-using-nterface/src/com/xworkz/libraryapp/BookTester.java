package com.xworkz.libraryapp;

import java.util.Scanner;

import com.xworkz.libraryapp.dto.BookDTO;
import com.xworkz.libraryapp.library.LibraryApp;
import com.xworkz.libraryapp.library.impl.LibraryImpl;

public class BookTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size");
		int size=sc.nextInt();
		
		LibraryApp lib=new LibraryImpl(size);
		
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
		
		System.out.println("enter a edition");
		book.setBookAddition(sc.next());;
		
		System.out.println("enter publisher name");
		book.setBookPublisher(sc.next());
		
		System.out.println(lib.createBookDetails(book));
		}
		String text=null;
		do {
			System.out.println("Enter 1 to getAll the Book Details");
			System.out.println("Enter 2 to update book addition by book author");
			System.out.println("Enter 3 to delete book details by book name");
			System.out.println("Enter 4 to get all publishers by book name");
			System.out.println("enter 5 to get all publishers");
			System.out.println("enter 6 to get all authors");
			System.out.println("enter 7 to get price by book name");
			System.out.println("enter 8 to get author name by book publisher name");
			int choice=sc.nextInt();
			switch(choice) {
				
			case 1:lib.getAllBookDetails();
				break;
			case 2:System.out.println("enter the author name and addition to update addition");
				lib.updateAdditionByAuthor(sc.next(), sc.next());
				break;
			case 3:lib.deleteBookDetailsByName(sc.next());
				break;
			case 4:
				System.out.println("enter a name to get publishers");
				String[] pub=	lib.getAllPublisherByName(sc.next());
				for (int i = 0; i < pub.length; i++) {
					System.out.println(pub[i]);
				}
				
				break;
			case 5:String[] pub1=	lib.getAllPublishers();
				for (int i = 0; i < pub1.length; i++) {
				System.out.println(pub1[i]);
				}
					break;
			case 6:String[] author=lib.getAllAuthors();
			for (int i = 0; i < author.length; i++) {
				System.out.println(author[i]);
				
			}
				break;
			case 7:System.out.println("enter book name to get book price");
				lib.getPriceByBookName(sc.next());
				break;
			case 8:System.out.println("enter a publisher name to get author name");
				lib.getAuthorNameByPublisher(sc.next());
				break;
			default : System.out.println("no choice available");
			
			
			}
			System.out.println("do u want to continue say yes/no");
			text=sc.next();
		}
		
		while(text.equalsIgnoreCase("Yes"));
	}
	
}
