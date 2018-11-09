import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
public class lab3 {	
	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		int[] myList1 = new int[4];
		int[] myList2 = new int[4];
		int[] myList3 = new int[4];
		System.out.print("List1, Enter four numbers: ");
		for (int i = 0; i < myList1.length; i++) {
			myList1[i] = numbers.nextInt();
		}
		System.out.print("List2, Enter four numbers: ");
		for (int i = 0; i < myList2.length; i++) {
			myList2[i] = numbers.nextInt();
		}
		System.out.print("List3, Enter four numbers: ");
		for (int i = 0; i < myList3.length; i++) {
			myList3[i] = numbers.nextInt();
		}
		System.out.print("Your original List1: ");
		 printArray(myList1);
		 System.out.print("Your original List2: ");
		 printArray(myList2);
		 System.out.print("Your original List3: ");
		 printArray(myList3);
		 Arrays.sort(myList1);
		 Arrays.sort(myList2);
		 Arrays.sort(myList3);
		 System.out.print("List that are the same when sorted: ");
		 	if (Arrays.equals(myList1, myList2)){
		 		printArray(myList1);
		 	}
		 	else if (Arrays.equals(myList2, myList3)) {
		 		printArray(myList2);
		 	}	 
		 	else if (Arrays.equals(myList1, myList3)) {
		 		printArray(myList1);
		 	}	 
		 	else {
		 		System.out.println("None");
		 	}
		 System.out.print("Enter a number from the sorted list to search for: ");
		 int search = numbers.nextInt();
		 System.out.println("Value " + search + " os at index " + 
		 binarySearch(myList1, search) + " or position " + 
				 (binarySearch(myList1, search) + 1));	
		 numbers.close();
	}
	public static int binarySearch(int[] myList, int search) { 
			int low = 0; int high = myList.length-1;
			while (high >= low) { 
			int mid = (low + high) / 2;
			if (search < myList[mid]) high = mid -1; 
			else if (search == myList[mid]) return mid; 
			else low = mid + 1; 
			}
			return -1 -low;
			}
	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}

