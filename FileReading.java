//File Reader using Scanner
package Advanced;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\91971\\git\\repository\\java-learning1\\Hellowworld.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}

	}

}
