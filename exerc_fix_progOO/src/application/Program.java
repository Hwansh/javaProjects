package application;

import java.util.Scanner;
import java.util.Locale;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = scan.nextDouble();
		
		System.out.print("How many dollar will be bought? ");
		double value = scan.nextDouble();
		
		double inReais = CurrencyConverter.converter(price, value);
		
		System.out.printf("Amout to be paid in reais = %.2f", inReais);
		
		scan.close();
	}

}
