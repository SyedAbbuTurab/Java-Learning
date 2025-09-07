import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World!");
        
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        int product = a * b;
        System.out.println("Product: " + product);

        System.out.println("Press Enter Your Name...");

        String name = scanner.nextLine(); // Wait for user input before closing

        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
