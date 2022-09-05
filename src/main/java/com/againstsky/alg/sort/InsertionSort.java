package com.againstsky.alg.sort;

import java.util.Comparator;

/**
 * 选择排序
 */
public class InsertionSort extends SkyAbstractSort {


    protected void sort(Comparable[] array, Comparator cmp) {
        int N = array.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (less(array[j], array[j - 1], cmp)) {
                    exch(array, j - 1, j);
                }
            }
        }
    }


}
