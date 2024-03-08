package Termin6.Kassensystem;

// Klasse für Waren (Hinweis: Erbt von der Klasse Product)
public class Goods extends Product {
    // Zusätzliches Attribut (Hinweis: Durch das "extends" werden die Attribute von
    // Product übernommen)
    private final ClassOfGoods classOfGoods;

    /*
     * Konstruktor (Hinweis: Als Übergabeparameter werden neben der Warenkategorie
     * auch Übergabeparameter für die Attribute von Product übergeben)
     */
    public Goods(int id, String description, String unit, double priceInEuro, ClassOfGoods classOfGoods) {
        // Aufruf des Konstruktors der Oberklasse Product durch "super"
        super(id, description, unit, priceInEuro);
        this.classOfGoods = classOfGoods;
    }

    /*
     * Getter-Methode für die Warenkategorie (Hinweis: Die Getter-Methode für die
     * Attribute von Product werden durch das "extends" übernommen und können
     * dadurch auch verwendet für Objekte der Klasse Goods verwendet werden)
     */
    public ClassOfGoods getClassOfGoods() {
        return this.classOfGoods;
    }
}