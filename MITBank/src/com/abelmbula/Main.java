package com.abelmbula;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Initial data
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
		
		while (true) {
			// Menu
			System.out.println("1. Ouvrir un compte client");
			System.out.println("2. Faire un versement sur compte");
			System.out.println("3. Faire un retrait sur compte");
			System.out.println("4. Afficher la liste des clients");
			System.out.println("0. Quitter le programme");
			
			Scanner scanner = new Scanner(System.in);
			byte choice = scanner.nextByte();
			double amount;
			int clientId;
			
			switch (choice) {
			case 1: // New client
				System.out.println("Ouverture de compte");
				System.out.println("--------------------");
				System.out.print("Entrer le prenom du client : ");
				String firstName = scanner.next();
				System.out.print("Entrer le nom du client : ");
				String lastName = scanner.next();
				final double INITIAL_AMOUNT = 0.0;
				
				account.addClient(new Client(firstName, lastName, INITIAL_AMOUNT));
				
				System.out.println("Compte cree avec succes!");
				break;
			
			case 2: // Deposit
				System.out.println("Versement sur compte");
				System.out.println("--------------------");
				System.out.print("Entrer l'ID du client : ");
				clientId = scanner.nextInt();
				System.out.print("Entrer le montant (ex.: 200) : ");
				amount = scanner.nextDouble();
				
				// do deposit
				if (account.deposit(clientId, amount))
					System.out.println("Versement effectue avec succes!");
				break;
				
			case 3: // Withdraw money as per user request
				System.out.println("Retrait sur compte");
				System.out.println("--------------------");
				System.out.print("Entrer l'ID du client : ");
				clientId = scanner.nextInt();
				System.out.print("Entrer le montant (ex.: 200) : ");
				amount = scanner.nextDouble();
				
				// withdraw
				if (account.withdraw(clientId, amount))
					System.out.println("Operation effectuee avec succes!");
				break;
			case 4: // Show clients list
				account.display();
				break;
				
			default:
				System.out.println("Merci d'avoir utilise le systeme MITBank.");
				System.exit(0); // shutdown the JVM: 0: normal 1: error
				scanner.close();
			}
		}	
	}
}
