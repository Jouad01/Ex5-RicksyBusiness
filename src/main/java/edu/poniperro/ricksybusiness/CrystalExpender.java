package edu.poniperro.ricksybusiness;

public class CrystalExpender implements GuestDispatcher {
    private int stock = 0;
    private double itemCost = 500;

    public CrystalExpender(int stock, double itemCost){
        this.stock = stock;
        this.itemCost = itemCost;
    }

    @Override
    public void dispatch(CreditCard card) {
        if (this.stock == 0){
            return;
        }
        if (card.pay(itemCost)){
            stock -= 1;
        }
    }

    @Override
    public String toString() {
        return "CrystalExpender{" +
                "stock=" + this.stock +
                ", itemCost=" + this.itemCost +
                '}';
    }

    public int stock(){
        return this.stock;
    }
}
