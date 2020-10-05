package part1;

public class zad4 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int a, b, c, S;
		double x = 0, y = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		S = 2 * (a * b + a * c + b * c) - b * c;
		
		if (S % 140 > 90 || S % 140 == 0) {
			x = Math.ceil(S / 140.0);
			y = Math.ceil(S / 140.0 / 30);
		} else {
			y = Math.ceil(S / 30.0);
		}
		
		System.out.println("5: " + (int)x + "\n1: " + (int)y);
		
		sc.close();

	}

}
