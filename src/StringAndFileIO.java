import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class StringAndFileIO {

	public static void main(String[] args) throws Exception {
		//System.out.print("Enter a word with punctuation marks: ");
		File inputFile = new File("input.txt");
		Scanner input = new Scanner(inputFile);
		String word = input.next();
		
		String finalWord = "";
		for(int i=0; i<word.length(); i++){
			char ch = word.charAt(i);
			if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
				finalWord += ch;
			}	
		}
		input.close();
		
		File outputFile = new File("output.txt");
		PrintWriter output = new PrintWriter(outputFile);
		
		output.print("The word without punctuation marks: ");
		output.print(finalWord + "\n");
		output.close();
	}

}
