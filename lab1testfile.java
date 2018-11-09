import java.util.Scanner;
public class lab1testfile {
	public static void main(String[] args) {
		System.out.println("Enter number of items: ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		double[] myList = new double[x];
		double total = 0;
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < myList.length; i++) 
		{
			myList[i] = input.nextDouble();
			total += myList[i];
		}
		double myAverage = total / x;
		System.out.println("Average: " + myAverage);
		int count = 0;
		for (double i: myList) 
		{
			if (i > myAverage) {
				count++;		
			}
		}
		System.out.println("Number of elements above average is " + count);
		System.out.println(myList);
	}
}


