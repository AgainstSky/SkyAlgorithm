package com.againstsky.alg.sort;

import edu.princeton.cs.algs4.StdRandom;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-09-09 15:12
 **/
public class QuickSort extends SkyAbstractSort {

    private static final int M = 15;


    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        //选定的切分元素
        Comparable temp = a[lo];
        while (true) {
            //从左侧找比temp大的
            while (less(a[++i], temp)) if (i >= hi) break;
            //从右侧找比temp小的
            while (less(temp, a[--j])) {
            }
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private void insertionSort(Comparable[] array, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            for (int j = i; j > lo && less(array[j], array[j - 1]); j--) {
                exch(array, j, j - 1);
            }
        }
    }

    private void sort(Comparable[] array, int lo, int hi) {
        if (hi <= lo + M) {
            //短数组用插入排序更快
            insertionSort(array, lo, hi);
            return;
        }
        int k = partition(array, lo, hi);
        sort(array, lo, k - 1);
        sort(array, k + 1, hi);
    }

    @Override
    public void sort(Comparable[] array) {
        super.sort(array);
        sort(array, 0, array.length - 1);
    }
}
