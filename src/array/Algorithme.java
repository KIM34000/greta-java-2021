package array;

import java.util.Scanner;

public class Algorithme {

	public static void main(String[] args) {
		int [] arr;
		arr = new int[5]; 		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre une série de valeurs");
		
			int i = 0;
			int nbr =1 ;
			int sum =0;
		while(nbr != 0 && i < 5) {
			System.out.println("Enter number "+(i+1));
			nbr = scanner.nextInt();
			arr[i] = nbr;
			i++;			
			
		}
		for ( i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
 
		System.out.println("La somme des valeurs saisie est " +sum);
	}

}
