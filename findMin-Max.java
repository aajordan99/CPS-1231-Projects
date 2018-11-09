import java.util.Scanner;
public class Lab3 {
	public static void main(String[] args) {
		int a, b, c, d;
		Scanner loopvalue = new Scanner(System.in);
		System.out.println("Enter a value: ");
		a = loopvalue.nextInt();
		System.out.println("Enter a value: ");
		b = loopvalue.nextInt();
		System.out.println("Enter a value: ");
		c = loopvalue.nextInt();
		System.out.println("Enter a value: ");
		d = loopvalue.nextInt();
		int e = Math.max(a, Math.max(b, Math.max(c,d)));
		int f = Math.min(a, Math.min(b, Math.min(c, d)));
		System.out.println("Lowest:" + f + " Highest:" + e);
	}
}
