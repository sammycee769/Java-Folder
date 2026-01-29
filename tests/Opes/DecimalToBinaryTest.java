package Opes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToBinaryTest{
    @Test
    public void testThatMethoReturnsValidInput(){
    assertEquals(Opes.DecimalToBinary.toBinary(10),"1010");
    }

    @Test
    public void testThatMethoReturnsValidInputWithNegativeNumers(){
    assertEquals(Opes.DecimalToBinary.toBinary(-10),"1010");
    }

    @Test
    public void testThatMethoReturnsZeroWithZeros(){
    assertEquals(Opes.DecimalToBinary.toBinary(0),"0");
    }

    @Test
    public void testThatMethoReturnsValidInputWithHigNumbers(){
    assertEquals(Opes.DecimalToBinary.toBinary(100),"1100100");
    }

    @Test
    public void testThatMethoReturnsValidInputWithMediumNumbers(){
    assertEquals(Opes.DecimalToBinary.toBinary(20),"10100");
    }
}

