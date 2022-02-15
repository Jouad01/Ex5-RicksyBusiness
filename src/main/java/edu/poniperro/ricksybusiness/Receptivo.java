package edu.poniperro.ricksybusiness;

import java.util.ArrayList;

public class Receptivo {
    public Receptivo(){} // Pendiente
    private final ArrayList<GuestDispatcher> dispatchers = new ArrayList<GuestDispatcher>();

    public void registra(GuestDispatcher dispatcher){
        dispatchers.add(dispatcher);
    }

    public void dispatch(CreditCard card){
        for (GuestDispatcher dispatcher: dispatchers){
            dispatcher.dispatch(card);
        }
    }
}
