
public class Main {
	public static void main(String[] args) {
		Car car = new Car("Mustang", "Ford", 2024);
		
		// To avoid this kind of updates make it private
//		car.make="Corvette";
		System.out.println(car.getMake());
		System.out.println(car.getYear());
		car.setYear(2025);
		System.out.println(car.getYear());
		
		System.out.println(car.toString());
		
	}
}
