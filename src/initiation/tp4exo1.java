package initiation;

import java.security.PublicKey;
import java.util.Scanner;

public class tp4exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		secound();
		third();
		int i, n, som;
        som = 0;
        for (i = 0; i < 4; i++) {
            System.out.println(i+"-Donnez un entier");
            n = Clavier.lireInt();
            som += n;
            System.out.println("Somme for now= " + som);
        }
        System.out.println("Somme = " + som);
        }
        public static void secound(){
        	int i = 0, n, som;
            som = 0;
            while ( i < 4) {
            	 System.out.println(i+"-Donnez un entier");
                 n = Clavier.lireInt();
                 som += n;
                 System.out.println("Somme for now= " + som);                  
                i++;
                System.out.println("Le i vaut :" + i);
            }
            System.out.println("La somme finale vaut :" + som);
       	 }
        
        public static void third(){
        	int i = 0, n, som;
            som = 0;
    		
    		try {
    		    do {
    		    	 System.out.println(i+"-Donnez un entier");
    		    	 n = Clavier.lireInt();
                     som += n;
                     System.out.println("Somme for now= " + som);                  
                    i++;
                    System.out.println("Le i vaut :" + i);
    		        
    		       }while ( i < 4);
    		    System.out.println("La somme finale vaut :" + som);
    		} catch (Exception e) {
    		    System.out.println("Erreur d'Entree/Sortie " + e.getMessage());
    		}
    	}
       	     
		 
}
