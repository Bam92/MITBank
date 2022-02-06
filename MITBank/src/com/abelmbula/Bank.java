package com.abelmbula;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Bank {
	private ArrayList<Client> clients;
	
	public Bank() {
		clients = new ArrayList<Client>();
	}
	
	public void addClient(Client newClient) {
		clients.add(newClient);
	}
	
	/**
	 * Do a deposit to an account
	 * @param id client id
	 * @param amount deposit amount
	 */
	public boolean deposit(int id, double amount) {
		try {
			Client currentClient = clients.get(id - 1);			
			double currentSolde = currentClient.getSolde();
			currentClient.setsolde(currentSolde + amount);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Client does not exist. Try again, please!");
			
			return false;
		}
		
		return true;
	}
	
	/**
	 * Withdraw money
	 * @param id client id
	 * @param amount withdrow amount
	 */
	public boolean withdrow(int id, double amount) {
		try {
			Client currentClient = clients.get(id - 1);			
			double currentSolde = currentClient.getSolde();
			
			if (currentSolde < amount) {
				System.out.println("Votre solde actuel ne permet pas de faire le retrait de ce montant");
				
				return false;
			}
			else 
				currentClient.setsolde(currentSolde - amount);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Client does not exist. Try again, please!");
			return false;
		}
		
		return true;
	}
	
	public void display() {
		System.out.println("Liste des clients: ");
	
	for (int i = 0; i < clients.size(); i++) {
		System.out.println("Info client:");
		System.out.println(
				"Numero: " + (i + 1) + " " + 
				"\n" + "Prenom: " + clients.get(i).getFirstName() + " " + 
				"\n" + "Nom: " + clients.get(i).getLastName().toUpperCase() + " " + 
				"\n" + "Solde: " + NumberFormat.getCurrencyInstance().format(clients.get(i).getSolde())
		);
		System.out.println("---------");
	}
	}
}
