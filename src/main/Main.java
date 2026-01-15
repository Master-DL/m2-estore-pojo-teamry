package main;

import core.services.*;

public class Main {

	public static void main(String[] args) {
		Provider prov = new Provider();
		Bank bank = new Bank();
		IStore IStore = new Store(prov,bank);
		Client cl = new Client(IStore);
		
		cl.run();

	}

}
