import java.util.Scanner;
public class NestedLoop {
	public static void main(String[] args) {
		int input, i, j;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		input = reader.nextInt();
		System.out.println("Printing Triangle 1");
		triangle1(input);
		System.out.println("Printing Triangle 2");
		triangle2(input);
		System.out.println("Printing Triangle 3");
		triangle3(input);
	}
	public static void triangle1(int input) {
		char x = '*';
		int i, j;
		for (i = 1; i <= input; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(x);
			}
			System.out.println();
		}


	}
	public static void triangle2(int input) {
		char x = '*';
		int i, j;
		for (i = input; i > 0; i--) {
			for (j = i; j > 0; j--) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
	public static void triangle3(int input) {
		char x = '*';
		int i, j;
		for (i = input; i > 0; i--) {
			for(int y = 0; y < i; y++) 
				System.out.print(" ");
			for (j = i; j > 0; j--) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
}

