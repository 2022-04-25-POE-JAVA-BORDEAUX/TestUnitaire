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
    
    @Test
    public void testInsererArgent() {
        
        Distributeur distributeur = new Distributeur();
        int montantInitial = distributeur.getCredit();
        distributeur.insererArgent(5);
        
        assertEquals(montantInitial+5, distributeur.getCredit());
    }
 
    
    @Test
    public void testCommanderProduit(){
        Distributeur distributeur = new Distributeur();
        distributeur.remplirLeStock();
        distributeur.insererArgent(5);
        
        distributeur.commanderProduit(1);
        
        assertEquals(4, distributeur.getCredit());
        assertEquals(4, distributeur.getProduit(1).getQuantite());
    } 
}
