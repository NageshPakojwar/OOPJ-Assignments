package org.Restaurant.domain;

import java.util.Scanner;

import org.Restaurant.domain.Restaurant;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean acceptRecord(Restaurant rest) {
		System.out.println("Enter the name of the dish");
		String name = sc.nextLine();
		System.out.println("Enter the price of the dish");
		String price = sc.nextLine();
		return rest.acceptDish(name, price);
	}
	
	public static boolean changePrice(Restaurant rest) {
		System.out.println("Enter the name of the dish for which you want to change the price");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter the updated price of the dish");
		String price = sc.nextLine();
		return rest.changePrice(name, price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant rest = new Restaurant();
		int choice;
		while(( choice = Restaurant.menu(rest)) != 5) {
			switch (choice) {
			case 1:
				rest.viewRecord();
				break;
			case 2: 
				System.out.println(acceptRecord(rest) ? "Success" : "Not Succesful");
				break;
			case 3: 
				System.out.println("Enter the name of the dish to be removed");
				System.out.println(rest.removeRecord(sc.nextLine())? "Success" : "Not found");
				break;
			case 4: 
				System.out.println(changePrice(rest) ? "Success" : "Not Succesful");
				break;
			}
		}
	}

}