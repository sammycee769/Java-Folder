package Opes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GreaterNumberTest {

    @Test
    public void testNormalCase() {
        int[][] array = {{6,7},{9,1},{3,2}};
        assertEquals(13, Opes.GreaterNumber.sum(array));
    }

    @Test
    public void testDifferentRowLengths() {
        int[][] array = {{1,2,3},{4,5,6}};
        assertEquals(15, Opes.GreaterNumber.sum(array));
    }

    @Test
    public void testSingleColumn() {
        int[][] array = {{10},{5},{20}};
        assertEquals(20, Opes.GreaterNumber.sum(array));
    }

    @Test
    public void testAllNegativeNumbers() {
        int[][] array = {{-1,-2},{-3,-4},{-5,-6}};
        assertEquals(-3, Opes.GreaterNumber.sum(array));
    }

    @Test
    void testZerosOnly() {
        int[][] array = {{0,0},{0,0}};
        assertEquals(0, Opes.GreaterNumber.sum(array));
    }

    @Test
    public void testTiedValues() {
        int[][] array = {{1,2},{3,0},{-3,6}};
        assertEquals(3, Opes.GreaterNumber.sum(array));
    }
}