
public class Main {
	public static void main(String[] args) {
		Car car = new Car("Mustang", "Ford", 2024);
		
		// To avoid this kind of updates make it private
//		car.make="Corvette";
//		System.out.println(car.getMake());
//		System.out.println(car.getYear());
//		car.setYear(2025);
//		System.out.println(car.getYear());
//		
//		System.out.println(car.toString());
		
		Books book1 = new Books("Book 1", 252);
		Books book2 = new Books("Book 2", 253);
		Books book3 = new Books("Book 3", 254);
		
		Books[] book = { book1, book2, book3};
		
		Library library = new Library("The NYC Public Library", 1982, book);
		
//		System.out.println(book1.displayInfo());
//		library.displayInfo();
		
		Vehicle carVehicle = new Vehicle("Chevy", "Corvette", 2025, "V8");
		
		System.out.println(carVehicle.name);
		carVehicle.start();
		
		
	}
}
