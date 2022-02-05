package com.abelmbula;

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
		account.display();
		
		// deposit
		account.deposit(1, 24.0);
		account.deposit(3, 14.0);
		
		//withdrow
		account.withdrow(3, 5.5);
		
		account.display();
		
	}

}


// https://stackoverflow.com/questions/33455789/nullpointerexception-when-adding-object-to-arraylist