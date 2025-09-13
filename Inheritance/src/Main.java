
public class Main {
	
	public static void main(String args[]) {
		Cat cat = new Cat();
		
		System.out.println(cat.isAlive);
		
		cat.eat();
		
		cat.speak();
		
		Plant plant = new Plant();
		
		System.out.println(plant.isAlive);
		plant.photosynthesises();
	}

}
