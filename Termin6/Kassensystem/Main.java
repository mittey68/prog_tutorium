package Termin6.Kassensystem;

public class Main {
    public static void main(String[] args) {
        // Erzeugen eines neuen Kassen-Systems
        CashierSystem cashierSystem = new CashierSystem("Kassen-System 1");

        // Erzeugen von Waren
        Goods goods1 = new Goods(1, "Apfel", "Stück", 0.5, ClassOfGoods.FRUITS);
        Goods goods2 = new Goods(2, "Milch", "Liter", 1.0, ClassOfGoods.DAIRY_PRODUCTS);
        Goods goods3 = new Goods(3, "Brot", "Stück", 2.0, ClassOfGoods.BAKERY_PRODUCTS);
        Goods goods4 = new Goods(4, "Karotte", "Stück", 0.2, ClassOfGoods.VEGETABLES);

        // Hinzufügen von Waren in das Kassen-System
        cashierSystem.addGoods(goods1);
        cashierSystem.addGoods(goods2);
        cashierSystem.addGoods(goods3);
        cashierSystem.addGoods(goods4);

        // Erzeugen von Kassierern
        Cashier cashier1 = new Cashier("Max Mustermann", 1);
        Cashier cashier2 = new Cashier("Erika Mustermann", 2);

        // Hinzufügen von Kassierern in das Kassen-System
        cashierSystem.addCashier(cashier1);
        cashierSystem.addCashier(cashier2);

        // Einloggen eines Kassierers
        cashierSystem.login(1);

        // Erzeugen eines neuen Einkaufswagens
        cashierSystem.createShoppingCart();

        // Hinzufügen von Artikeln in den Einkaufswagen
        cashierSystem.addItem(1, 5);
        cashierSystem.addItem(2, 2);
        cashierSystem.addItem(3, 1);

        // Ausgabe des Gesamtpreises
        cashierSystem.printBon();

        // Abstandzeilen auf der Konsole
        System.out.println();
        System.out.println();

        // Einloggen eines anderen Kassierers#
        cashierSystem.login(2);

        // Erzeugen eines neuen Einkaufswagens
        cashierSystem.createShoppingCart();

        // Hinzufügen von Artikeln in den Einkaufswagen
        cashierSystem.addItem(1, 10);
        cashierSystem.addItem(4, 5);

        // Ausgabe des Gesamtpreises
        cashierSystem.printBon();
    }
}
