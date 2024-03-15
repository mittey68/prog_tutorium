package Termin7.Tiefgarage;

public class ParkingGarage {
    private final ParkingSpot[] parkingSpots;

    // Konstruktor
    public ParkingGarage(int numberOfParkingSpots) {
        this.parkingSpots = new ParkingSpot[numberOfParkingSpots];
    }

    public String parkIn(Vehicle vehicle, int number) {
        if (parkingSpots[number].getVehicle() != null) {
            return "Dieser Parkplatz ist bereits besetzt";
        }

        if (parkingSpots[number].isForBusesOnly() && vehicle instanceof Car) {
            return "Dieser Parkplatz ist nur fuer Busse";
        }

        if (parkingSpots[number].getLengthInM() < vehicle.getLengthInM()
                || parkingSpots[number].getHeigtInM() < vehicle.getHeigtInM()) {
            return "Dieser Parkplatz ist zu klein";
        }

        parkingSpots[number].setVehicle(vehicle);
        return "Fahrzeug erfolgreich eingeparkt";
    }

    public String parkOut(Vehicle vehicle) {
        for (int i = 0; i < parkingSpots.length; i++) {
            Vehicle tmp = parkingSpots[i].getVehicle();
            if (tmp != null && tmp == vehicle) {
                parkingSpots[i].setVehicle(null);
                return "Fahrzeug erfolgreich ausgeparkt";
            }
        }
        return "Fahrzeug konnte nicht gefunden werden";
    }
}
