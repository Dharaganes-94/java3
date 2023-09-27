package Advanced;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	File file = new  File("C:\\Users\\91971\\git\\repository\\java-learning1\\Hellowworld.txt");
	
	String LineToAdd="The first line of the program";
	FileWriter fwriter = new FileWriter(file);
	fwriter.write(LineToAdd);
	System.out.println("File is written");
	
	fwriter.close();
	
	

	}

}
