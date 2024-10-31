package vehicles;

import people.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle<T extends Person> {
    private final int seatsAmount;
    private final List<T> passengers;

    public Vehicle(int seatsAmount) {
        this.seatsAmount = seatsAmount;
        passengers = new ArrayList<>();
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public int getPassengersAmount() {
        return passengers.size();
    }

    public void addPassenger(T... passengersToAdd) {
        for (T passenger : passengersToAdd) {
            if (passengers.size() < seatsAmount) {
                passengers.add(passenger);
            } else {
                throw new IllegalArgumentException("Passengers can't exceed the number of seats.");
            }
        }
    }

    public void deletePassenger(T passenger) {
        if (!passengers.contains(passenger)) {
            throw new IllegalArgumentException("Passenger does not exist");
        }
        passengers.remove(passenger);
    }

    public List<T> getPassengers() {
        return passengers;
    }
}
