package Termin7.Tiefgarage;

public class ParkingSpot {
    private Vehicle vehicle; // Fehler in der Angabe (vehicle ist nicht final)
    private final double lengthInM;
    private final double heigtInM;
    private final boolean isForBusesOnly;

    // Konstruktor
    public ParkingSpot(double lengthInM, double heigtInM, boolean isForBusesOnly) {
        this.lengthInM = lengthInM;
        this.heigtInM = heigtInM;
        this.isForBusesOnly = isForBusesOnly;
    }

    // Getters
    public Vehicle getVehicle() {
        return vehicle;
    }

    public double getLengthInM() {
        return lengthInM;
    }

    public double getHeigtInM() {
        return heigtInM;
    }

    public boolean isForBusesOnly() {
        return isForBusesOnly;
    }

    // Setters
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
