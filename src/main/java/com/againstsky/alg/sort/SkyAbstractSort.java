package com.againstsky.alg.sort;

import java.util.Comparator;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-09-05 11:26
 **/
@SuppressWarnings("unchecked")
public abstract class SkyAbstractSort implements ISort {

    private int exchCount = 0, cmpCount = 0;

    public int[] getLastSortCount(){
        return new int[]{exchCount,cmpCount};
    }

    protected void clear() {
        exchCount = 0;
        cmpCount = 0;
    }

    @Override
    public void sort(Comparable[] array) {
        clear();
    }

    protected boolean less(Comparable l, Comparable r) {
        cmpCount++;
        return l.compareTo(r) < 0;
    }

    protected void exch(Object[] array, int i, int j) {
        exchCount++;
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    @Override
    public boolean isSorted(Comparable[] array) {
        for (int i = 1; i < array.length; i++) {
            if (less(array[i], array[i - 1])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void print(Object[] array) {
        System.out.print("[");
        for (Object comparable : array) {
            System.out.print(comparable + ",");
        }
        System.out.print("]");
    }
}
