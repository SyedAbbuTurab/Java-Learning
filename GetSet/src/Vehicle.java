
public class Vehicle {
	
	String name;
	String model;
	int year;
	Engine engine;
	
	Vehicle(String name, String model, int year, String engineType) {
		this.name = name;
		this.model = model;
		this.year = year;
		this.engine = new Engine(engineType);
	}
	
	void start() {
		this.engine.start();
		System.out.println("The " + model + " is runnnig");
	}
}
