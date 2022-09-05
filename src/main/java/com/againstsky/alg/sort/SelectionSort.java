package com.againstsky.alg.sort;

import java.util.Comparator;

/**
 * @description: 选择排序
 *
 * @author: AgainstSky
 * @create: 2022-09-05 14:45
 **/
public class SelectionSort extends SkyAbstractSort {

    @Override
    protected void sort(Comparable[] array, Comparator cmp) {
        int N = array.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++)
                if (less(array[j], array[min],cmp)) min = j;
            exch(array, i, min);
        }
    }
}
