import java.util.Arrays;
import java.util.Scanner;

public class anything {
	public static void main(String[] args) {
	int[] myList = {1, 2, 3, 4, 5, 6};
	System.out.println(myList.length);
	for (int i = myList.length-2; i >= 0; i--) {
	 myList[i + 1] = myList[i];
	}
	System.out.println(Arrays.toString(myList));
///	for (int e: myList)
	// System.out.print(e + " ");
		} 
}





