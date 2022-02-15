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
            for (Map.Entry<String, String> entry : this.flota.entrySet()) {
                if (entry.getValue() == number) {
                    ufoID = entry.getKey();
                    break;
                }
            }
        }
        return ufoID;
    }


  /*  public boolean containsCard(String number) {
    }*/

    @Override
    public void dispatch(CreditCard card) {

    }

    public boolean containsCard(String number) {
        return false;
    }
}
