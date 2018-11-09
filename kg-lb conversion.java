public class Ch5Lab1 {
	public static void main(String[] args) {
		double lb;
		int kg;
		String Kilo, Pound;
		Kilo = "Kilograms";
		Pound = "Pounds";
		kg = 1;
		lb = 1;
		System.out.printf("%-12s %-12s\n ", Kilo, Pound);
		while (kg <= 15) {
		System.out.printf("%-12d %-12.1f\n", kg , lb = kg * 2.20462 );
		kg += 2;
		lb += 2;
		}	
	}
}
