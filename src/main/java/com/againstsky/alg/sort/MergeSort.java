package com.againstsky.alg.sort;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-09-08 17:43
 **/
public class MergeSort extends SkyAbstractSort {

    Comparable[] temp;

    private void merge(Comparable[] array, int begin, int mid, int end) {
        for (int k = begin; k <= end; k++) {
            temp[k] = array[k];
        }
        int i = begin, j = mid + 1;
        for (int k = begin; k <= end; k++) {
            if (i > mid) {
                array[k] = temp[j++];
            } else if (j > end) {
                array[k] = temp[i++];
            } else if (less(temp[j], temp[i])) {
                array[k] = temp[j++];
            } else {
                array[k] = temp[i++];
            }
        }
    }

    private void mergeSort(Comparable[] array, int begin, int end) {
        if (end <= begin) {
            return;
        }
        int mid = begin + (end - begin) / 2;
        mergeSort(array, begin, mid);
        mergeSort(array, mid + 1, end);
        merge(array, begin, mid, end);
    }

    @Override
    public void sort(Comparable[] array) {
        super.sort(array);
        temp = new Comparable[array.length];
        mergeSort(array, 0, array.length -1);
    }
}
