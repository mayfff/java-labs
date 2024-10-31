package people;

public class RegularPerson extends Person {
    public RegularPerson(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "RegularPerson{" + getName() + "}";
    }
}
