
public class test {
	public static void main(String[] args) {
		System.out.println("Hello Java!");
		logger();
		int num = logger(4);
		System.out.println(num);
	}
	
	// One method created
	static void logger() {
		System.out.println("Logger just called!");
	}
	
	// Same name method is created but different parameters; which makes Overloaded
	static int logger(int num) {
		return num;
	}
}
