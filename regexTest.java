import java.util.Scanner;
public class regexTest {
	public static void main(String[] args) {
		int count = 0;
		int count2 = 0;
		Scanner sValue = new Scanner(System.in);
		System.out.print("Enter a String:\n");
		String sample = sValue.nextLine();
		sample = sample.toLowerCase();

		for (int i = 0; i < sample.length(); i++) {
			
			String ch = sample.substring(i,i+1);
			String vowels = "[aeiou]";
			
			if (ch.matches("[a-z]")) {

				if (ch.matches(vowels)) {
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
