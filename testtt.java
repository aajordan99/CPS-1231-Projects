import java.util.Scanner;
public class testtt {
	public static void main(String[] args) {
		Scanner Test = new Scanner (System.in);
		String a,b;
		System.out.println("Enter");
		a = Test.next();
		System.out.println("1 down 1 to go");
		b = Test.next();
		if (a == b) {
			System.out.println(a + " " + b);
			System.out.println("Is " + a + " the same word as " + b + "?");
			
				System.out.println("Wrong");
		}
	}
}


