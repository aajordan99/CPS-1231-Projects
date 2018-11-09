//Aaron Jordan
//Program 7
//This Program displays Interest based on an entered amount and adds it up based on how many months.
import java.util.Scanner;
public class jordanaa_Prog7 {
	public static void main(String[] args) {
		double interestRate, baseAmount, generatedInterest;
		int months;
		double totalInt = 0;
		Scanner info = new Scanner(System.in);
		System.out.println("Enter Investment Amount");
		baseAmount = info.nextDouble();
		System.out.println("Enter Annual Interest Rate");
		interestRate = info.nextDouble();
		System.out.println("Enter Month Amount");
		months = info.nextInt();
		String a, b, c;
		a = "Month";
		b = "Interest";
		c = "Value";
		System.out.print("Months \t Interest \t Value \n");
		for (int i = 1; i <= months; i++) {
			generatedInterest = computeFutureValue(baseAmount, interestRate);
			baseAmount = baseAmount + generatedInterest;
			System.out.printf("%2d %11.2f %18.2f ", i, generatedInterest, baseAmount  );
			System.out.println();
			totalInt += generatedInterest;
		}
		System.out.printf("The total amount of interest in " + months + " months is %1.2f",
				totalInt);		
	}
		public static double computeFutureValue(double baseAmount, double 
				interestRate) {
			double generatedInterest= baseAmount * interestRate/1200 ;
					return generatedInterest;
		}
}


