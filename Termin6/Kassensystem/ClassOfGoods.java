package Termin6.Kassensystem;

public enum ClassOfGoods {
    BAKERY_PRODUCTS("Backwaren"),

    DAIRY_PRODUCTS("Milchprodukte"),

    FRUITS("Obst"),

    VEGETABLES("Gemüse");

    // description-Feld und entsprechender Getter
    private final String description;

    private ClassOfGoods(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
