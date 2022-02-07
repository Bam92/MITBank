package com.abelmbula;

import java.util.Iterator;

public class Client {
	private String firstName;
	private String lastName;
	private double solde;

	public Client (String firstName, String lastName, double solde) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.solde = solde;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public void setsolde(double solde) {
		this.solde = solde;
	}

}
