package Termin6.Kassensystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> items = new ArrayList<>();

    public ShoppingCart() {}

    public void createItem(Goods goods, int amount) {
        this.items.add(new Item(goods, amount));
    }

    public double getTotalInEuro() {
        double total = 0;
        for (Item item : this.items) {
            total += item.getSubTotalInEuro();
        }
        return total;
    }

    public List<Item> getItems() {
        return this.items;
    }
}
