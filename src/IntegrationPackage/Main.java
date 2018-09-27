/*Riley Carr
*Hello World! MY name is Riley Carr and I am currently a student at Florida Gulf Coast University. This is my Integration Project that you are either grading, looking at or thinking 
*wow this kid has no idea what to do. I am happy that you are showing interest in my Program!
*If you have any questions please contact me at:
*rmcarr4835@eagle.fgcu.edu
*/
/*
 * In this project, it asks you to input your favorite color, number, and double.
 * It will also ask you to solve a simple mathematical equation.
 */
package IntegrationPackage;
import java.util.Scanner;

import javax.swing.Spring;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		//Name myName = new Name();
		//myName.setName();
		startIntro(); //This is a method call
		System.out.println("Press enter to continue...");
		scan.nextLine();
		randomP();//This is a method call
		
	}
	//Created method
	public static void startIntro() {
		System.out.println("Hello! Welcome to my integration project! Shortly the program will prompt you to type in a few requirements... Have fun~!");
	}
	//Created method
	public static void randomP() {
		Scanner scan = new Scanner(System.in); // Scanner 
		
		// This is a Try/Catch block of Code. It will try to run the code, but if there are any errors or exceptions it will
		// Let you know and prompt you in the right direction. 
		try {
			//User inputs 3 different types of data types and they are displayed in reverse
			System.out.println("Please input your favorite Color, Number and Double. (Click enter after each answer.)");
			String s = scan.nextLine();
			int stringL = s.length(); // String and s.length(A String method that finds the length of a String)
			
			final int x = 47; //Final is a keyword that keeps the value it was assigned when it was initialized. 
							  //Scope (Only allowed to get called/used in the this Class)
			
			int num = scan.nextInt(); // Integer and also a Variable (
			
			double dub = scan.nextDouble();// Double
			
			System.out.println("Your favorite double is: " + dub);
			System.out.println("Your favorite number is: " + num);
			System.out.println("Your favorite color is: " + s);	
			System.out.println("The total string length of your favorite color is: " + stringL);
			System.out.println("Press enter to continue...");
			scan.nextLine();
			scan.nextLine();
			System.out.println("What is fourty-three + four? (Answer with a number.)");
			
			boolean boo = true; // Boolean
			boolean boo2 = false;
			int boo1 = scan.nextInt();
			if (boo1 == x)
			{
				System.out.println(boo);
			}
			else
			{
				System.out.println(boo2);
			}
			
			scan.close();
		}
		catch (Exception e) {
			System.out.println("Error! Please enter a String, Integer and then Double");
			randomP();
		}				
	}
	
	class Name{
		public String name;
		
		public String getName() {
			return name;
		}
		public String setName(String name) {
			this.name = name;
			return name;
		}
	}

}
