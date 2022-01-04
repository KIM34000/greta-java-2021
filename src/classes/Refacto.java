package classes;

public class Refacto {

	static String status;
	 static int speed;
	 static float temperature;
	 
	 public static void checkTemperature() {
	 if (temperature > 660) {
	 status = "retour au bercail";
	 speed = 5;
	 }
	
	 }
	 public static void showAttributes() {
	 System.out.println("Statut : " + status);
	 System.out.println("Vitesse : " + speed);
	 System.out.println("Température : " + temperature);
	 }
	

}
