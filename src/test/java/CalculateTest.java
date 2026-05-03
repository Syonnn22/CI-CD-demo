import org.example.Calculate;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class CalculateTest {
    @Test
    public void testTinhTong() {
        Calculate calculate = new Calculate();
        assertEquals(11, calculate.tinhTong(5, 6));
    }

    @Test
    public void testChiaw() {
        Calculate calculate = new Calculate();
        assertEquals(2.0, Calculate.chiaw(6.0, 3.0));
    }
}
