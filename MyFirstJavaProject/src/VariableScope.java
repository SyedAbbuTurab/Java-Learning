
public class VariableScope {

	static int x = 1; // This variable has class level scope
	
	
	public static void main(String[] args) {
		
		int x = 2; // This is local level scope;
		System.out.println(x);
		
		useGlobal();
		doSomething();
		
	}
	
	static void doSomething() {
		int x = 3; // Again this is local scope to doSomething();
		System.out.println(x);
		
	}
	
	static void useGlobal() {
		System.out.println(x);
	}

}
