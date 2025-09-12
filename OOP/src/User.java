
public class User {
	
	String username;
	String email;
	int age;
	
	// Constructor overloading 
	// Multiple constructors can be created with same name but different parameters;
	User() {
		this.username = "Guest";
		this.email = "Not provided";
		this.age = 0;
	}
	
	User(String username) {
		this.username = username;
		this.email = "Not provided";
		this.age = 0;
	}
	
	User(String username, String email) {
		this.username = username;
		this.email = email;
		this.age = 0;
	}

}
