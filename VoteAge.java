import java.util.Scanner;
public class VoteAge {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age");
		Scanner voter = new Scanner(System.in);
		age = voter.nextInt();
		if (age >= 18) {
			System.out.println("You are " + age + " years old, old enough to vote.");
		}
		else if (age < 18) {
			System.out.println("You are " + age + " years old, not old enough to vote");
		}
	}

}
