//import test.test;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test.sysout();
		
		String[] fruits = {"Apple", "Banana", "Strawberry"};
		
		// Arrays in Java are reference type, so can't directly be accessed!
		System.out.println(fruits);
		
		// Correct way to access the array elements
		System.out.println("First element in array is " + fruits[0]);
		
		// Arrays can be updated using index
		fruits[1] = "Mango";
		
		// Lets access the Mango element;
		System.out.println(fruits[1]);
		
		// Lets add one more element to array
//		fruits[3] = "Pineappe";
//		
//		System.out.println(fruits[3]);
		
		// Get length of array
		System.out.println(fruits.length);
		
		getElements(fruits);
}
	static void getElements(String[] fruits) {
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}
}