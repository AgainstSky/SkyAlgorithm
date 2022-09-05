package com.againstsky.alg;

import com.againstsky.alg.sort.ISort;
import com.againstsky.alg.sort.SelectionSort;
import com.againstsky.alg.sort.SkySort;
import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-08-30 10:31
 **/
public class Main {

    public static void main(String[] args) {
        ISort sort= new SelectionSort();
        Integer[] array = new Integer[1024];
        for (int i = 0; i < array.length; i++) {
            array[i]= StdRandom.uniform(0,99999);
        }
        System.out.println(sort.isSorted(array));
        sort.sort(array);
        System.out.println(sort.isSorted(array));
        sort.print(array);
    }
}
