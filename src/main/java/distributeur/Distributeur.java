package distributeur;

import java.util.ArrayList;

public class Distributeur {
    
    private int credit; // argent dispo pour acheter
    private ArrayList<Produit> stock = new ArrayList<>();
    
    public Distributeur(){
        credit = 0;
    }
    
    public void remplirLeStock() {
        stock.add(new Produit("café", 1, 5));
        stock.add(new Produit("soda", 2, 5));
        stock.add(new Produit("barre céréales", 3, 5));
    }
    
    public void insererArgent(int montant){
        credit += montant;
    }
    
    public void commanderProduit(int indexProduit){
        
    }
    
    public void recupererArgentRestant() {
        
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public ArrayList<Produit> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Produit> stock) {
        this.stock = stock;
    }
    
}
