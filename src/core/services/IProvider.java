package core.services;

import estorePojo.exceptions.UnknownItemException;

public interface IProvider {
    int order(IStore IStore, Object item, int qty) throws UnknownItemException;
}
