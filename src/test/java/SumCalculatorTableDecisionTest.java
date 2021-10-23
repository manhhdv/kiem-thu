import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumCalculatorTableDecisionTest {
    
    /// điều kiện ktra ( (A && B) || C)...
    @Test
    public void testCase1() {
        // A true, B true and C not check
        SumCalculator tong = new SumCalculator( 5, 10, 15);
        int sum = tong.sumCalculator();
        assertEquals(950, sum);
    }
    @Test
    public void testCase2() {
        // A true, B false and C true
        SumCalculator tong = new SumCalculator( 5, 9, 15);
        int sum = tong.sumCalculator();
        assertEquals(950, sum);
    }

    @Test
    public void testCase3() {
        // A true, B false and C false
        SumCalculator tong = new SumCalculator( 5, 9, 14);
        int sum = tong.sumCalculator();
        assertEquals(1710, sum);
    }

    @Test
    public void testCase4() {
        // A false, B not check and C true
        SumCalculator tong = new SumCalculator( 4, 10, 15);
        int sum = tong.sumCalculator();
        assertEquals(760, sum);
    }

    @Test
    public void testCase5() {
        // A false, B not check and C false
        SumCalculator tong = new SumCalculator( 4, 5, 14);
        int sum = tong.sumCalculator();
        assertEquals(950, sum);
    }

    @Test
    public void testCase6() {
        // A false, B not check and C false
        SumCalculator tong = new SumCalculator( 0, 10, 15);
        int sum = tong.sumCalculator();
        assertEquals(0, sum);
    }

    @Test
    public void testCase7() {
        // A false, B not check and C false
        SumCalculator tong = new SumCalculator( 10, 100, 15);
        int sum = tong.sumCalculator();
        assertEquals(0, sum);
    }
}
