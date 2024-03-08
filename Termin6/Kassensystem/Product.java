package Termin6.Kassensystem;

public class Product {
    // Attribute
    private final int id;
    private final String description;
    private String unit;
    private double priceInEuro;

    // Konstruktor
    public Product(int id, String description, String unit, double priceInEuro) {
        this.id = id;
        this.description = description;
        this.unit = unit;
        this.priceInEuro = priceInEuro;
    }

    // Getter-Methoden
    public int getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public String getUnit() {
        return this.unit;
    }

    public double getPriceInEuro() {
        return this.priceInEuro;
    }

    /*
     * Setter-Methode für den Preis (Hinweis: Hier nur für das Attribut
     * "priceInEuro", da die anderen Attribute final sind und somit nach
     * Initialisierung im Konstruktor nicht mehr verändert werden können)
     */
    public void setPriceInEuro(double priceInEuro) {
        this.priceInEuro = priceInEuro;
    }
}
