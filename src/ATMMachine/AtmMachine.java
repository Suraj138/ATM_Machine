package ATMMachine;

import java.util.Scanner;

class ATM {

	float Balance;
	int Pin = 123;

	public void checkpin() {
		System.out.println("Enter your PIN : ");
		Scanner sc = new Scanner(System.in);
		int enterpin = sc.nextInt();
		if (enterpin == Pin) {
			menu();
		} else {
			System.out.println("Enter a correct valid pin : ");
			checkpin();
		}	
	}

	public void menu() {
		System.out.println("Enter Your Choice No. : ");
		System.out.println("1. Check A/C Balance ");
		System.out.println("2. Withdraw Money Amount ");
		System.out.println("3. Deposit Money Amount ");
		System.out.println("4. Exit ");

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();

		if (option == 1) {
			checkBalance();
		} else if (option == 2) {
			withdrawMoney();
		} else if (option == 3) {
			depositMoney();
		} else if (option == 4) {
			exit();
			return;
		} else {
			System.out.println("Enter a valid choice : ");
			System.out.println(" ");
		}
	}

	public void checkBalance() {
		System.out.println("Balance : " + Balance);
		menu();
	}

	public void withdrawMoney() {
		System.out.println("Enter Amount To Withdraw  ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if (amount > Balance) {
			System.out.println("Insufficient Balance ");
			System.out.println(" ");
		} else {
			Balance = Balance - amount;
			System.out.println("Money Withdraw Succesfully :" + amount);
			System.out.println(" ");
		}
		menu();
	}

	public void depositMoney() {
		System.out.println("Enter the Amount : ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance = Balance + amount;
		System.out.println("Money Deposited Successfully " + amount);
		System.out.println(" ");
		menu();
	}
	
	public void exit() {
		System.out.println("Thank You Sir ");
	}

}

public class AtmMachine {
	public static void main(String[] args) {
		ATM obj = new ATM();
		obj.checkpin();
	}
}
