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

    public boolean pay(double credit) {
        if (this.credit - credit < 0){
            return false;
        }
        this.credit -= credit;
        return true;
    }

    public String number(){
        return this.number;
    }

    public String cardOwner(){
        return this.owner;
    }

    public double credit(){
        return this.credit;
    }

    @Override
    public String toString() {
            return "owner: " + this.owner
                    + "\nnumber: " + this.number
                    + "\ncredit: " + this.credit + this.SYMBOL;
        }

}