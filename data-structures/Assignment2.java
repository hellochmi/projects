import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Assignment2 {
	public static void main(String args[]) throws FileNotFoundException {
		
		FileInputStream fstream = new FileInputStream("assignment2.txt");
					
		// Create a DequeUsingStacks object which stores strings
		DequeUsingStacks<String> deq = new DequeUsingStacks<String>();
		
		// And have a loop to process each command in the file.
		FileReader fr = new FileReader(fstream, deq);
		
	}
}
