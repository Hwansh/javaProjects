package application;

import java.text.ParseException;
import java.util.Scanner;

import entities.Rent;

public class Program {
	public static void main(String[] args) throws ParseException{
		Scanner input = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many vect will be rented? ");
		int quantityRented = input.nextInt();

		for (int i=1; i<=quantityRented; i++) {
			System.out.println();
			System.out.println("Rent #"+ i + ":");
			System.out.printf("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.printf("Email: ");
			String email = input.nextLine();
			System.out.printf("Room: ");
			int room = input.nextInt();
			System.out.println();
			vect[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy vect:");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": "+ vect[i]);
			}
		}
		
		input.close();
	}

}
