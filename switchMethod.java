import java.util.Scanner;
public class switchMethod {
	public static void main(String [] args) {
		int year;
		System.out.println("Enter a year to see if it's a leap year");
		Scanner leapYear = new Scanner (System.in);
		year = leapYear.nextInt();
		switch (year) {
		case year % 4 == 0 : System.out.println();
		}
	}
}	
