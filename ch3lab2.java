import java.util.Scanner;
public class ch3lab2 {
	public static void main(String[] args) {
	int mon;
		System.out.println("Enter the month of the year - number 1 to 12");
		Scanner month = new Scanner (System.in);
		mon = month.nextInt();
		switch (mon) {
			case 1 : System.out.println("The month is January"); break;
			case 2 : System.out.println("The month is February"); break;
			case 3 : System.out.println("The month is March"); break;
			case 4 : System.out.println("The month is April"); break;
			case 5 : System.out.println("The month is May"); break;
			case 6 : System.out.println("The month is June"); break;
			case 7 : System.out.println("The month is July"); break;
			case 8 : System.out.println("The month is August"); break;
			case 9 : System.out.println("The month is September"); break;
			case 10 : System.out.println("The month is October"); break;
			case 11 : System.out.println("The month is November"); break;
			case 12 : System.out.println("The month is December"); break;
			default : System.out.println("Invalid input.");
				System.exit(1);
		}
	}
}
