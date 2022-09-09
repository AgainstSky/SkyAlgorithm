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
                case SHELL:
                    sort = new ShellSort();
                    break;
                case MERGER:
                    sort = new MergeSort();
                    break;
                case QUICK:
                    sort = new QuickSort();
                    break;
            }
            sortMap.put(key,sort);
            return sort;
        }
    }

    public static void sort(List<? extends Comparable<?>> datum) {
    }

    public static int[] sort(Comparable[] array) {
       return sort(array,SortKey.SELECTION);
    }

    public static int[] sort(Comparable[] array,SortKey key){
        ISort sort = getSort(key);
        sort.sort(array);
        if (sort instanceof SkyAbstractSort){
            return ((SkyAbstractSort)sort).getLastSortCount();
        }else return null;
    }

    public static boolean isSorted(Comparable[] array){
        ISort sort = getSort(SortKey.SELECTION);
        return sort.isSorted(array);
    }


}
