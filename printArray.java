import java.util.Scanner;
public class Lab2 {
	public static void main(String[] args) {
		int items;
		Scanner arrayMethods = new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		items = arrayMethods.nextInt();
		System.out.print("Enter the numbers: ");
		int[] myList = new int[items];
		for (int i = 0; i < myList.length; i++) {
			myList[i] = arrayMethods.nextInt();
		}
		arrayMethods.close();
		System.out.print("Your printed array: ");
		printArray(myList );
		System.out.println();
		System.out.print("Your copied printed array: ");
		copyArray(myList);
		printArray(copyArray(myList));
	}
	
	public static void printArray(int[] myList) { 
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " "); 
			}
	}
	
	public static int[] copyArray(int[] myList) {
		int myList2[] = new int[myList.length];
		for( int i = 0; i < myList.length; i++) {
			myList2[i] = myList[i] * 2;
		}
		return myList2;
	}
}
