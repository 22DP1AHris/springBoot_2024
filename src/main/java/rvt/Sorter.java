package rvt;
import java.util.*;

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
        for (int i=0; i<array.length; i++){
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

    public void swap(int[] array, int index1, int index2) {
        int value1 = array[index1];

        array[index1] = array[index2];
        array[index2] = value1;

    }

    public void sort(int[] array) {
        for (int i=0; i<array.length; i++){
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}