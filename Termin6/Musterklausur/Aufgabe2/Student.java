package Termin6.Musterklausur.Aufgabe2;

public class Student {
    private final String matriculationNumber;
    private final String name;
    
    public Student(String matriculationNumber, String name) {
        this.matriculationNumber = matriculationNumber;
        this.name = name;
    }

    public String matriculationNumber() {
        return matriculationNumber;
    }

    public String name() {
        return name;
    }

    public String toString() {
        return "Student [matriculationNumber=" + matriculationNumber + ", name=" + name + "]";
    }
}
