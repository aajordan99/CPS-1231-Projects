//Aaron Jordan
//Program 6
//This program shows how many vowels and consonants there are in a string
import java.util.Scanner;
public class jordanaa_Prog6 {
	public static void main(String[] args) {
		int count = 0;
		int count2 = 0;
		Scanner sValue = new Scanner(System.in);
		System.out.print("Enter a String:\n");
		String sample = sValue.nextLine();
		sample = sample.toLowerCase();

		for (int i = 0; i < sample.length(); i++) {
			char ch = sample.charAt(i);
			if (ch != ' ' && ch != '1' && ch != '2' && ch != '3' && ch != '4' && ch != '5' && ch != '6' && ch != '7' && ch != '8' && ch != '9' && ch != '0') {

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					count++;

				}
				else {
					count2++;
				}

			}

		}
		System.out.println("\"The number of vowels is " + count +  "\"" );
		System.out.println("\"The number of consonants is " + count2 +  "\"" );


	}
}
