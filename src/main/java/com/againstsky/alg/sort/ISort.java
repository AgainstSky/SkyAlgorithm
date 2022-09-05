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

    /**
     * 普通对象排序
     * @param array
     * @param cmp 定义元素对象排序，并且优先级更高。即如果cmp不为空，array元素哪怕实现了Comparable接口，也会以cmp为准
     */
    void sort(Object[] array, Comparator cmp);

    boolean isSorted(Comparable[] array);

    void print(Object[] array);
}
