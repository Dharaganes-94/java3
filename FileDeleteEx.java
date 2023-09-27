package Advanced;

import java.io.File;
import java.util.Scanner;

public class FileDeleteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the file to be deleted :");
		Scanner sc =new Scanner(System.in);
		String filetoBeDeleted = sc.nextLine();
		
	  File f = new File(filetoBeDeleted);
	  if(f.exists())
		{
			f.delete();
			System.out.println("File is deleted successfully");
		}
		else
		{
			System.out.println("File not deleted");
		}
		

		

	}

}
