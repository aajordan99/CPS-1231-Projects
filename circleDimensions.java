package ch2lab1pt2;
import java.util.*;
	public class part2 {
		public static void main(String[] args) {
			double radius;
			double area;
			Scanner reader = new Scanner (System.in);
			// Step 1: read the radius
			System.out.println("Enter the radius: ");
			radius = reader.nextDouble();
			// Step 2: compute the area
			area = radius * radius * Math.PI;
			// Step 3: display the area
			System.out.println("The area of the circle with radius " + radius +
			" is " + area);
	}

}
