package lv.rvt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import rvt.PaymentTerminal;

public class PaymentTerminalTest {
    @Test
    public void testPlusMethod(){

        PaymentTerminal unicafeExactum = new PaymentTerminal();
        assertEquals(7.5, unicafeExactum.eatAffordably(10));
        
        assertEquals(2.5, unicafeExactum.eatAffordably(5));

        assertEquals(0.0, unicafeExactum.eatHeartily(4.3));

        assertEquals(4.0, unicafeExactum.eatHeartily(4));

        String expected = "money: 1009.3, number of sold afforable meals: 2, number of sold hearty meals: 1";

        assertEquals(expected, unicafeExactum);

    }
}
