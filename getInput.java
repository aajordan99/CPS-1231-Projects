//Aaron Jordan
//Chapter 2 Lab 1
//Due 9/25/17
public class Ch2Lab1 {
	public static void main(String[] args) {
		int test1, test2, test3;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter test 1");
		test1 = reader.nextInt();
		System.out.println("Enter test 2");
		test2 = reader.nextInt();
		System.out.println("Enter test 3");
		test3 = reader.nextInt();
		int average = test1 + test2 + test3 / 3;
		System.out.println("The average is " + average); 
	}
}
