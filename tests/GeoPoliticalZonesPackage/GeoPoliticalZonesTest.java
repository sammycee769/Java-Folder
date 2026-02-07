package GeoPoliticalZonesPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GeoPoliticalZonesTest {
    @Test
    public void returnsCorrectZoneForLagos(){
        String zone = GeoPoliticalZones.getPoliticalZone("Lagos");
        assertEquals("SOUTH_WEST",zone);
    }

    @Test
    public void returnsCorrectZoneForLagos2(){

    }
}
