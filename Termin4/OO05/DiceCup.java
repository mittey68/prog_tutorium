package Termin4.OO05;

import java.util.ArrayList;
public class DiceCup {
    // Methode rollTheDices, welche eine ArrayList von Dices von außen übergeben bekommt
    public void rollTheDices(ArrayList<Dice> dices) {
        // for-Schleife durch die ArrayList
        for (int i = 0; i < dices.size(); i++) {
            /* Erstellen einer Hilfsvariable des Typs "Dice" und Bennenung dieser mit "dice" 
               Speichern der i-ten Stelle der ArrayList, welche übergeben wurde, in die Hilfsvariable */
            Dice dice = dices.get(i);
            // Aufrufen der rollTheDice-Methode des eben gespeicherten Würfels (siehe Klasse Dice)
            dice.rollTheDice();
            // Konsolenausgabe mithilfe der programmierten Getter aus der Dice-Klasse
            System.out.println(dice.getId() + " - " + dice.getValue());
        }
    }

    // Identisch zu oben, allerdings wird diesmal ein Array und keine ArrayList übergeben
    public void rollTheDices(Dice[] dices) {
        for (int i = 0; i < dices.length; i++) {
            Dice dice = dices[i];
            dice.rollTheDice();
            System.out.println(dice.getId() + " - " + dice.getValue());
        }
    }
}
