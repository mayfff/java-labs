import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void testEquals() {
        EqualsVerifier.forClass(Person.class).verify();
    }
}
