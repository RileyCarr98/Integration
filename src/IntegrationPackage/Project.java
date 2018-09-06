package IntegrationPackage;

import java.util.Scanner;

public class Project {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			//User inputs 3 different types of data types and they are displayed in reverse
			System.out.println("Please input your favorite Color, Number and Double.");
			String s = scan.nextLine();
			int num = scan.nextInt();
			double dub = scan.nextDouble();
			System.out.println("Your favorite double is: " + dub);
			System.out.println("Your favorite number is: " + num);
			System.out.println("Your favorite color is: " + s);	
			System.out.println("What is fourty-three minus 39 +4");
			boolean boo = true;
			int boo1 = scan.nextInt();
			if (boo1 == 0)
			{
				System.out.println(boo);
			}
			
			
			
			
			
		}
}
