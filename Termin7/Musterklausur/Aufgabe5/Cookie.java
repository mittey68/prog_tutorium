package Termin7.Musterklausur.Aufgabe5;

import java.util.List;

public class Cookie {
    private final String name;
    private final Recipe dough;

    // Konstruktor
    public Cookie(String name, Recipe dough) {
        this.name = name;
        this.dough = dough;
    }

    // Getter
    public String getName() {
        return name;
    }

    public Recipe getDough() {
        return dough;
    }

    public List<Ingredient> getIngredients() {
        return dough.ingredients();
    }
}
