package com.pereverzew.InsetionSort;

import org.apache.log4j.Logger;
import java.util.ArrayList;


public class InsertionSort <T extends Comparable> {
    private static final Logger log = Logger.getLogger(InsertionSort.class);

    public ArrayList<T> sort(ArrayList<T> array){
        if (array.size()==0){log.info("Array is empty. Illegal argument");return new ArrayList<T>();}
        for (int i = 1; i < array.size() ; i++) {
            T element= array.get(i);
            for (int j = i-1; j >= 0 ; j--) {
                if(element.compareTo(array.get(j))<0){
                    array.set(j+1,array.get(j));
                    array.set(j,element);
                }else{
                    break;
                }
            }
        }
        return array;
    }
}
