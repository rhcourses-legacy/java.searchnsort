package de.reinerh.courses.java;

import java.util.ArrayList;
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
        // Rekursionsanker: Listen der Länge <= 1 sind bereits sortiert.
        if (list.size() <= 1) {
            return;
        }

        // Vorbereitung: Erzeugen von zwei Teillisten,
        // die kleinere bzw. größere Elemente als das erste enthalten.
        int pivot = list.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (var el : list.subList(1, list.size())) {
            if (el < pivot) {
                left.add(el);
            } else {
                right.add(el);
            }
        }

        // Rekursiv sortieren.
        quick(left);
        quick(right);

        // Die sortierten Teillisten wieder zusammensetzen.
        int i = 0;
        for (var el : left) {
            list.set(i++, el);
        } 
        list.set(i++, pivot);
        for (var el : right) {
            list.set(i++, el);
        } 
    }

    /** Implementierung des Sortierverfahrens MergeSort. */
    public static void merge(List<Integer> list) {

    }
}
