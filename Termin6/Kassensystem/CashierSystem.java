package Termin6.Kassensystem;

import java.util.ArrayList;
import java.util.List;

public class CashierSystem {
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

    // Weitere Felder und Methoden...

    public void addGoods(Goods goods) {
        this.goods.add(goods);
    }

    public void addCashier(Cashier cashier) {
        this.cashiers.add(cashier);
    }

    public void login(int id) {
        for (Cashier cashier : this.cashiers) {
            if (cashier.getId() == id) {
                this.cashier = cashier;
                break;
            }
        }
    }

    public void createShoppingCart() {
        this.shoppingCart = new ShoppingCart();
    }

    public void addItem(int id, int amount) {
        for (Goods goods : this.goods) {
            if (goods.getId() == id) {
                this.shoppingCart.createItem(goods, amount);
                break;
            }
        }
    }

    public void printBon() {
        System.out.println("Kassensystem: " + this.name);
        System.out.println("Kassierer: " + this.cashier.getName());
        System.out.println("Waren:");
        for (Item item : this.shoppingCart.getItems()) {
            System.out.println(item.getGoods().getDescription() + " " + item.getAmount() + "x");
        }
        System.out.println("Gesamtpreis: " + this.shoppingCart.getTotalInEuro());
    }
}
// Weitere Methoden...
