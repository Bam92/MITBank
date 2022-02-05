package com.abelmbula;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Client> clients;
	
	public Bank() {
		clients = new ArrayList<Client>();
	}
	
	public void addClient(Client newClient) {
		clients.add(newClient);
	}
	
	public void display() {
		System.out.println("Liste des clients: ");
	
	for (int i = 0; i < clients.size(); i++) {
		System.out.println("Client:");
		System.out.println(
				"Numero " + (i + 1) + " " + clients.get(i).getFirstName() + " " + clients.get(i).getLastName().toUpperCase() + " " + clients.get(i).getSolde()
				);
	}
	}
}
