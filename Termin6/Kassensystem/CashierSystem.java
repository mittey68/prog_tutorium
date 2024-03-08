package Termin6.Kassensystem;

import java.util.ArrayList;
import java.util.List;

public class CashierSystem {
    // Attribute
    private final String name;
    private final List<Goods> goods;
    private final List<Cashier> cashiers;
    private ShoppingCart shoppingCart;
    private Cashier cashier;

    // Konstruktor
    public CashierSystem(String name) {
        this.name = name;
        this.goods = new ArrayList<>();
        this.cashiers = new ArrayList<>();
    }

    // Methode zum Hinzufügen von Waren in die Liste "goods"
    public void addGoods(Goods goods) {
        this.goods.add(goods);
    }

    // Methode zum Hinzufügen von Kassierern in die Liste "cashiers"
    public void addCashier(Cashier cashier) {
        this.cashiers.add(cashier);
    }

    /*
     * Methode zum Einloggen eines Kassierers (Hinweis: Hier wird nur die ID des
     * Kassierers übergeben und nicht das Objekt selbst.)
     */
    public void login(int id) {
        /*
         * Durchsuchen der Liste "cashiers" nach dem Kassierer mit der übergebenen ID
         * mithilfe einer for-each-Schleife
         * "Cashier cashier" ist dabei eine Hilfsvariable in der in jedem
         * Schleifendurchlauf das aktuelle Objekt zwischengespeichert wird
         * "this.cashiers" ist die Liste, welche durchlaufen wird
         */
        for (Cashier cashier : this.cashiers) {
            /*
             * Wenn die ID des aktuellen Kassierers gleich der übergebenen ID ist, wird das
             * Objekt in der Instanzvariable "cashier" gespeichert und die Schleife durch
             * das break abgebrochen
             */
            if (cashier.getId() == id) {
                this.cashier = cashier;
                break;
            }
        }
    }

    /*
     * Methode um einen neuen Einkaufswagen zu erstellen, da dieser im Konstruktor
     * nicht erstellt wird
     */
    public void createShoppingCart() {
        this.shoppingCart = new ShoppingCart();
    }

    /*
     * Methode um ein Item, welches in der Liste "goods" ist, in den Einkaufswagen
     * zu legen. Dabei wird die ID des Items und die Menge übergeben
     */
    public void addItem(int id, int amount) {
        /*
         * Durchsuchen der Liste "goods" nach dem Item mit der übergebenen ID mithilfe
         * einer for-each-Schleife
         */
        for (Goods goods : this.goods) {
            /*
             * Wenn die ID des aktuellen Items gleich der übergebenen ID ist, wird ein neues
             * Item in den Einkaufswagen gelegt und die Schleife durch das break abgebrochen
             */
            if (goods.getId() == id) {
                this.shoppingCart.createItem(goods, amount);
                break;
            }
        }
    }

    /*
     * Methode um den Bon auszudrucken (Hinweis: Dies ist eine reine
     * Konsolen-Ausgabe)
     */
    public void printBon() {
        System.out.println("Kassensystem: " + this.name);
        System.out.println("Kassierer: " + this.cashier.getName());
        System.out.println("Waren:");
        /*
         * Durchlaufen der Liste "items", welche in der Instanzvariable "shoppingCart"
         * gespeichert ist. (Siehe Klasse ShoppingCart) Item item ist dabei wieder die
         * Hilfsvariable in der in jedem Schleifendurchlauf das aktuelle Objekt
         * zwischengespeichert wird "this.shoppingCart.getItems()" ist die Liste, welche
         * durchlaufen wird
         */
        for (Item item : this.shoppingCart.getItems()) {
            System.out.println(item.getGoods().getDescription() + " " + item.getAmount() + "x");
        }
        System.out.println("Gesamtpreis: " + this.shoppingCart.getTotalInEuro());
    }
}
