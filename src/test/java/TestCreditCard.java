import edu.poniperro.ricksybusiness.CreditCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCreditCard{

    private CreditCard card = null;

    @Before
    public void TestCreditCard(){
        card = new CreditCard("Jouad", "4916119711304546");
        assertNotNull("CreditCard creada", card);
    }

    @Test
    public void TestConstructor(){
        assertNotNull("CreditCard Creada", card);
        assertNotNull("4916119711304546", card);
    }

    @Test
    public void TestPay(){
        card.pay(3000);
        assertEquals(0, card.credit(),0);
    }

    @Test
    public void TestNopay(){
        card.pay(5000);
        assertNotEquals(0, card.credit(), 0);
    }

}
