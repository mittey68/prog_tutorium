package Termin6.Kassensystem;

public class Product {
    private final int id;
    private final String description;
    private final String unit;
    private double priceInEuro;

    public Product(int id, String description, String unit, double priceInEuro) {
        this.id = id;
        this.description = description;
        this.unit = unit;
        this.priceInEuro = priceInEuro;
    }

    // Setters, Getters und Object-Methoden wie gewohnt
    public void setPriceInEuro(double priceInEuro) {
        this.priceInEuro = priceInEuro;
    }

    public double getPriceInEuro(){
        return this.priceInEuro;
    }


    // Weitere Getter-Methoden...

    public int getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public String getUnit() {
        return this.unit;
    }

    
}
