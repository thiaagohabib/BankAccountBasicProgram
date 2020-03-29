import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exception.DomainException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, initialBalance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		try {
			account.withdraw(amount);
			System.out.println("New balance:" + String.format("%.2f", account.getBalance()));
		}
		catch (DomainException e) {
			System.out.print("Withdraw error: " + e.getMessage());
		}
		
		
		
		sc.close();
		
	}

}
