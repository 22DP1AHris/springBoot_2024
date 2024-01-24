package lv.rvt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import rvt.PaymentCard;

public class PaymentCardTest {
    @Test
    public void testTakeMoney(){
        PaymentCard petesCard = new PaymentCard(10);
        assertEquals(10.0, petesCard.balance());
        
        boolean wasSuccessful = petesCard.takeMoney(8);
        assertEquals(true, wasSuccessful);
        assertEquals(2.0, petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        assertEquals(false, wasSuccessful);
        assertEquals(2.0, petesCard.balance());

    }
}
