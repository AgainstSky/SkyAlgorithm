package com.againstsky.alg.sort;

import java.util.Comparator;

/**
 * 插入排序
 */
public class InsertionSort extends SkyAbstractSort {


    @Override
    public void sort(Comparable[] array) {
        super.sort(array);
        int N = array.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(array[j], array[j - 1]); j--) {
                exch(array, j - 1, j);
            }
        }
    }


}
