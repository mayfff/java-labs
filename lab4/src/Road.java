import people.*;
import vehicles.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Road {
    private final List<Vehicle<? extends Person>> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle<? extends Person>... vehicles) {
        this.vehicles.addAll(Arrays.asList(vehicles));
    }

    public void removeVehicle(Vehicle<? extends Person> vehicle) {
        this.vehicles.remove(vehicle);
    }

    public int countPeopleOnTheRoad() {
        int total = 0;
        for (Vehicle<? extends Person> vehicle : vehicles) {
            total += vehicle.getPassengersAmount();
        }
        return total;
    }
}
