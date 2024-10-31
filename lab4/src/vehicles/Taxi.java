package vehicles;

import people.Person;

public class Taxi extends Vehicle<Person>{
    public Taxi(int seatsAmount) {
        super(seatsAmount);
    }
}
