
public class Library {
	
	String name;
	int year;
	Books[] books;
	
	Library(String name, int year, Books[] books) {
		this.name = name;
		this.year = year;
		this.books = books;
	}
	
	void displayInfo() {
		System.out.println(this.name + " " + this.year);
		System.out.println("The available books are: ");
		
		for(Books book : books) {
			System.out.println(book.displayInfo());
		}
	}
	
	
}
