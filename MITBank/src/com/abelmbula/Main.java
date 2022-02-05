package com.abelmbula;

public class Main {

	public static void main(String[] args) {
		Client abel = new Client("Abel", "Mbula", 0d);
		Client angel = new Client("Angel", "Mbula", 20d);
		Client jean = new Client("Jean", "Mbula", 0d);
		Client aurelie = new Client("aurelie", "Mbula", 20d);
		Client joseph = new Client("Joseph", "Mbula", 20d);
		
		Bank account = new Bank();
		account.addClient(angel);
		account.addClient(abel);
		account.addClient(jean);
		account.addClient(aurelie);
		account.addClient(joseph);
		
		account.display();
		
	}

}


// https://stackoverflow.com/questions/33455789/nullpointerexception-when-adding-object-to-arraylist