package com.againstsky.alg.sort;

import java.util.Comparator;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-09-05 11:26
 **/
@SuppressWarnings("unchecked")
public abstract class SkyAbstractSort implements ISort {

    protected abstract void sort(Comparable[] array, Comparator cmp);

    protected boolean less(Object l, Object r, Comparator cmp) {
        if (cmp == null){
            return less(l,r);
        }
        return cmp.compare(l, r) < 0;
    }

    private boolean less(Comparable l, Comparable r) {
        return l.compareTo(r) < 0;
    }

    private boolean less(Object l,Object r){
        if (l instanceof Comparable && r instanceof Comparable){
            return less((Comparable) l,(Comparable) r);
        }else {
            throw new RuntimeException("无法比较的值");
        }
    }

    @Override
    public void sort(Object[] array, Comparator cmp) {
        if (cmp == null && !(array[0] instanceof Comparable)) {
            throw new RuntimeException("无法比较的值");
        }
        sort((Comparable[]) array, cmp);
    }

    @Override
    public void sort(Comparable[] array) {
        sort(array,null);
    }


    protected void exch(Object[] array, int i, int j) {
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
