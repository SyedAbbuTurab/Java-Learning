package test;

public class ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 5, 6, 9, 10};
		int target = 11;
		
		boolean isFound = false;
		
		for(int i = 0; i < numbers.length; i++) {
			if(target == numbers[i]) {
				System.out.println("Target found at index " + i);
				isFound = true;
				break;
			}
		}
		
		if(!isFound) {
			System.out.println("Element did not found in the array");
		}
		
		System.out.println(averageNum(1, 2, 3, 4));
	}
	
	// VARARGS(variable arguments) is also used to dynamically give arguments to method
	// No method overloading is needed
	
	static double averageNum(double... numbers) {
		double sum = 0;
		
		for(double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}

}









