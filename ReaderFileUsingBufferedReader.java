package Advanced;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFileUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\91971\\git\\repository\\java-learning1\\Hellowworld.txt");
      
		BufferedReader br = new BufferedReader(new FileReader(file));
		
String str;
		
		while( (str=br.readLine())  != null)
		{
			System.out.println(str);
		}
		
		
		
		
	}

}
