
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Car car = new Car();
		
		// System.out.println(car.isRunning);
		// car.start();
		// System.out.println(car.isRunning);
		// car.stop();
		// System.out.println(car.isRunning);
		
		// Constructors
		Student student1 = new Student("Sponge", 30, 2.2);
		Student student2 = new Student("Pat", 34, 2.9);
		Student student3 = new Student("Abbu Turab", 28, 4.0);
		
		System.out.println(student1.name);
		System.out.println(student2.name);
		System.out.println(student3.name + " has GPA of " + student3.gpa);
		
		student1.study();
		
	}

}
