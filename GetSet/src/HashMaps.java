import java.util.HashMap;

public class HashMaps {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> cars = new HashMap<>();
		
		cars.put("Corvette", 58000);
		cars.put("BMW", 64000);
		cars.put("Lamborgini", 90000);
		
//		System.out.println(cars);
//		System.out.println(cars.containsKey("BMW"));
//		System.out.println(cars.get("Lamborgini"));
		
		if(!cars.containsKey("Audi")) {
			cars.put("Audi", 54000);
		} else {
			System.out.println("Key already found");
		}
		System.out.println(cars.size());
		System.out.println(cars.keySet());
		
		for(String car : cars.keySet()) {
			System.out.println(car + " $" + cars.get(car));
			
		}
		
		
		
	}

}
