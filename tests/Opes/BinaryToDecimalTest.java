package Opes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryToDecimalTest{
    @Test
    public void testThatMethoReturnsValidInput(){
    assertEquals(Opes.BinaryToDecimal.toDecimal(1010),10);
    }

    @Test
    public void testThatMethoReturnsValidInputWithNegativeNumers(){
    assertEquals(Opes.BinaryToDecimal.toDecimal(-1010),10);
    }

    @Test
    public void testThatMethoReturnsZeroWithZeros(){
    assertEquals(Opes.BinaryToDecimal.toDecimal(0),0);
    }

    @Test
    public void testThatMethoReturnsValidInputWithHigNumbers(){
    assertEquals(Opes.BinaryToDecimal.toDecimal(1100100),100);
    }

    @Test
    public void testThatMethoReturnsValidInputWithMediumNumbers(){
    assertEquals(Opes.BinaryToDecimal.toDecimal(10100),20);
    }
}

