package Termin7.Tiefgarage;

public class Vehicle {
    private final String make;
    private final String model;
    private final double lengthInM;
    private final double heigtInM;


public Vehicle(String make, String model, double lengthInM, double heigtInM) {
    this.make = make;
    this.model = model;
    this.lengthInM = lengthInM;
    this.heigtInM = heigtInM;
}

// Getters
public String getMake() {
    return make;
}

public String getModel() {
    return model;
}

public double getLengthInM() {
    return lengthInM;
}

public double getHeigtInM() {
    return heigtInM;
}

}
