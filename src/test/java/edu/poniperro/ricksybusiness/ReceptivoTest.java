package edu.poniperro.ricksybusiness;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

public class ReceptivoTest extends TestCase {
    @Test
    public void receptivoCreado(){
        Receptivo receptivo = new Receptivo();
    }

    @Test
    public void registro(){
        Receptivo receptivo = new Receptivo();
        UfosPark ufos = new UfosPark();
        receptivo.registra(ufos);
    }

    @Test
    public void dispatch(){
        Receptivo receptivo = new Receptivo();
        receptivo.dispatch(new CreditCard("Jouad", "4916119711304546"));
    }
}