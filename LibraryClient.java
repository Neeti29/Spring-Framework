package com.niit.springcore;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Collection Injection
public class LibraryClient {

	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("book.xml");
		Library lib = (Library)bf.getBean("library");
		
		//List of Books
		List bookList = lib.getBookList();
		
		//Lets print the properties of the Book
		for(int i=0;i<bookList.size();i++)
		{
			System.out.println("**Book"+(i+1)+"Properties**");
			Book book=(Book)bookList.get(i);
			System.out.println("Book Title        :"+book.getTitle());
			System.out.println("Book Author       :"+book.getAuthor());
			System.out.println(("Book Publications :"+book.getPublications() ));
		}

		//Lets print the primitives
		List stringList = lib.getStringList();
		System.out.println("Primitives set to List :"+stringList);
	}

}
