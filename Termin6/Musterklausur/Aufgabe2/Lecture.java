package Termin6.Musterklausur.Aufgabe2;

public class Lecture {
    private final String description;
    private final int creditPoints;

    public Lecture(String description, int creditPoints) {
        this.description = description;
        this.creditPoints = creditPoints;
    }

    public String description() {
        return description;
    }

    public int creditPoints() {
        return creditPoints;
    }

    public String toString() {
        return "Lecture [description=" + description + ", creditPoints=" + creditPoints + "]";
    }
}
