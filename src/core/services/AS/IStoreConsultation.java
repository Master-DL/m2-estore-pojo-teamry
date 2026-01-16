package core.services.AS;

import core.data.Cart;
import core.data.Order;
import core.services.ASImpl.Client;
import estorePojo.exceptions.InsufficientBalanceException;
import estorePojo.exceptions.InvalidCartException;
import estorePojo.exceptions.UnknownAccountException;
import estorePojo.exceptions.UnknownItemException;

public interface IStoreConsultation {
    double getPrice(Object item) throws UnknownItemException;

    boolean isAvailable(Object item, int qty)
    throws UnknownItemException;
}
