package array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exo1 {
	
	public static void repertoire() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many people would like to add?");
		int length = scanner.nextInt();
		
		String nom[] = new String[length];
		String prenom[] = new String[length];
		String adresse[] = new String[length];
		int codePostal[] = new int[length];
		String ville[] = new String[length];
		int age[] = new int[length];
		int tempCP;
		
		for(int i = 0; i < nom.length; i++) {
			
			System.out.println("Please enter " + (i+1) + ". person's surname: ");
			nom[i] = scanner.next();
			System.out.println("Please enter " + (i+1) + ". person's last name: ");
			prenom[i] = scanner.next();
			System.out.println("Please enter " + (i+1) + ". person's address: ");
			adresse[i] = scanner.next();
			while (codePostal[i] == 0) {
			try {
			System.out.println("Please enter " + (i+1) + ". person's post code: ");
			tempCP = scanner.nextInt();
			codePostal[i] = tempCP;
	        } catch (InputMismatchException e) {
	            System.out.println("Sorry, that's not valid. Please try again.");
	        }
			}
			System.out.println("Please enter " + (i+1) + ". person's town: ");
			ville[i] = scanner.next();
			while (age[i] == 0) {
			try {
			System.out.println("Please enter " + (i+1) + ". person's age: ");
			age[i] = scanner.nextInt();
	        } catch (InputMismatchException e) {
	            System.out.println("Sorry, that's not valid. Please try again.");
	        }
			}
		}
		for(int i = 0;i < nom.length; i++) {
			System.out.println((i+1) + ". entry: ");
			System.out.println("Surname: " + nom[i]);
			System.out.println("Last name: " + prenom[i] );
			System.out.println("Address: "+ adresse[i]);
			System.out.println("Post code: "+ codePostal[i]);
			System.out.println("Town: " + ville[i]);
			System.out.println("Age: " + age[i]);
			
		}
	}
	
	
}
