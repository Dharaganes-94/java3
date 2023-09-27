package Advanced;

//calling a paxkage and its subpackage
//

import Basics.*;
import intermediate.AbstractClassEx;
import intermediate.*; //will import the classes and interfaces inside the intermediate package but not its sub packages 

import intermediate.Subpackage1.*;

public class Package1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorld obj = new HelloWorld();
		obj.display();

	}

}
