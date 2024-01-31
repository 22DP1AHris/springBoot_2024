package lv.rvt;

import static org.junit.Assert.assertArrayEquals;
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

    @Test
    public void swapTest(){
        int[] numbers = {3, 2, 5, 4, 8};
        Sorter sortingThing = new Sorter();
        sortingThing.swap(numbers, 1, 0);

        int[] tester = {2, 3, 5, 4, 8};
        assertArrayEquals(tester, numbers);

        sortingThing.swap(numbers, 0, 3);
        int[] tester2 = {4, 3, 5, 2, 8};
        assertArrayEquals(tester2, numbers);
        
    }

    @Test
    public void sortTest(){
        int[] wow = {8, 3, 7, 9, 1, 2, 4};
        Sorter sortingThing = new Sorter();
        sortingThing.sort(wow);

        int[] tester = {1, 2, 3, 4, 7, 8, 9};
        // assertEquals(tester, wow);
        assertArrayEquals(tester, wow);        
    }
}
