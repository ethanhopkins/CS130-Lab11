package Lab11;

public class PublisherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a = new Author("Sam", "1234 Lincoln ave.", 43);
		Book b = new Book("JAVA", 12);
		Publisher p = new Publisher("Publishing Place", "Louisville", "12 32 53", a, b);
		
		System.out.println("----Author----");
			System.out.println("Name: " + a.name
					+ "\nAddress: " + a.address
						+ "\nAge: " + a.age + "\n\n");
			
		System.out.println("----Book----");
			System.out.println("Name: " + b.name
				+ "\nPrice: " + "$" + b.price + "\n\n");
			
		System.out.println("----Publisher----");
			System.out.println("Name: " + p.name
				+ "\nCity: " + p.city
					+ "\nID: " + p.publisherID
						+ "\nAuthor: " + a.name
							+ "\nBook: " + b.name);
	}

}
