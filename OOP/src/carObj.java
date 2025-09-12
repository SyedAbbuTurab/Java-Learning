
public class carObj {
	
	String model;
	String color;
	
	carObj(String m, String c){
		this.model = m;
		this.color = c;
	}
	
	void drive() {
		System.out.println("You drive the " + this.color + " " + this.model);
	}
}
