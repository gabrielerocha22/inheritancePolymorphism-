package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
//		Account acc = new Account(1001, "Gabriele", 1300.00);
//		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 1500.00, 300.00);
//
//		// upcasting - pega um obj to tipo businessAccount e atribui para uma variavel
//		// do tipo account
//
//		Account acc1 = bacc;
//		Account acc2 = new BusinessAccount(1003, "José", 1400.00, 0.0);
//		Account acc3 = new SavingAccount(1004, "Maria", 2.00, 0.02);
//
//		// downcasting - converte um objeto da superclasse para a subclasse
//		// precisa forcar o tipo
//		BusinessAccount acc4 = (BusinessAccount) acc2;
//		acc4.loan(100.0);
//
//		//BusinessAccount acc5 = (BusinessAccount) acc3;
//		if (acc3 instanceof BusinessAccount) {
//			BusinessAccount acc5 = (BusinessAccount) acc3;
//			acc5.loan(300.00);
//			System.out.println("Loan!");
//		}
//		
//		if(acc3 instanceof SavingAccount) {
//			SavingAccount acc5 = (SavingAccount) acc3;
//			acc5.updateBalance();
//			System.out.println("Update!");
//		}
		
		Account acc1 = new Account (1001, "Alex", 1000.0);
		acc1.withdraw(200.00);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.00);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003,"Joao", 1000.0, 500.00);
		acc3.withdraw(200.00);
		System.out.println(acc3.getBalance());
	}
}
