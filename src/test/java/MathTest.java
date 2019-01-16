import static org.junit.Assert.*;

public class MathTest {

    private Math math = null;

    @org.junit.Before
    public void setUp() throws Exception {
        math = new Math();
    }

    @org.junit.Test
    public void add() {
        int actual = math.add(16, 7);
        int expected = 23;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void divide() {
        int actual = math.divide(24, 8);
        int expected = 3;
        assertEquals(expected, actual);
    }
}