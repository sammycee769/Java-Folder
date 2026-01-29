package CodeLevelling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MFDSystemTest{
    @Test
    public void isValidAmountKeroseneTest(){
    assertFalse(MFDSystem.isValidAmountKerosene(555000));
    assertTrue(MFDSystem.isValidAmountKerosene(2000));
    }

    @Test
    public void isValidAmountGasTest(){
    assertFalse(MFDSystem.isValidAmountGas(-555000));
    assertTrue(MFDSystem.isValidAmountGas(1000));
    }

    @Test
    public void isValidAmountDieselTest(){
    assertFalse(MFDSystem.isValidAmountDiesel(-555000));
    assertTrue(MFDSystem.isValidAmountDiesel(2000));
    }

    @Test
    public void isValidAmountPetrolTest(){
    assertFalse(MFDSystem.isValidAmountPetrol(100));
    assertTrue(MFDSystem.isValidAmountPetrol(45.5*100));
    }

    @Test
    public void isValidAFuelTest(){
    assertFalse(MFDSystem.isValidFuel(100));
    assertTrue(MFDSystem.isValidFuel(45.5));
    }

    @Test
    public void isValidPetrolOptionTest(){
    assertFalse(MFDSystem.isValidPetrolOption("litres"));
    assertFalse(MFDSystem.isValidPetrolOption("  ."));
    assertTrue(MFDSystem.isValidPetrolOption("liter"));
    assertTrue(MFDSystem.isValidPetrolOption("amount"));
    }

    @Test
    public void isValidGasOptionTest(){
    assertFalse(MFDSystem.isValidGasOption("liter"));
    assertFalse(MFDSystem.isValidGasOption("  ."));
    assertTrue(MFDSystem.isValidGasOption("kilogram"));
    assertTrue(MFDSystem.isValidGasOption("amount"));
    }
}
