package edu.poniperro.ricksybusiness;

import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher {
    private final double fee = 500d;
    private final Map<String, String> flota = new HashMap<String, String>(); // Poner string a hashmap (interfaz)


    public UfosPark() {
    }

    public void add(String ovni) {
        this.flota.put(ovni, null); // Añade ovni a flota sin asignar nada (null)
    }

    public String getUfoOf(String number) {
        String ufoID = null;
        if (this.flota.containsValue(number)) {
            for (Map.Entry <String, String> entry : this.flota.entrySet()) {
                if (entry.getValue() == number) {
                    ufoID = entry.getKey();
                    break;
                }
            }
        }
        return ufoID;
    }

    @Override
    public void dispatch(CreditCard card) {
        if (!containsCard(card.number())){
            for (String key : flota.keySet()){
                if (flota.get(key) == null && card.pay(fee)){
                    flota.replace(key, card.number());
                    break;
                }
            }
        }
    }

    // Testing

    public boolean containsCard(String card) {
        return this.flota.containsValue(card);
    }
}
