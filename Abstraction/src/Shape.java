
public abstract class Shape {
	
	// Abstract = Used to define abstract classes and methods
	//   Abstraction is the process of hiding the implementation details and showing only
	//   essential features
	
	// Abstract class can't be instantiated directly
	
	//Can contain abstract methods (Must implement in child classes using @Override)
	abstract double area(); //Abstract Method
	
	// can contain concrete methods -> (Inherited directly)
	void display() {
		System.out.println("This is a Shape");
	}
	
}
