package main;

import core.services.AS.IBank;
import core.services.AS.IProvider;
import core.services.AS.IStoreCart;
import core.services.AS.IStoreOneShot;
import core.services.ASImpl.Bank;
import core.services.ASImpl.Client;
import core.services.ASImpl.Provider;
import core.services.ASImpl.Store;

public class Main {

	public static void main(String[] args) {
		IProvider prov = new Provider();
		IBank bank = new Bank();
		IStoreCart storeC = new Store(prov,bank);
		IStoreOneShot storeOS = (IStoreOneShot)storeC;
		Client cl = new Client(storeC,storeOS);

		cl.run();

	}

}
