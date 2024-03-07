package Termin6.Kassensystem;

public class Item {
    private final Goods goods;
    private int amount;

    public Item(Goods goods, int amount) {
        this.goods = goods;
        this.amount = amount;
    }

    public double getSubTotalInEuro() {
        return goods.getPriceInEuro() * amount;
    }

    public Goods getGoods() {
        return this.goods;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    // Weitere Setter- und Getter-Methoden...
}
