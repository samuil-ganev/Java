package part1;

public class zad1 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		double wavelength;
		System.out.println("Enter a color code");
		wavelength = Double.parseDouble(sc.next());
		String color = "";
		
		if (wavelength <= 750 && wavelength >= 620) {
			color = "Red";
		} else if (wavelength >= 590) {
			color = "Orange";
		} else if (wavelength >= 570) {
			color = "Yellow";
		} else if (wavelength >= 495) {
			color = "Green";
		} else if (wavelength >= 450) {
			color = "Blue";
		} else if (wavelength >= 380) {
			color = "Violet";
		}
		
		if (color == "") {
			System.out.println("The entered wavelength is not a part of the visible spectrum");
		} else {
			System.out.println("The color is " + color);
		}
		
		sc.close();

	}

}
