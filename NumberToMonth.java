import java.util.Scanner;
public class NumberToMonth {
	public static void main(String[] args) {
	int monthOfTheYear;
	System.out.println("Enter the month of the year - number 1 to 12");
	Scanner month = new Scanner (System.in);
	monthOfTheYear = month.nextInt();
	if (monthOfTheYear == 1){
		System.out.println("The month is January");}
		else if (monthOfTheYear == 2) {
			System.out.println("The month is February");}
		else if (monthOfTheYear == 3) {
			System.out.println("The month is March");}
		else if  (monthOfTheYear == 4) {
			System.out.println("The month is April");}
		else if  (monthOfTheYear == 5) {
			System.out.println("The month is May");}
		else if  (monthOfTheYear == 6) {
			System.out.println("The month is June");}
		else if  (monthOfTheYear == 7) {
			System.out.println("The month is July");}
		else if  (monthOfTheYear == 8) {
			System.out.println("The month is August");}
		else if  (monthOfTheYear == 9) {
			System.out.println("The month is September");}
		else if  (monthOfTheYear == 10) {
			System.out.println("The month is October");}
		else if  (monthOfTheYear == 11) {
			System.out.println("The month is November");}
		else if  (monthOfTheYear == 12) {
			System.out.println("The month is December");}	
	}
	}

