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

        int element = smallest(array);
        int index = -1;
        for (int i=0; i<array.length-1; i++){
            if (array[i] == element){
                index = i;
            }
        }
        return index;

    }

    public int indexOfSmallestFrom(int[] array, int startIndex) {
        int[] newArray = Arrays.copyOfRange(array, startIndex, array.length);  
        return indexOfSmallest(newArray) + startIndex;
    }

}
