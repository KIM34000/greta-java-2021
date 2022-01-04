package array;

public class Aleatoire {

	
		/**
		 * tableau de nombre "int"
		 */
		 int[] nombre = new int[7];


		 /**
		 * M�thodes qui stocke les nombres al�atoirement
		 */
		 public void stockeNombres() {
		 for (int i = 0; i < nombre.length; ++i) {
		 //nombre[i] = (float)Math.random();
		 nombre[i]= alea(0, 100);
		 }
		 }

		 /**
		 * Affiche le nombre
		 */
		 public void afficheNombres() {
		 for (int i = 0; i < nombre.length; ++i) {
		 System.out.println(nombre[i] + "\n");
		 }
		 } 
		 /**
		  * Entier al�atoire
		  * @param lower int // le plus bas
		  * @param higher int // le plus haut
		  * @return int
		  */
		  public static int alea(int lower, int higher ){
		  int random = (int)(Math.random() * (higher-lower + 1)) + lower;
		  return random;
		  }
}


