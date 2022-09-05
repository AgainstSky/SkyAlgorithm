package com.againstsky.alg.sort;

/**
 * 选择排序
 */
public class InsertionSort extends SkyAbstractSort {

    @Override
    public void sort(Comparable[] array) {
        int N = array.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (less(array[j], array[j - 1])) {
                    exch(array, j - 1, j);
                }
            }
        }
    }
}