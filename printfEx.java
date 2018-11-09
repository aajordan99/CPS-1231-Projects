//These variables should be named differently since it can get confusing to follow.
public class Ch4Lab4 {
	public static void main(String[] args) {
		String a, b, c, d, e, f, g, x, y, z;
		double h, i, j;
		int k, l, m;
		char n, o, p;
		a = "Name";
		b = "Lab";
		c = "Bonus";
		d = "Total";
		e = "Joe";
		f = "William";
		g = "Mary Sue";
		h = 50.5;
		i = 58.2;
		j = 49.9;
		k = 7;
		l = 8;
		m = 10;
		n = 'C';
		o = 'B';
		p = 'G';
		x = "-----";
		y = "---";
		z = "----";
		System.out.print("////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \n");
		System.out.print("=============Student Points============= \n");
		System.out.print("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//////////////////// \n");
		System.out.print("\n");
		System.out.printf("%-10s  %-10s %-10s %s\n", a, b, c, d);     
		System.out.printf("%-10s  %-10s %-10s %s\n", z, y, x, x);  
		System.out.printf("%-10s  %-10c %-10d %-10.1f \n", e, n, k, h);
		System.out.printf("%-10s  %-10c %-10d %-10.1f \n", f, o, l, i);
		System.out.printf("%-10s  %-10c %-10d %-10.1f", g, p, m, j);	
	}
}
