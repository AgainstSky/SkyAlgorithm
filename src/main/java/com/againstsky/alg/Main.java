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

    public static void main(String[] args) {
        Integer[] array = new Integer[1024];
        for (int i = 0; i < array.length; i++) {
            array[i]= StdRandom.uniform(0,99999);
        }
        SkySort.sort(array, SortKey.SELECTION);
        System.out.println(SkySort.isSorted(array));
    }
}
