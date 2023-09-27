package Advanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionEx {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		/*
		 * first way to handle checked exceptions
		 * 
		 */
		/*
		try
		{
			File file = new File("C:\\Users\\arvind\\guvigit\\learning_java\\Helloworld3.txt");
			Scanner sc = new Scanner(file);
		}
		catch(Exception ex)
		{
			
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("In Finally block");
		}
		System.out.println("Outside finally");
		
		*/
		
		File file = new File("C:\\Users\\91971\\git\\repository\\java-learning1\\Hellowworld2.txt");
		Scanner sc = new Scanner(file);
		
		System.out.println("Throws Exception");
        
	}

}
