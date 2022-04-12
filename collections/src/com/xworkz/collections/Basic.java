package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;

public class Basic {
	public static void main(String[] args) {
		Collection collection=new LinkedList();
		collection.add(1);
		collection.add("chetan");
		collection.add(9035679479l);
		collection.add("9686147948");
		collection.add("bgk");

		System.out.println(collection.isEmpty());
		System.out.println(collection.size());
		collection.remove("bgk");
		System.out.println(collection.size());
		
//		collection.forEach(System.out::println);

		
		System.out.println("fetching the object from collection");
		for (Object object : collection) {
			System.out.println(object);
		}
		
		
		
		
		Collection collection2=new ArrayList();
		System.out.println(collection2.isEmpty());
		System.out.println("adding the elements of collection");
//		collection2.addAll(collection);
		collection2.add("bye");
		
		
//		System.out.println("fetching the objects with collection");
//		collection2.forEach(System.out::println);
		
		System.out.println("fetching to arrya()");
		Object object[]=collection.toArray();
		for (int i = 0; i < object.length; i++) {
			System.out.print(object[i]);
		}
		
		collection2.removeAll(collection2);
		System.out.println("fetching the objects with collection");
		collection2.forEach(System.out::println);
		
		System.out.println(collection2.size());
		
		
		
	}
}
