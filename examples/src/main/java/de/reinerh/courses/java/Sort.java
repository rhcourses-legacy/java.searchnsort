package de.reinerh.courses.java;

import java.util.Collections;
import java.util.List;

/** Sort ist eine Klasse, die mehrere statische Funktionen
 *  für das Sortieren von Listen enthält.
 */
public class Sort {

    /** Implementierung des Sortierverfahrens InsertionSort. */
    public static void insertion(List<Integer> list) {
        for (int i=1; i < list.size(); i++) {
            for (int j = i; j>0 && list.get(j) < list.get(j-1); j--) {
                Collections.swap(list, j, j-1);
            }
        }

    }

    /** Implementierung des Sortierverfahrens SelectionSort. */
    public static void selection(List<Integer> list) {
        for (int i=0; i<list.size()-1; i++) {
            int smallestPos = -1;
            for (int j=i; j<list.size(); j++) {
                if (smallestPos < 0 || list.get(j) < list.get(smallestPos)) {
                    smallestPos = j;
                }
            }
            Collections.swap(list, i, smallestPos);
        }
    }

    /** Implementierung des Sortierverfahrens BubbleSort. */
    public static void bubble(List<Integer> list) {
        for (int i=0; i<list.size(); i++) {
            for (int j=0; j<i; j++) {
                if (list.get(j) > list.get(j+1)) {
                    Collections.swap(list, j, j+1);
                }
            }
        }
    }

    /** Implementierung des Sortierverfahrens QuickSort. */
    public static void quick(List<Integer> list) {

    }

    /** Implementierung des Sortierverfahrens MergeSort. */
    public static void merge(List<Integer> list) {

    }
}
