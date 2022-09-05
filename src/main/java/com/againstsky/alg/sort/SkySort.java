package com.againstsky.alg.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-08-30 10:59
 **/
public class SkySort {

    private static HashMap<SortKey,ISort> sortMap;

    static {
        init();
    }
    private static void init(){
        sortMap = new HashMap<>();
    }

    private static ISort getSort(SortKey key){
        if (sortMap.containsKey(key)){
            return sortMap.get(key);
        }else {
            ISort sort = null;
            switch (key){
                case INSERTION:
                    sort = new InsertionSort();
                    break;
                case SELECTION:
                    sort = new SelectionSort();
                    break;
            }
            sortMap.put(key,sort);
            return sort;
        }
    }

    public static void sort(List<? extends Comparable<?>> datum) {
    }

    public static void sort(Comparable[] array) {
       sort(array,SortKey.SELECTION);
    }

    public static void sort(Comparable[] array,SortKey key){
        ISort sort = getSort(key);
        sort.sort(array);
    }

    public static boolean isSorted(Comparable[] array){
        ISort sort = getSort(SortKey.SELECTION);
        return sort.isSorted(array);
    }


}
