package Termin4.OO05;

import java.util.Random;
public class Dice {
    // Attribute des Würfels
    private int id;
    private int value;

    // Konstruktor des Würfels, welcher als Übergabeparameter einen int-Wert benötigt
    public Dice(int id) {
        // setzen des Attributs (this.id) auf den Wert des Übergabeparameters (id)
        this.id = id;
        // ausführen der Methode rollTheDice() von unten, um dem Atrribut "value" einen Wert zuzuweisen.
        rollTheDice();
    }

    /* Getter Methode des Attributs "id" 
       Notwendig, da "id" privat ist und ohne diesen nicht von 
       außerhalb der Klasse ausgelesen werden könnte */
    public int getId() {
        return id;
    }

    // Getter Methode des Attributs "value" 
    public int getValue() {
        return value;
    }

    // Methode rollTheDice
    public void rollTheDice() {
        // Erzeugen eines Objekts der Klasse Random
        Random random = new Random();
        // Nutzung des Random-Objekts, um eine Zufallszahl zwischen 1 und 6 zu erzeugen und Zuweisung dieser zum Attribut value
        value = random.nextInt(6) + 1;
    }
}
