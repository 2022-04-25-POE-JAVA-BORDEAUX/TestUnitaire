package distributeur;

import java.util.ArrayList;

public class Distributeur {
    
    private int credit; // argent dispo pour acheter
    private ArrayList<Produit> stock = new ArrayList<>();
    
    public Distributeur(){
        credit = 0;
    }
    
    public void remplirLeStock() {
        stock.add(new Produit(1, "café", 1, 5));
        stock.add(new Produit(2, "soda", 2, 5));
        stock.add(new Produit(3, "barre céréales", 3, 5));
    }
    
    public void insererArgent(int montant){
        credit += montant;
    }
    
    public void commanderProduit(int id){
                
        for(Produit produit: stock){
            if(produit.getId() == id){
                
                if(credit >= produit.getPrix() && produit.getQuantite()>=1){
                    produit.setQuantite(produit.getQuantite()-1);
                    credit = credit - produit.getPrix();
                }
            }
        }
        
       
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
    
    public Produit getProduit(int id){
         for(Produit produit: stock){
            if(produit.getId() == id){
                return produit;
            }
         }
         return new Produit();// ATTENTION : à améliorer ?
    }
    
}
