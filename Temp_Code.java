import java.util.Scanner;
public class Temp_Code {
	public static void main(String[] args) {
	String first_Name;
	String last_Name;
	String dob;
	String email_Address;
	Scanner info = new Scanner (System.in);
	System.out.println("Please Enter your First Name");	
	first_Name = info.next();
	System.out.println("Please Enter your Last Name");	
	last_Name = info.next();
	System.out.println();
	System.out.println("Is this information correct?");
	System.out.println();
	System.out.println(first_Name + " " + last_Name);
	System.out.println("Please enter your date of birth.(mm/dd/year)");	
	dob = info.next();
	System.out.println("Please enter your email address.");
	email_Address = info.next();
	System.out.println("Congratulations! " + first_Name + "your information"
			+ "has been saved and you are now registered for this database.");
	}
}