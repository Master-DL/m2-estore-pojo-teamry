package core.services.AS;

import estorePojo.exceptions.UnknownItemException;

public interface IProvider {
    double getPrice(Object item) throws UnknownItemException;

    int order(IStore IStore, Object item, int qty) throws UnknownItemException;
}
