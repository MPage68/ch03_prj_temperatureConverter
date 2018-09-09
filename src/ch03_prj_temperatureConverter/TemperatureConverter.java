package ch03_prj_temperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the temperature converter\n");
		Scanner sc = new Scanner(System.in);
		// variables
		double celsius = 0.0;
		double fahrenheit = 0.0;
		String choice = "y";
		// while loop
		while (!choice.equalsIgnoreCase("n")) {
			// logic
			System.out.print("Enter degrees in Fahrenheit:\t");
			fahrenheit = sc.nextDouble();
			celsius = ((fahrenheit - 32) * 5 / 9);
			System.out.println("Degrees in Celscius:\t        " + celsius);
			System.out.print("Continue:\t(y/n)\t        ");
			choice = sc.next();

		}
		// goodbye, close scanner
		System.out.println("Goodbye");
		sc.close();

	}

}
