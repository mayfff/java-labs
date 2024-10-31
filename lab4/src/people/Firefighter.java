package people;

public class Firefighter extends Person {
    public Firefighter(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Firefighter{" + getName() + "}";
    }
}
