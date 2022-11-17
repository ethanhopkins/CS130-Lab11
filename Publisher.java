package Lab11;

public class Publisher {
	String name;
	String city;
	String publisherID;
	Author author;
	Book book;
	
	public Publisher(String name, String city, String publisherID, Author author, Book book) {
		this.name = name;
		this.city = city;
		this.publisherID = publisherID;
		this.author = author;
		this.book = book;
	}
	
}
