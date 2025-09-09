import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int number = random.nextInt(1, 6);
		
		System.out.println("Integer random number " + number);
		
		double doubleRandom = random.nextDouble(1, 10);
		System.out.println("Decimal random number " + doubleRandom);
		
		boolean booleanRandom = random.nextBoolean();
		System.out.println("Boolean random value(True/False) " + booleanRandom);
	}

}
