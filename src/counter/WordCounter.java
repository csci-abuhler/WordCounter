package counter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {
		WordCounter wc = new WordCounter();
		wc.execute();
	} // main

	// Executes the main point of the program.
	private void execute() {
		// Try catch in case errors occur.
		try {
			// Initialize file, scanner, and counter
			File f = new File("E:\\Eclipse\\WordCounter\\src\\test files\\test.txt");
			Scanner myReader = new Scanner(f);
			int count = 0;
			
			// Count the words
			while (myReader.hasNext()) {
				myReader.next();
				count++;
			} // while
			
			myReader.close();
			System.out.println(count);
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		} // try catch
	} // execute

	// constructor
	public WordCounter() {

	} // constructor
} // class
