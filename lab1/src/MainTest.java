import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testGetNumberSmallInput() {
        assertEquals(4, Main.getNumber(10));
    }

    @Test
    public void testGetNumberMediumInput() {
        assertEquals(9, Main.getNumber(50));
    }

    @Test
    public void testGetNumberLargeInput() {
        assertEquals(13, Main.getNumber(100));
    }

    @Test
    public void testGetNumberEdgeCase() {
        assertEquals(1, Main.getNumber(2));
    }

    @Test
    public void testGetNumberNonPrimeEdge() {
        assertEquals(56, Main.getNumber(999));
    }

    @Test
    public void testGetNumberZeroInput() {
        assertEquals(0, Main.getNumber(0));
    }

    @Test
    public void testGetNumberNegativeInput() {
        assertEquals(0, Main.getNumber(-50));
    }
}
