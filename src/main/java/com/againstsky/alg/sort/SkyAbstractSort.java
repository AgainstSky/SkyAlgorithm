package com.againstsky.alg.sort;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-09-05 11:26
 **/
@SuppressWarnings("unchecked")
public abstract class SkyAbstractSort implements ISort {

    protected boolean less(Comparable l, Comparable r) {
        return l.compareTo(r) < 0;
    }

    protected void exch(Comparable[] array,int i,int j){
        Comparable temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    @Override
    public boolean isSorted(Comparable[] array) {
        for (int i = 1; i < array.length; i++) {
            if (less(array[i],array[i-1])){
                return false;
            }
        }
        return true;
    }

    @Override
    public void print(Comparable[] array) {
        System.out.print("[");
        for (Comparable comparable : array) {
            System.out.print(comparable+",");
        }
        System.out.print("]");
    }
}
