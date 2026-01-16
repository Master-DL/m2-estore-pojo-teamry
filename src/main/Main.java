package main;

import core.services.AS.IBank;
import core.services.AS.IProvider;
import core.services.AS.IStore;
import core.services.ASImpl.Bank;
import core.services.ASImpl.Client;
import core.services.ASImpl.Provider;
import core.services.ASImpl.Store;

public class Main {

	public static void main(String[] args) {
		IProvider prov = new Provider();
		IBank bank = new Bank();
		IStore store = new Store(prov,bank);
		Client cl = new Client(store);
		
		cl.run();

	}

}
