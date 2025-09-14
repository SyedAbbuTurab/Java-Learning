
public class Fish extends Animal{
	
	@Override
	void move() {
		System.out.println("This animal is swimming!");
	}
	
	@Override
	void move(String fish) {
		System.out.println("Overload Fish method!");
	}
}
