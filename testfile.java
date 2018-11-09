import java.util.Scanner;
public class testfile {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Enter investment");
		double interestRate, baseAmount, generatedInterest;
		int months;
		baseAmount = info.nextDouble();
		System.out.println("Enter interest rate");
		interestRate = info.nextDouble();
		System.out.println("Enter months");
		months = info.nextInt();
		double totalInt = 0;
		for (int i = 1; i <= months; i++) {
			generatedInterest = computeFutureValue(baseAmount, interestRate);
			baseAmount = baseAmount + generatedInterest;
			System.out.printf("%1d %5.2f %5.2f ", i, generatedInterest, baseAmount  );
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

	
