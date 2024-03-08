package Termin6.Kassensystem;

// Enum-Klasse für die Kategorien der Waren
public enum ClassOfGoods {
    // Aufzählungskonstanten
    BAKERY_PRODUCTS("Backwaren"),

    DAIRY_PRODUCTS("Milchprodukte"),

    FRUITS("Obst"),

    VEGETABLES("Gemüse");

    // Attribut
    private final String description;

    /*
     * Konstruktor (Hinweis: Private, da nur innerhalb der Klasse aufgerufen. Das
     * ist bei Enums aber auch nicht anders möglich --> Enum-Konstanten sind immer
     * private!)
     */
    private ClassOfGoods(String description) {
        this.description = description;
    }

    // Getter-Methode
    public String getDescription() {
        return this.description;
    }
}
