package com.practice.designs;

import java.math.BigDecimal;
import java.util.Scanner;

public class VendingMachineTest {

	private static final Coin PENNY = new Coin(BigDecimal.ONE);
	private static final Coin NICKEL = new Coin(BigDecimal.valueOf(5));
	private static final Coin DIME = new Coin(BigDecimal.TEN);
	private static final Coin QUARTER = new Coin(BigDecimal.valueOf(25));

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Which drink u want? Select number as below");
			System.out.println("Drinks.COKE ===> "+(Drinks.COKE.ordinal()+1));
			System.out.println("Drinks.PEPSI ===> "+(Drinks.PEPSI.ordinal()+1));
			System.out.println("Drinks.SODA ===> "+(Drinks.SODA.ordinal()+1));
			System.out.println("Exit, Any other number ===> ");

			String drinkOptionStr = scanner.next();
			int drinkOption = getDrinkOption(drinkOptionStr);

			if (drinkOption == 0) {
				return;
			}

			drinkOption = drinkOption-1;
			if (Drinks.COKE.ordinal() != drinkOption
			&& Drinks.PEPSI.ordinal() != drinkOption && Drinks.SODA.ordinal() != drinkOption) {
				System.out.println("Exiting.. Not valid option");
				System.exit(0);
				return;
			}
			Drinks selectedDrink = Drinks.values()[drinkOption];
			BigDecimal selectedDrinkPrice = selectedDrink.getValue();

			System.out.println("How many PENNY");
			int penny = scanner.nextInt();
			System.out.println("How many NICKEL");
			int nickel = scanner.nextInt();
			System.out.println("How many DIME");
			int dime = scanner.nextInt();
			System.out.println("How many QUARTER");
			int quarter = scanner.nextInt();

			BigDecimal totalPennies = PENNY.getAmount().multiply(BigDecimal.valueOf(penny));
			BigDecimal totalNickels = NICKEL.getAmount().multiply(BigDecimal.valueOf(nickel));
			BigDecimal totalDimes = DIME.getAmount().multiply(BigDecimal.valueOf(dime));
			BigDecimal totalQuarters = QUARTER.getAmount().multiply(BigDecimal.valueOf(quarter));

			BigDecimal totalAmount = totalPennies.add(totalNickels).add(totalDimes).add(totalQuarters);

			System.out.println("Total Amount paid by you: "+totalAmount);
			System.out.println("Selected Drink price: "+selectedDrinkPrice);
			if (totalAmount.compareTo(selectedDrinkPrice) < 0 ) {
				System.out.println("Not enough money to buy");
				return;
			}
			if (totalAmount.compareTo(selectedDrinkPrice) == 0 ) {
				System.out.println("Dispensing drink: "+selectedDrink);
				return;
			}
			if (totalAmount.compareTo(selectedDrinkPrice) > 0 ) {
				System.out.println("Dispensing drink: "+selectedDrink);
				System.out.println("Refunding cash: "+ (totalAmount.subtract(selectedDrinkPrice)));
				return;
			}
		}

	}

	private static int getDrinkOption(String drinkOptionStr) {
		int drinkOption = 0;
		try {
			drinkOption = Integer.parseInt(drinkOptionStr);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid input option, exception message ==> "+ex.getMessage());
		}
		return drinkOption;
	}
}