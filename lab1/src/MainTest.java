import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testFunction() {
        assertEquals(4, Main.getNumber(10));
        assertEquals(56, Main.getNumber(1000));
        assertEquals(9, Main.getNumber(50));
        assertEquals(13, Main.getNumber(100));
        assertEquals(1, Main.getNumber(2));
        assertEquals(0, Main.getNumber(0));
        assertEquals(0, Main.getNumber(-50));
    }
}
