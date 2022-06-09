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
    
    @Test
    public void testCommanderProduitProduitInexistant(){
        Distributeur distributeur = new Distributeur();
        distributeur.remplirLeStock();
        distributeur.insererArgent(5);
        
        distributeur.commanderProduit(0);
        
        assertEquals(5, distributeur.getCredit());
        assertEquals(5, distributeur.getProduit(1).getQuantite());
        assertEquals(5, distributeur.getProduit(2).getQuantite());
        assertEquals(5, distributeur.getProduit(3).getQuantite());
    }
    
    @Test
    public void testCommanderProduitStockVide(){
        Distributeur distributeur = new Distributeur();
        distributeur.remplirLeStock();
        distributeur.getProduit(1).setQuantite(0);
        distributeur.insererArgent(5);
        
        distributeur.commanderProduit(1);
        
        assertEquals(5, distributeur.getCredit());
        assertEquals(0, distributeur.getProduit(1).getQuantite());
    }
    
    @Test
    public void testCommanderProduitCreditZero(){
        Distributeur distributeur = new Distributeur();
        distributeur.remplirLeStock();
        
        distributeur.commanderProduit(1);
        
        assertEquals(0, distributeur.getCredit());
        assertEquals(5, distributeur.getProduit(1).getQuantite());
    }
    
    @Test
    public void testCommanderProduitCreditInsuffisant(){
        Distributeur distributeur = new Distributeur();
        distributeur.remplirLeStock();
        distributeur.insererArgent(1);
        
        distributeur.commanderProduit(2);
        
        assertEquals(1, distributeur.getCredit());
        assertEquals(5, distributeur.getProduit(2).getQuantite());
    }
}
