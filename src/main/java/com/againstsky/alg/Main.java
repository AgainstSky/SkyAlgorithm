package com.againstsky.alg;

import com.againstsky.alg.data.SkyInteger;
import com.againstsky.alg.draw.Draw;
import com.againstsky.alg.sort.*;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-08-30 10:31
 **/
public class Main {

    static int max = 10000 * 10000;
    public static void main(String[] args) {
        Integer[] array = new Integer[max];
        for (int i = 0; i < array.length; i++) {
//            array[i]= StdRandom.uniform(0,Integer.MAX_VALUE- 10000);
            array[i] =1;
        }

        Stopwatch stopwatch = new Stopwatch();
        int[] sort = SkySort.sort(array, SortKey.QUICK);
        System.out.println("time:"+(stopwatch.elapsedTime()));
        System.out.println("exchCount:"+sort[0]+",cmpCount:"+sort[1]);
        System.out.println(SkySort.isSorted(array));
    }
}
