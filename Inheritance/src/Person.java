
public class Person {
	
	String firstName;
	String lastName;
	
	Person(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	
	void displayFullName() {
		System.out.println("Full name is " + this.firstName + " " + this.lastName);
	}
}
