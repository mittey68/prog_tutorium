package Termin4;

import java.util.Scanner;

public class Ulm_Array_Aufgabe_4 {
    public static void main(String[] args) {
        // Deklaration und Initialisierung des Scanners
        Scanner scan = new Scanner(System.in);
        /*
         * Ausgabe des Textes auf der Konsole.
         * Die Verwendung von print statt println sorgt dafür,
         * dass der Text und der Input des Users in einer Zeile stehen.
         */
        System.out.print("Amount data: ");
        /*
         * Eingabe eines Integer-Werts über den Scanner und speichern
         * des Inputs in einer Variable
         */
        int amount = scan.nextInt();
        /*
         * Erstellen des Arrays
         * int[]: Festlegen des Datentyps, den das Array aufnimmt
         * data: Name des Arrays
         * new int[amount]: Erzeugen des Arrays durch den new-Operator und Zuweisung der
         * Länge durch die Variable "amount"
         */
        int[] data = new int[amount];
        // for-Schleife mit amount als Zähler, da amount der Länge des Arrays entspricht

        for (int i = 0; i < amount; i++) {
            // Konsolenausgabe
            System.out.print((i + 1) + ". Number: ");
            /*
             * Eingabe eines Int-Werts über den Scanner und speichern
             * des Inputs an der i-ten Stelle des Arrays
             */
            data[i] = scan.nextInt();
        }

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

            // for-Schleife mit der Länge des Arrays als Zähler. Identisch zu obriger
            // for-Schleife mit "amount"
            for (int i = 0; i < data.length; i++) {
                /*
                 * Wenn das gesuchte Element mit dem aktuell im Schleifendurchlauf angesehenen
                 * Element (data[i]) übereinstimmt, setze found auf true, um die Schleife
                 * abzubrechen und gib etwas auf der Konsole aus.
                 */
                if (search == data[i]) {
                    found = true;
                    System.out.println("Found");
                }
            }
        } while (!found); // !found entspricht found == false
    }
}
