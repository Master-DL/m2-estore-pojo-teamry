package core.services.AS;

import estorePojo.exceptions.UnknownItemException;

public interface IProvider {
    double getPrice(Object item) throws UnknownItemException;

    int order(IStoreCart IStoreCart, Object item, int qty) throws UnknownItemException;
}
