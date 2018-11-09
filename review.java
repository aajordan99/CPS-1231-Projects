import java.util.Scanner;
public class review {
	public static void main(String [] args) {
		int year;
		System.out.println("Enter a year to see if it's a leap year");
		Scanner leapYear = new Scanner (System.in);
		year = leapYear.nextInt();
		if (year % 4 == 0) {
			System.out.println(year + " is a leap year.");}
		else if (year % 400 == 0) {
			System.out.println(year + " is a leap year");}
		else System.out.println(year + " is not a leap year.");	
	}
}
