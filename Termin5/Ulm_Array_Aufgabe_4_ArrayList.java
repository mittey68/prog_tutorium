package Termin5;

import java.util.Scanner;
import java.util.ArrayList;

// Umsetzung der Aufgabe 4 zu Arrays der Universität Ulm mithilfe einer ArrayList
public class Ulm_Array_Aufgabe_4_ArrayList {
    public static void main(String[] args) {
        // Deklaration und Initialisierung des Scanners
        Scanner scan = new Scanner(System.in);
        /*
         * Erstellen der ArrayList
         * <Integer>: Festlegen des Datentyps, den die ArrayList aufnimmt
         * data: Name der ArrayList
         * new ArrayList<>(): Erzeugen der ArrayList durch den new-Operator
         */
        ArrayList<Integer> data = new ArrayList<>();
        // do while Schleife, um so viele Konsoleneingaben zu ermöglichen, wie der User
        // wünscht
        boolean again = true;
        do {
            System.out.print("Number: ");
            // ArrayList spezifische add-Methode zum Hinzufügen von Elementen
            data.add(scan.nextInt());

            System.out.println("Möchtest du nochmal?");
            String antwort = scan.next();

            // Wenn der User etwas anderes als "ja" antwortet, bricht die Schleife ab
            if (antwort.equals("ja") == false) {
                again = false;
            }
        } while (again);

        // Deklaration und Initialisierung einer Hilfsvariable für die Do-While Schleife
        boolean found = false;
        // Do-While Schleife solange found == false
        do {
            // Kosolenausgabe
            System.out.print("Search for: ");
            /*
             * Eingabe eines Double-Werts über den Scanner (die Zahl nach derer gesucht
             * werden soll) und speichern
             * in eine Hilfsvariable
             */
            int search = scan.nextInt();

            // for-Schleife mit der Länge der ArrayList als Zähler. Achtung: ArrayLists
            // nutzen die Methode size() und nicht length
            for (int i = 0; i < data.size(); i++) {
                /*
                 * Wenn das gesuchte Element mit dem aktuell im Schleifendurchlauf angesehenen
                 * Element (data.get(i)) übereinstimmt, setze found auf true, um die Schleife
                 * abzubrechen und gib etwas auf der Konsole aus.
                 * 
                 * get(i) ist hierbei die ArrayList spezifische Methode für das Wählen einzelner
                 * Elemente am Index i
                 */
                if (search == data.get(i)) {
                    found = true;
                    System.out.println("Found");
                }
            }
        } while (!found); // !found entspricht found == false

        scan.close();
    }
}
