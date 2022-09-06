package com.againstsky.alg.sort;

import java.util.Comparator;

/**
 * @description: 希尔排序
 * @author: AgainstSky
 * @create: 2022-09-06 11:22
 **/
public class ShellSort extends SkyAbstractSort {

    @Override
    public void sort(Comparable[] array) {
        super.sort(array);
        int N = array.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(array[j], array[j - h]); j -= h) {
                    exch(array, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
