import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileWriter writer = new FileWriter("/Users/abbuturabsyed/Desktop/test.txt")) {
			writer.write("I like Biryani!\nit's delicious");
			System.out.println("File has been written");
		} catch(FileNotFoundException e) {
			System.out.println("Couldn't find the file!");
		} 
		catch (IOException e) {
			System.out.println("Couldn't write to file");
		} 
	}

}
