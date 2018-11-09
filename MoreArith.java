	//Aaron Jordan
	//Lab Assignment 4
	//Due: 9/18/17
public class MoreArith {
	public static void main(String[] args) {
		System.out.print("pi is ");
		System.out.println(Math.PI);
		System.out.print("Pi * 2 is ");
		System.out.println(Math.PI * 2);
		System.out.print("Pi^2 is ");
		System.out.println(Math.pow(Math.PI, 2));
		System.out.println(5.2534e+1);
		
		int a = 6;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		a = 6;
		b = ++a;
		System.out.println(a);
		System.out.println(b);

		
		float f = 12.5F;
		int i = (int)f;
		System.out.println("f is " + f);
		System.out.println("i is " + i);

		double amount = 5;
		System.out.println(amount / 2);
		System.out.println(5 / 2);

	}
}
