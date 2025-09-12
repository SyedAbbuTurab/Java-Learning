
public class Car {
	
	int year = 2025;
	String make = "Toyota";
	String model = "Camry";
	String color = "Midnight Black";
	boolean isRunning = false;
	
	void start() {
		isRunning = true;
		System.out.println("You started the engine!");
	}
	
	void stop() {
		isRunning = false;
		System.out.println("You stopped the engine!");
	}
}
