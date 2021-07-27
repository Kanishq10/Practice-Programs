package advance__java;

import java.util.*;
class Author implements Comparable<Author> {
	String firstName;
	String bookName;
	int auAge;
	Author(String first, String book, int age){
		this.firstName = first;
		this.bookName = book;
		this.auAge = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getAuAge() {
		return auAge;
	}
	public void setAuAge(int auAge) {
		this.auAge = auAge;
	}
	@Override
	public int compareTo(Author au){
		return this.firstName.compareTo(au.firstName);
	}
}
class AuthorAgeComparator implements Comparator<Author>{
	public int compare(Author a1,Author a2){
		if(a1.auAge==a2.auAge)
			return 0;
		else if(a1.auAge>a2.auAge)
			return 1;
		else
			return -1;
	}
}
class BookNameComparator implements Comparator<Author>{
	public int compare(Author a1,Author a2){
		return a1.bookName.compareTo(a2.bookName);
	}
}
class Au{
	public static void main(String args[]){
		// List of objects of Author class
		ArrayList<Author> al=new ArrayList<Author>();
		al.add(new Author("Henry", "Tropic of Cancer", 45));
		al.add(new Author("Nalo", "Brown Girl in the Ring", 56));
		al.add(new Author("Frank", "300", 65));
		al.add(new Author("Deborah", "Sky Boys", 51));
		al.add(new Author("George R. R.", "A Song of Ice and Fire", 62));
		/*
		 * Sorting the list using Collections.sort() method, we
		 * can use this method because we have implemented the
		 * Comparable interface in our user defined class Author
		 */
		System.out.println("Sorting by Author First Name:");
		Collections.sort(al);
		for(Author au: al){
			System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
					au.getAuAge());
		}
		/*Sorting using AuthorAgeComparator*/
		System.out.println("Sorting by Author Age:");
		Collections.sort(al, new AuthorAgeComparator());
		for(Author au: al){
			System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
					au.getAuAge());
		}
		/*Sorting using BookNameComparator*/
		System.out.println("Sorting by Book Name:");
		Collections.sort(al, new BookNameComparator());
		for(Author au: al){
			System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
					au.getAuAge());
		}
	}
}
