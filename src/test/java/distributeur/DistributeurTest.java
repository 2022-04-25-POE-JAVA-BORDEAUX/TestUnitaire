package distributeur;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class DistributeurTest {
    
    @Test
    public void testRemplirLeStock() {
        
        Distributeur distributeur = new Distributeur();
        distributeur.remplirLeStock();
        
        assertEquals(3, distributeur.getStock().size());
    }
    
}
