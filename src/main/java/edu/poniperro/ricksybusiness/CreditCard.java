package edu.poniperro.ricksybusiness;

public class CreditCard {
    private final String owner; // Se declara y no se inicializa
    private final String number; // Metodo de seguridad segun el termi de los cojones
    private double credit = 3000;
    private final String SYMBOL = "EZI";

    public CreditCard(String owner, String number){
        this.owner = owner;
        this.number = number;
    }

    /* public boolean pay(double credit){
        this.credit = credit;
    } */
}