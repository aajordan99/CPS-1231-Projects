import java.util.Scanner;
public class jordanaa_lab2 {
	public static void main(String[] args) {
		//variables
		int number1;
		int number2;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number");
			//enter numbers
			 number1= input.nextInt();
			 System.out.println("Enter a number2");
			 number2 = input.nextInt();
			 if (number1 != number2) {
			System.out.println("The highest value is " + Math.max(number1, number2));
			System.out.println("The lowest value is " + Math.min(number1, number2)); }
			if (number1 == number2) {
			System.out.println(number1 + " and " + number2 + " are equal.");}
	}
}
