package rvt;
import java.util.*;

import org.apache.commons.lang3.ArrayUtils;

public class Sorter {
    
    public int smallest(int[] array){
        int min = array[0];
        for(int i=0; i<array.length; i++) { 
            
            if(array[i] < min) {
               min = array[i];
            }
        }

        return min;
    }

    public int indexOfSmallest(int[] array){
        return ArrayUtils.indexOf(array, smallest(array));

    }

    public int indexOfSmallestFrom(int[] array, int startIndex) {
        int min = array[startIndex];
        for(int i = startIndex; i< array.length; i++) { 

            if(array[i] < min) {
               min = array[i];
            }
        }

        return ArrayUtils.indexOf(array, min);
    }
}
