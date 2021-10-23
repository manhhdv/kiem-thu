import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumCalculatorBoundaryTest {
    @Test
    public void testCase1() {
        SumCalculator tong = new SumCalculator( 50, 50, 50);
        int sum = tong.sumCalculator();
        assertEquals(9500, sum);
    }
    @Test
    public void testCase2() {
        SumCalculator tong = new SumCalculator( 50, 1, 1);
        int sum = tong.sumCalculator();
        assertEquals(190, sum);
    }

    @Test
    public void testCase3() {
        SumCalculator tong = new SumCalculator( 50, 99, Integer.MAX_VALUE);
        int sum = tong.sumCalculator();
        assertEquals(18810, sum);
    }

    @Test
    public void testCase4() {
        SumCalculator tong = new SumCalculator( 50, 2, 2);
        int sum = tong.sumCalculator();
        assertEquals(380, sum);
    }

    @Test
    public void testCase5() {
        SumCalculator tong = new SumCalculator( 50, 98, Integer.MAX_VALUE);
        int sum = tong.sumCalculator();
        assertEquals(18620, sum);
    }

    @Test
    public void testCase6() {
        SumCalculator tong = new SumCalculator( 50, 100, Integer.MAX_VALUE);
        int sum = tong.sumCalculator();
        assertEquals(0, sum);
    }

    @Test
    public void testCase7() {
        SumCalculator tong = new SumCalculator( 50, 0, 0);
        int sum = tong.sumCalculator();
        assertEquals(0, sum);
    }
    @Test
    public void testCase8() {
        SumCalculator tong = new SumCalculator( 1, 50, 1);
        int sum = tong.sumCalculator();
        assertEquals(9500, sum);
    }
    @Test
    public void testCase9() {
        SumCalculator tong = new SumCalculator( 99, 50, Integer.MAX_VALUE);
        int sum = tong.sumCalculator();
        assertEquals(9500, sum);
    }

    @Test
    public void testCase10() {
        SumCalculator tong = new SumCalculator( 2, 50, 2);
        int sum = tong.sumCalculator();
        assertEquals(9500, sum);
    }

    @Test
    public void testCase11() {
        SumCalculator tong = new SumCalculator( 98, 50, Integer.MAX_VALUE);
        int sum = tong.sumCalculator();
        assertEquals(9500, sum);
    }

    @Test
    public void testCase12() {
        SumCalculator tong = new SumCalculator( 100, 50, Integer.MAX_VALUE);
        int sum = tong.sumCalculator();
        assertEquals(0, sum);
    }

    @Test
    public void testCase13() {
        SumCalculator tong = new SumCalculator( 0, 50, 0);
        int sum = tong.sumCalculator();
        assertEquals(0, sum);
    }

    @Test
    public void testCase14() {
        SumCalculator tong = new SumCalculator( 1, 1, 50);
        int sum = tong.sumCalculator();
        assertEquals(190, sum);
    }
    @Test
    public void testCase15() {
        SumCalculator tong = new SumCalculator( 99, 99, 50);
        int sum = tong.sumCalculator();
        assertEquals(18810, sum);
    }
    @Test
    public void testCase16() {
        SumCalculator tong = new SumCalculator( 2, 2, 50);
        int sum = tong.sumCalculator();
        assertEquals(380, sum);
    }

    @Test
    public void testCase17() {
        SumCalculator tong = new SumCalculator( 98, 98, 50);
        int sum = tong.sumCalculator();
        assertEquals(18620, sum);
    }

    @Test
    public void testCase18() {
        SumCalculator tong = new SumCalculator( 100, 100, 50);
        int sum = tong.sumCalculator();
        assertEquals(0, sum);
    }
    @Test
    public void testCase19() {
        SumCalculator tong = new SumCalculator( 0, 0, 50);
        int sum = tong.sumCalculator();
        assertEquals(0, sum);
    }
}
