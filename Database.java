import java.util.Scanner;
public class Database {
		@SuppressWarnings("resource")
		public static void main(String[] args) {
		String y;
		String n = "n";
		String p1, p2, first_Name, last_Name, dob, email_Address, confirm;
		Scanner info = new Scanner(System.in);
		do
		while (n.equalsIgnoreCase("N") == false) {
			System.out.println("Please Enter your First Name");	
			first_Name = info.next();
			System.out.println("Please Enter your Last Name");	
			last_Name = info.next();
			System.out.println();
			System.out.println("Is this information correct? Y/N");
			confirm = info.next();
			System.out.println(first_Name + " " + last_Name);
			System.out.println();
			System.out.println("Please enter your date of birth.(mm/dd/year)");	
			dob = info.next();
			System.out.println("Please enter your email address.");
			email_Address = info.next();
			System.out.print("Please enter a password.\n");
			p1 = info.next();
			System.out.println("Confirm your password");
			p2 = info.next();
			p1.equals(p2);
			if (p1.equals(p2) == false) {
							while (p1.equals(p2) == false) {
								System.out.println("Passwords don't match.");
								p2 = info.next();
							}
			}
			System.out.println("Congratulations! " + first_Name + "your information"
								+ "has been saved and you are now registered for this database.");

			System.out.println("Would you like to restart?");
			n = info.next();
		}while (n.equalsIgnoreCase("N") == false);
	}
}







