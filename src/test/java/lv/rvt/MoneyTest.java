package lv.rvt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import rvt.Money;;

public class MoneyTest {
    @Test
    public void testPlusMethod(){
        Money mon1 = new Money(6, 10);
        Money mon2 = new Money(5, 50);

        Money resultplus = mon1.plus(mon2);
        Money resultminus = mon1.minuss(mon2);

        assertEquals(11, resultplus.euros());
        assertEquals(60, resultplus.cents());

        assertEquals(0, resultminus.euros());
        assertEquals(60, resultminus.cents());

    }
}
