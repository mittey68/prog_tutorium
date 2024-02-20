package Termin4;
import java.util.Scanner;
import java.util.ArrayList;

// Lösung der Aufgabe mithilfe einer ArrayList und variabler Länge der Liste
public class Ulm_Array_Aufgabe_2_2
{
    public static void main(String[] args) {
        // Deklaration und Initialisierung einer Hilfsvariable für die Do-While Schleife
        boolean again = true;
        // Deklaration und Initialisierung des Scanners
        Scanner scan = new Scanner(System.in);
        /* Erstellen der ArrayList
           ArrayList<Double>: Festlegen des Datentyps, den die ArrayList aufnimmt
           values: Name der ArrayList
           new ArrayList<>(): Erzeugen der ArrayList durch den new-Operator*/ 
        ArrayList<Double> values = new ArrayList<>();
        // Do-While Schleife, um so viele Eingaben, wie man möchte, zu ermöglichen.
        do{
            // Konsolenausgabe
            System.out.print(values.size() + 1 + ". Value: ");
            /* Eingabe eines Double-Werts über den Scanner und speichern 
             * des Inputs an der nächsten Stelle der ArrayList */
            values.add(scan.nextDouble());
            // Konsolenausgabe
            System.out.print("Do you wanna scan again? (y/n)");
            /* Wenn der erste Buchstabe der Eingabe y ist, wird die Schleife wiederholt,
               ansonsten bricht sie ab
               toLowerCase() macht aus allen Buchstaben des Strings Kleinbuchstaben
               charAt(0) extrahiert den ersten Buchstaben des eingegebenen Strings */
            if(scan.next().toLowerCase().charAt(0) != 'y'){
                again = false;
            }
        } while (again);
        
        // Deklaration einer Hilfsvariable und Initialisierung mit "0"
        double sum = 0;
        // Schrittweises druchgehen des Arrays und Aufaddierung der Summe
        for(int i=0; i<values.size(); i++) {
            // Aufaddieren der i-ten Stelle der ArrayList auf die Summe
            sum += values.get(i);
        }
        // Konsolenausgabe
        System.out.println("Sum: "+sum);
    }
}
