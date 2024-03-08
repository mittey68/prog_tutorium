package Termin6.Kassensystem;

public class Item {
    // Attribute
    private final Goods goods;
    private int amount;

    // Konstruktor
    public Item(Goods goods, int amount) {
        this.goods = goods;
        this.amount = amount;
    }

    // Methode zur Berechnung des Gesamtpreises
    public double getSubTotalInEuro() {
        return goods.getPriceInEuro() * amount;
    }

    // Getter-Methoden
    public Goods getGoods() {
        return this.goods;
    }

    public int getAmount() {
        return this.amount;
    }

    /*
     * Setter-Methoden (Hinweis: Hier nur für das Attribut "amount", da das Attribut
     * "goods" final ist und somit nach Initialisierung im Konstruktor nicht mehr
     * verändert werden kann)
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
