package Termin7.Musterklausur.Aufgabe5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IngredientsReader {

    public static List<Ingredient> readIngredients(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);

        List<Ingredient> ingredients = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Ingredient i = new Ingredient(line);
            ingredients.add(i);
        }

        sc.close();
        return ingredients;
    }

}
