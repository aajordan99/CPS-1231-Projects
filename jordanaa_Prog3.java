//Aaron Jordan
//Program 3
//This code converts feet to meters and also displays feet in inches.
import java.util.Scanner;
@SuppressWarnings("resource")
public class jordanaa_Prog3 {
	public static void main(String[] args) {
	//Variables
		double feet;
		double meters;
		Scanner reader = new Scanner (System.in);
		//Input feet
		System.out.print("Enter the feet: ");
		feet = reader.nextDouble();
		//Compute from feet to meters
		meters = feet * 0.305;
		//Display results
		System.out.println(feet + " Feet is = " + meters + " meters");
		System.out.println();
		System.out.println(feet  + " Feet is = " + feet * 12 + " inches"); 
		System.out.println();
		System.out.print("Now lets Convert meters to feet: ");
		//Variables
		double fet;
		double metres;
		Scanner lol = new Scanner (System.in);
		metres = lol.nextDouble();
		fet = metres / .305;
		System.out.println(metres + " Meters is = " + fet + "feet");
		System.out.println();
		System.out.println(metres + " Meters is = " + fet * 12 + "inches");
		}
	}


