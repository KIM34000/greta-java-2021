package initiation;
import java.util.Scanner;
public class exo1 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ecrire un nombre: ");			
		int nombre = scanner.nextInt();
		System.out.println(nombre);
		
		
		if (nombre >=10)
		{
			System.out.println("Vous �tes admis(e)");
			if(nombre <12)
			{
				System.out.println("Votre mention est assez bien");
				
			}	
			else {
				
				if(nombre <14) {
					System.out.println("Votre mention est bien");
				}
			
			
			else {
				if(nombre <16) {
			
				System.out.println("Votre mention est tr�s bien");
				}
				}
			}
		}
		else {
			if(nombre >=8) {
					System.out.println("Vous �tes sur liste d'attente");
			}
		else {
			System.out.println("Vous �tes refus�(e)");
			
		}	
	

}
	}
}
