
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
}
