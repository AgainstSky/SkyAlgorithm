package com.againstsky.alg.sort;

/**
 * @description: 选择排序
 * @author: AgainstSky
 * @create: 2022-09-05 14:45
 **/
public class SelectionSort extends SkyAbstractSort {

    @Override
    public void sort(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            int min=i;
            for (int j = i + 1; j < array.length; j++) {
                if (less(array[j],array[min])){
                    min = j;
                }
            }
            exch(array,i,min);
        }
    }
}
