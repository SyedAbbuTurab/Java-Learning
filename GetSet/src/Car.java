
public class Car {
	private String model;
	private String make;
	private int year;
	
	Car(String model, String make, int year) {
		this.model = model;
		this.make = make;
		this.year = year;
	}
	
	@Override
	public
	String toString() {
		return this.make + " " + this.model + " " + this.year;
	}
	
	String getModel() {
		return model;
	};
	
	String getMake() {
		return make;
	};
	
	int getYear() {
		return year;
	};
	
	void setYear(int year) {
		this.year = year;
	}
}
