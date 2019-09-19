package com.pereverzew.BubbleSort;

import java.util.ArrayList;
import java.util.logging.Logger;

public class BubbleSort <T extends Comparable>  {
    private static final Logger log = Logger.getLogger(String.valueOf(BubbleSort.class));


    public ArrayList<T> sort(ArrayList<T> array){
        if (array.size()==0){log.info("Array is empty. Illegal argument");return new ArrayList<T>();}
        for (int i = 0; i <array.size() ; i++) {
            for (int j = 0; j <array.size()-1-i ; j++) {
                T el1=array.get(j);
                T el2=array.get(j+1);

                if(el1.compareTo(el2)>0){
                    array.set(j+1, el1);
                    array.set(j,el2);
                }
            }
        }
        return array;
    }

}
