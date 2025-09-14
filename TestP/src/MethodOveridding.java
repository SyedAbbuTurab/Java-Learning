
public class MethodOveridding {
	public static void main(String args[]) {
		Fish fish = new Fish();
		Cat cat = new Cat();
		
		cat.move();
		cat.move("H");
		fish.move();
		fish.move("A");
	}
}
