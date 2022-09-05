package com.againstsky.alg.sort;

import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-08-30 10:59
 **/
public class SkySort {

    public static void sort(List<? extends Comparable<?>> datum) {

    }

    public static void sort(Comparable<?>[] array) {

    }

    @SuppressWarnings("unchecked")
    public static <T> boolean sorted(List<T> datum, Comparator<T> c) {
        if (datum.isEmpty()) {
            return true;
        }
        if (c == null) {
            if (datum.get(0) instanceof Comparable)
                return sorted((List<? extends Comparable<T>>) datum);
            else
                return false;
        }
        for (int i = 0; i < datum.size() - 1; i++) {
            if (c.compare(datum.get(i), datum.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }

    private static <T> boolean sorted(List<? extends Comparable<T>> datum) {
        for (int i = 0; i < datum.size() - 1; i++) {
            if (datum.get(i).compareTo((T) datum.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }

//    public static boolean sorted(Comparable<?>[] array) {
//        return false;
//    }

}
