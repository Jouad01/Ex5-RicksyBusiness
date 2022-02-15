package edu.poniperro.ricksybusiness;

import edu.poniperro.ricksybusiness.CreditCard;
import edu.poniperro.ricksybusiness.UfosPark;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestUfosPark {

    UfosPark ufos = null;
    String[] ovnis = { "unx", "dox" };

    @Before
    public void setUp(){
        ufos = new UfosPark();
        assertNotNull("Parque de UFOS creado", ufos);
        for (String ovni : ovnis){
            ufos.add(ovni);
        }
    }

    @Test
    public void TestgetUfo(){
        CreditCard card = new CreditCard("Jouad", "4916119711304546");
        ufos.dispatch(card);
        assertEquals(2500, card.credit(), 0);
    }

    @Test
    public void Testdispatch(){
        CreditCard card = new CreditCard("Jouad", "4916119711304546");
        ufos.dispatch(card);
        assertTrue(ufos.containsCard(card.number()));
        assertEquals(2500, card.credit(), 0);
    }
}
