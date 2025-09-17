// import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// 	ArrayList<String> topics = new ArrayList<>();
		
	// 	topics.add("Java");
	// 	topics.add("Spring Boot");
	// 	topics.add("AWS");
		
	// 	System.out.println("Topics to learn: ");
		
	// 	for(String topic : topics) {
	// 		System.out.println(topic);
	// 	}
		Box<String, Double> grocery = new Box<>("Almonds", 10.99);
		
		System.out.println(grocery.getItem());
		System.out.println(grocery.getPrice());
	}

}
