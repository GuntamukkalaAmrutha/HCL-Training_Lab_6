package Lab6q3;

import java.util.*;
public class Main {
	public static void main(String []args) {
		ArrayList<Book> books=new ArrayList<>();
		books.add(new Book(121,"java",543,300));
		books.add(new Book(253,"c",403,500));
		books.add(new Book(781,"Python",300,150));
		
		System.out.println("All the books-----------");
		for(Book temp:books) {
			System.out.println(temp);
		}
		
		System.out.println("Sorted the books using comparable-----------");
		Collections.sort(books);//sorted by comparable
		
		for(Book temp:books) {
			System.out.println(temp);
		}
		//sorted by comparator
		
		System.out.println("Sorted the books by title using comparator-------------");
		Collections.sort(books,new BookSortbyTitle());
		for(Book temp:books) {
			System.out.println(temp);
		}
		
		System.out.println("Sorted the books by price then by pages using comparator---------");
		Collections.sort(books,new BookSortbyPricethenbyPages());
		for(Book temp:books) {
			System.out.println(temp);
		}
		
		
	}


}