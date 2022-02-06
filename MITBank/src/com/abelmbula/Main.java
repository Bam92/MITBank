package com.abelmbula;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Client abel = new Client("Abel", "Mbula", 0d);
		Client patience = new Client("Patience", "Kavira", 20d);
		Client jean = new Client("Jean", "LaCombe", 0d);
		Client aurelie = new Client("Aurelie", "Mambo", 20d);
		Client joseph = new Client("Joseph", "Lomata", 20d);
		
		Bank account = new Bank();
		account.addClient(patience);
		account.addClient(abel);
		account.addClient(jean);
		account.addClient(aurelie);
		account.addClient(joseph);
		
		System.out.println("*************************************************************");
		System.out.println("BIENVENUE CHEZ MITBANK !");
		System.out.println("*************************************************************");
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		while (true) {
			System.out.println("1. Ouvrir un compte client");
			System.out.println("2. Faire un versement sur compte");
			System.out.println("3. Faire un retrait sur compte");
			System.out.println("4. Afficher la liste des clients");
			System.out.println("0. Quitter le programme");
			
			choice = scanner.nextInt();
			
			// New client
			if (choice == 1) {
				System.out.println("Ouverture de compte");
				System.out.println("--------------------");
				System.out.print("Entrer le prenom du client : ");
				String firstName = scanner.next();
				System.out.print("Entrer le nom du client : ");
				String lastName = scanner.next();
				System.out.print("Entrer le montant initial (ex.: 200) : ");
				double amount = scanner.nextDouble();
				
				account.addClient(new Client(firstName, lastName, amount));
				
				System.out.println("Compte creer avec succes!");
			}
			
			// Deposit
			if (choice == 2) {
				System.out.println("Versement sur compte");
				System.out.println("--------------------");
				System.out.print("Entrer l'ID du client : ");
				int clientId = scanner.nextInt();
				System.out.print("Entrer le montant (ex.: 200) : ");
				double amount = scanner.nextDouble();
				
				// do deposit
				if (account.deposit(clientId, amount))
					System.out.println("Versement effectue avec succes!");
				
			}
			
			// Withdraw money as per user request
			if (choice == 3) {
				System.out.println("Retrait sur compte");
				System.out.println("--------------------");
				System.out.print("Entrer l'ID du client : ");
				int clientId = scanner.nextInt();
				System.out.print("Entrer le montant (ex.: 200) : ");
				double amount = scanner.nextDouble();
				
				// withdraw
				if (account.withdrow(clientId, amount))
					System.out.println("Operation effectuee avec succes!");
				
			}
			
			// Display clients
			if (choice == 4)
				account.display();
			
			if (choice == 0)
				break;
		}
		
		System.out.println("Merci d'avoir utilise le systeme MITBank.");
		
	}
	
//	scanner.close();
}


// https://stackoverflow.com/questions/33455789/nullpointerexception-when-adding-object-to-arraylist