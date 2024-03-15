package Termin7.Musterklausur.Aufgabe5;

import java.util.List;

public class StuffedCookie extends Cookie {

    private final Recipe jam;

    public StuffedCookie(String name, Recipe dough, Recipe jam) {
        super(name, dough);
        this.jam = jam;
    }

    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = super.getIngredients();
        for (int i = 0; i < jam.ingredients().size(); i++) {
            Ingredient ingredient = jam.ingredients().get(i);
            if (ingredients.contains(ingredient)) {
                continue;
            }
            ingredients.add(ingredient);
        }
        return ingredients;
    }

}