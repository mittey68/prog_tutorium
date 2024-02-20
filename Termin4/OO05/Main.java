package Termin4.OO05;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        /* Erstellen der ArrayList
           ArrayList<Dice>: Festlegen des Datentyps, den die ArrayList aufnimmt (hier die Klasse Dice, 
           welche wir programmiert haben)
           dices: Name der ArrayList
           new ArrayList<>(): Erzeugen der ArrayList durch den new-Operator*/
        ArrayList<Dice> dices = new ArrayList<>();

        // for-Schleife, welche 5 Mal durchlaufen wird
        for (int i = 1; i <= 5; i++) {
            /* Erstellen einer Hilfsvariable des Typs "Dice" und Bennenung dieser mit "dice" 
               Aufruf des in Dice programmierten Konstruktors und Übergabe der Interger-Zählvariable als id (siehe Dice-Klasse)*/
            Dice dice = new Dice(i);
            /* Speichern des eben erstellten Würfels an der nächsten Stelle der oben erstellten ArrayList 
               Die Hilfsvariable "dice" in der Zeile darüber wird in jeder Schleifenausführung überschrieben,
               aber durch die Speicherung in der ArrayList bleibt das Objekt an sich erhalten */
            dices.add(dice);
        }

        /* Erstellen eines DiceCups mithilfe des Konstruktors der DiceCup-Klasse 
           Dies funktioniert auch ohne, dass dieser extra programmiert wurde, da jede Klasse automatische einen 
           Konstruktor ohne Übergabeparameter hat, welcher alle vorhandenen Attribute der Klasse leer deklariert. */
        DiceCup diceCup = new DiceCup();

        // Konsolenausgabe
        System.out.println("ID - Wuerfelwert");
        // for-Schleife, welche 5 Mal durchlaufen wird 
        for (int i = 1; i <= 5; i++) {
            // Konsolenausgabe
            System.out.println("Wurf " + i);
            // Aufruf der Methode rollTheDices auf dem oben erstellten Objekt der Klasse DiceCup, welche wir dort programmiert haben
            diceCup.rollTheDices(dices);
        }
    }
}
