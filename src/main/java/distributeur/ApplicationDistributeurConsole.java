package distributeur;

import java.util.Scanner;


public class ApplicationDistributeurConsole {
    
    public static void main(String[] args) {
        
        Distributeur distributeur = new Distributeur();
        distributeur.remplirLeStock();
        
        Scanner clavier = new Scanner(System.in);
        
        boolean continuer = true;
        while(continuer){
            
            System.out.println("Vous disposez de : "+distributeur.getCredit());
            
            System.out.println("1. Insérer de l’argent");
            System.out.println("2. Acheter");
            System.out.println("3. Quitter");
                    
            int choix = clavier.nextInt();
            
            switch (choix) {
                case 1:
                    System.out.println("Quel montant ?");
                    int montant = clavier.nextInt();
                    distributeur.insererArgent(montant);
                    
                    break;
                case 2:
                    System.out.println("Choisissez le numéro du produit:");
                    for(Produit produit: distributeur.getStock()){
                        System.out.println(produit.getId()+" : "
                                +produit.getNom()+" : "+produit.getPrix() + " [ "
                                +produit.getQuantite()+" ]");
                    }
                    int produitId = clavier.nextInt();
                    
                    if(! distributeur.creditSuffisant(produitId, 1)){
                        System.out.println("Veuillez insérer de l'argent");
                    } else {
                        if(! distributeur.stockSuffisant(produitId, 1)){
                            System.out.println("Stock insuffisant");
                        } else {
                            distributeur.commanderProduit(produitId);
                        }
                    }
                    
                    break;
                case 3:
                    continuer = false;
                    
                    break;                    
                default:
                    System.out.println("J'ai pas compris");
            }
        }
        System.out.println("AU REVOIR !");    
    }
}
