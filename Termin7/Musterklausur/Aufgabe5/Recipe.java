package Termin7.Musterklausur.Aufgabe5;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private final String name;
    private final List<Ingredient> ingredients;

    // Konstruktor
    public Recipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    // Getter
    public String getName() {
        return name;
    }

    public List<Ingredient> ingredients() {
        return ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }
}
