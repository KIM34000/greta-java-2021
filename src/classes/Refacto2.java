package classes;

public class Refacto2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot dante = new Robot();
		 dante.status = "explorant";
		 dante.speed = 2;
		 dante.temperature = 510;
		 dante.showAttributes();
		 System.out.println("Augmentation vitesse ... 3.");
		 dante.speed = 3;
		 dante.showAttributes();
		 System.out.println("Changement température ... 670.");
		 dante.temperature = 670;
		 dante.showAttributes();
		 System.out.println("Vérification de la température.");
		 dante.checkTemperature();
		 dante.showAttributes();
	}

}
