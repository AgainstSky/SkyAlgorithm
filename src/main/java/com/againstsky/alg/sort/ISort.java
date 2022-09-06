package com.againstsky.alg.sort;

import java.util.Comparator;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-09-05 11:24
 **/
public interface ISort {

    /**
     * 实现了Comparable接口的元素数组排序
     * @param array
     */
    void sort(Comparable[] array);


    boolean isSorted(Comparable[] array);

    void print(Object[] array);
}
