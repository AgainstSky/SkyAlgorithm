package com.againstsky.alg;

import com.againstsky.alg.data.SkyInteger;
import com.againstsky.alg.draw.Draw;
import com.againstsky.alg.sort.*;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
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

    static int max = 1 * 10000;
    public static void main(String[] args) {
        Integer[] array = new Integer[max];
        for (int i = 0; i < array.length; i++) {
            array[i]= StdRandom.uniform(0,Integer.MAX_VALUE- 10000);
        }
        long st = System.currentTimeMillis();
        SkySort.sort(array, SortKey.INSERTION);
        System.out.println("time:"+(System.currentTimeMillis()-st));
        System.out.println(SkySort.isSorted(array));
    }
}
