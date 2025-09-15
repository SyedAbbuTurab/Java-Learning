
public class Exceptions {
	
	public static void main(String[] args) {
		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException e) {
			System.out.println("You can't devide by Zero!");
		} finally {
			System.out.println("Thank you!");
		}
	}
	
}
