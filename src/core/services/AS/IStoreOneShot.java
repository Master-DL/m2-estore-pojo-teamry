package core.services.AS;

import core.data.Cart;
import core.data.Order;
import core.services.ASImpl.Client;
import estorePojo.exceptions.InsufficientBalanceException;
import estorePojo.exceptions.InvalidCartException;
import estorePojo.exceptions.UnknownAccountException;
import estorePojo.exceptions.UnknownItemException;

public interface IStoreOneShot {
    Order oneShotOrder(
            Client client,
            Object item,
            int qty,
            String address,
            String bankAccountRef
    )
            throws
            UnknownItemException,
            InsufficientBalanceException, UnknownAccountException;
}
