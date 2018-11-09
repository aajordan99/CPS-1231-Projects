// Aaron Jordan
// Program 5
// This program calculates an employees gross pay, federal withholding, 
// state withholding, net pay, and total deduction on their wages.
import java.util.Scanner;
public class jordanaa_Prog5 {
	public static void main(String[] args) {
		String name;
		Double hours, payRate, grossPay, netPay, totalDeduct, fedDeduct, stateDeduct;
		Scanner info = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		name = info.next();
		System.out.print("Enter number of hours worked in a week: ");
		hours = info.nextDouble();		
		System.out.print("Enter hourly pay rate: ");
		payRate = info.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		fedDeduct = info.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		stateDeduct = info.nextDouble();
		grossPay = payRate * hours;
		totalDeduct = stateDeduct * grossPay + fedDeduct * grossPay;
		netPay = grossPay - totalDeduct;
		System.out.println();
		System.out.println("Employees Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + payRate);
		System.out.print("Gross Pay: $");
		System.out.printf("%-1.2f \n", grossPay);
		System.out.println("Deductions: \n");
		System.out.print("\t Federal Withholdings (");
		System.out.printf("%-1.2f", fedDeduct);
		System.out.print("%): $");
		System.out.printf("%-1.2f \n", grossPay * fedDeduct);
		System.out.print("\t State Withholdings (");
		System.out.printf("%-1.2f", stateDeduct);
		System.out.print("%): $");
		System.out.printf("%-1.2f \n", grossPay * stateDeduct);
		System.out.print("\t Total Deduction: $");
		System.out.printf("%-1.2f \n", totalDeduct );
		System.out.print("Net Pay: $");
		System.out.printf("%-1.2f", netPay);
	}
}
