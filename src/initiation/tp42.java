package initiation;

public class tp42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int fin = 10;// ceci est une constante, mot clé final
        int somme = 0;
        int i = 0;
        while (i < fin) {
            somme +=i;       
            System.out.println("La somme vaut :" + somme);
            i++;
            System.out.println("Le i vaut :" + i);
        }
        System.out.println("La somme finale vaut :" + somme);
	}

}
