package lv.rvt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import rvt.PaymentCard;
import rvt.PaymentTerminal;

public class PaymentTerminalTest {
    @Test
    public void testPaymentsWithCash(){

        PaymentTerminal unicafeExactum = new PaymentTerminal();
        assertEquals(7.5, unicafeExactum.eatAffordably(10));
        
        assertEquals(2.5, unicafeExactum.eatAffordably(5));

        assertEquals(0.0, unicafeExactum.eatHeartily(4.3));

        assertEquals(4.0, unicafeExactum.eatHeartily(4));

        // String expected = "money: 1009.3, number of sold afforable meals: 2, number of sold hearty meals: 1";
        // assertEquals(expected, unicafeExactum);

    }


    @Test
    public void testPaymentsWithCard(){

        PaymentTerminal unicafeExactum = new PaymentTerminal();
        assertEquals(7.5, unicafeExactum.eatAffordably(10));
        
        PaymentCard annesCard = new PaymentCard(7);
        assertEquals(true, unicafeExactum.eatHeartily(annesCard));

        assertEquals(false, unicafeExactum.eatHeartily(annesCard));

        assertEquals(true, unicafeExactum.eatAffordably(annesCard));

        // String expected = "money: 1002.5, number of sold afforable meals: 2, number of sold hearty meals: 1";
        // assertEquals(expected, unicafeExactum);

    }

    @Test
    public void testAddMoneyToCard(){

        PaymentTerminal unicafeExactum = new PaymentTerminal();
        //assertEquals("money: 1000.0, number of sold afforable meals: 0, number of sold hearty meals: 0", unicafeExactum);
        
        PaymentCard annesCard = new PaymentCard(2);
        assertEquals(2.0, annesCard.balance());

        assertEquals(false, unicafeExactum.eatHeartily(annesCard));
        unicafeExactum.addMoneyToCard(annesCard, 100);


        assertEquals(true, unicafeExactum.eatHeartily(annesCard));
        assertEquals(97.7, annesCard.balance());

        //assertEquals("money: 1100.0, number of sold afforable meals: 0, number of sold hearty meals: 1", unicafeExactum);


    }
}
