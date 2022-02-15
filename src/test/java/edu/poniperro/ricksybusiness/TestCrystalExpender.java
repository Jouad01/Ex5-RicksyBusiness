package edu.poniperro.ricksybusiness;

import edu.poniperro.ricksybusiness.CreditCard;
import edu.poniperro.ricksybusiness.CrystalExpender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestCrystalExpender {

    private CrystalExpender expender = null;


    @Before
    public void setUp(){
        expender = new CrystalExpender(100, 500);
        assertNotNull("Expender creado", expender);
    }

    @Test
    public void dispatch(){
        CreditCard card = new CreditCard("Jouad", "4916119711304546");
        expender.dispatch(card);
        assertEquals(99, expender.stock());
    }



}
