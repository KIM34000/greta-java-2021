package classes;

public class Robot {

	String status;
	 int speed;
	 float temperature;
	 void checkTemperature() {
	 if (temperature > 660) {
	 status = "retour au bercail";
	 speed = 5;
	 }
	 }
	 void showAttributes() {
	 System.out.println("Statut : " + status);
	 System.out.println("Vitesse : " + speed);
	 System.out.println("Temp�rature : " + temperature);
	 }

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
		 System.out.println("Changement temp�rature ... 670.");
		 dante.temperature = 670;
		 dante.showAttributes();
		 System.out.println("V�rification de la temp�rature.");
		 dante.checkTemperature();
		 dante.showAttributes();

	}

}
