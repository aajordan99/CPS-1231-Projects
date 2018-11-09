import java.util.Scanner;
public class jordanaa_Prog4 {
	public static void main(String[] args) {
	int input;
	float pound;
	float kilogram;
		System.out.println("Which conversion do you want?");
		System.out.println();
		System.out.println("Pounds to Kilograms (Enter 1)");
		System.out.println("Kilograms to Pounds (Enter 2)");
		Scanner selection = new Scanner (System.in);
		Scanner weight = new Scanner (System.in);
			input = selection.nextInt();
				if (input == 1) {
					System.out.println("What weight value do you want converted?");
					pound = weight.nextFloat();
					kilogram = (float) (2.20462 * pound);
					pound = (float) (0.453592 * kilogram);
					System.out.println(pound + " pounds is equal to " + kilogram + " kilograms");}
				else if (input ==2) {
					System.out.println("What weight value do you want converted?");
					kilogram = weight.nextFloat();
					pound = (float) (0.453592 * kilogram);
					System.out.println(kilogram + " Kilograms is equal to 2" + pound + " pounds");}
				else {
					System.out.println("Invalid input");
				}
	}
}