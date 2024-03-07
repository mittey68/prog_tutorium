package Termin4;

import java.util.Scanner;

// Lösung der Aufgabe mithilfe eines Arrays
public class Ulm_Array_Aufgabe_2_1 {
    public static void main(String[] args) {
        // Deklaration und Initialisierung des Scanners
        Scanner scan = new Scanner(System.in);
        /*
         * Ausgabe des Textes auf der Konsole.
         * Die Verwendung von print statt println sorgt dafür,
         * dass der Text und der Input des Users in einer Zeile stehen.
         */
        System.out.print("Amount of values: ");
        /*
         * Eingabe eines Integer-Werts über den Scanner und speichern
         * des Inputs in einer Variable
         */
        int amount = scan.nextInt();
        /*
         * Erstellen des Arrays
         * double[]: Festlegen des Datentyps, den das Array aufnimmt
         * values: Name des Arrays
         * new double[amount]: Erzeugen des Arrays durch den new-Operator und Zuweisung
         * der Länge durch die Variable "amount"
         */
        double[] values = new double[amount];
        // for-Schleife mit amount als Zähler, da amount der Länge des Arrays entspricht
        for (int i = 0; i < amount; i++) {
            // Konsolenausgabe
            System.out.print((i + 1) + ". Value: ");
            /*
             * Eingabe eines Double-Werts über den Scanner und speichern
             * des Inputs an der i-ten Stelle des Arrays
             */
            values[i] = scan.nextDouble();
        }
        // Deklaration einer Hilfsvariable und Initialisierung mit "0"
        double sum = 0;
        // Schrittweises druchgehen des Arrays
        for (int i = 0; i < values.length; i++) {
            // Aufaddieren der i-ten Stelle des Arrays auf die Summe
            sum += values[i];
        }
        // Konsolenausgabe
        System.out.println("Sum: " + sum);
    }
}
