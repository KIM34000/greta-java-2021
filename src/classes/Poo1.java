package classes;
import java.util.Date;


public class Poo1 {
	
	/* Variable de classe*/
	 private static int random = (int) (new Date().getTime());
	 /**
	 * M�thode qui fourni un nombre al�atoire
	 **/
	 public static int random() {
	 random = random ^ (random * random);
	 return random;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (;;)
			 System.out.println("Aleatoire : " + Poo1.random());

	}

}
