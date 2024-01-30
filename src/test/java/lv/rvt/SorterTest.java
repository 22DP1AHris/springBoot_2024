package lv.rvt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import rvt.Sorter;

public class SorterTest {

    @Test
    public void smallestTest(){
        int[] myArray = {3, 6, -5, 8, 0, 1, -3, 4, -4};

        Sorter sortingThing = new Sorter();
        assertEquals(-5, sortingThing.smallest(myArray));

        assertEquals(2, sortingThing.indexOfSmallest(myArray));
    }

    @Test
    public void blablablaTest(){
        int[] numbers = {-1, 6, 9, 8, 12};

        Sorter sortingThing = new Sorter();
        assertEquals(0, sortingThing.indexOfSmallestFrom(numbers, 0));

        assertEquals(1, sortingThing.indexOfSmallestFrom(numbers, 1));
        assertEquals(3, sortingThing.indexOfSmallestFrom(numbers, 2));
    }
}
