package Termin6.Kassensystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    // Attribute
    private final List<Item> items;

    // Konstruktor
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    /*
     * Methode zum Hinzufügen eines Artikels in die Liste "items". Hier wird das
     * Objekt "Goods" und die Anzahl des Artikels übergeben
     */
    public void createItem(Goods goods, int amount) {
        this.items.add(new Item(goods, amount));
    }

    /*
     * Methode um den Gesamtpreis des Einkaufswagens zu berechnen
     * (Hinweis: Hier wird die Methode "getSubTotalInEuro" der Klasse "Item"
     * verwendet)
     */
    public double getTotalInEuro() {
        double total = 0;
        /*
         * Durchlaufen der Liste "items" mithilfe einer for-each-Schleife
         * "Item item" ist dabei eine Hilfsvariable in der in jedem Schleifendurchlauf
         * das aktuelle Objekt zwischengespeichert wird
         * "this.items" ist die Liste, welche durchlaufen wird
         */
        for (Item item : this.items) {
            total += item.getSubTotalInEuro();
        }
        return total;
    }

    // Getter-Methode
    public List<Item> getItems() {
        return this.items;
    }
}
