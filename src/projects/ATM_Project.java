package projects;

import java.util.Scanner;
public class ATM_Project {
	private double balance;
	private Scanner scanner;
	
	ATM_Project(){
		balance=1000.00;
		scanner=new Scanner(System.in);
														
	}
	
	public void displayMenu() {
		System.out.println("ATM Menu :");
		System.out.println("1. CheckBalance ");
		System.out.println("2. Deposit Money ");
		System.out.println("3. WithDraw Money ");
		System.out.println("4. Exit");
	}
	
	public void CheckBalance() {
		System.out.println("Avaliable Balance is :"+balance);
		
	}
	
	public void Deposit() {
		System.out.println("Please enter Deposit Amount ");
		int amount=scanner.nextInt();
		balance=balance+amount;
		System.out.println("Deposited Successfully");
	}
	
	public void Withdraw() {
		System.out.println("Enter Enter withdraw amount ");
		int amount=scanner.nextInt();
		if(amount<balance) {
		balance=balance-amount;
		System.out.println("Amount Withdrawn Successfully , Thank You !");
		}
		else {
			System.out.println("Please Enter a Valid Amount ");
		}
		
	}
	public static void main(String[] args) {
		ATM_Project sc=new ATM_Project();
		
		while(true) {
			sc.displayMenu();
			System.out.println("Enter a choice Here :");
			int choice=sc.scanner.nextInt();
			
			switch(choice) {
			
			case 1:
				sc.CheckBalance();
				break;
			case 2:
				sc.Deposit();
				break;
			case 3:
				sc.Withdraw();
				break;
			case 4:
				System.out.println("Thank you for using ATM, Good Bye");
				break;
			default:
				System.out.println("Please enter a valid option");
			}
		}
	}

}
