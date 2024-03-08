package Termin6.Kassensystem;

public class Cashier {
    // Attribute
    private final int id;
    private final String name;

    // Konstruktor
    public Cashier(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter-Methoden
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
