package vehicles;

import people.Person;

public class Bus extends Vehicle<Person> {
    public Bus(int seatsAmount) {
        super(seatsAmount);
    }
}
