package de.reinerh.courses.java;

import java.util.List;

/** Search ist eine Klasse, die mehrere statische Funktionen für die Suche
 *  nach Elementen in einer Liste enthält.
 */
public class Lists {

    /** binary führt eine binäre Suche nach einem Element in einer Liste durch.
     * 
     * @param list Die Liste, die durchsucht werden soll.
     * @param key Der Schlüssel, nach dem gesucht werden soll.
     * @return Die Position des ersten Vorkommens von key. 
     *         Oder -1, falls key nicht vorkommt.
     * 
     * Anmerkung: Diese Funktion kann nur für sortierte Listen ein sinnvolles Ergebnis liefern.
     */
    public static int binarySearch(List<Integer> list, int key) {
        if (list.isEmpty()) {
            return -1;
        }
        int midpos = list.size() / 2;

        if (key <= list.get(midpos)) {
            int result = binarySearch(list.subList(0, midpos), key);
            if (result != -1) {
                return result;
            }
            return list.get(midpos) == key ? midpos : -1;
        }
        int result = binarySearch(list.subList(midpos+1, list.size()), key);
        return result == -1 ? -1 : result + midpos + 1;
    }
}
