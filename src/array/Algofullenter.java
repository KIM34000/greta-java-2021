package array;

import java.util.Scanner;

public class Algofullenter {

	public static void main(String[] args) {
		int [] arr;
		arr = new int[5]; 		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre une série de valeurs");
		
			int i = 0;
			int nbr =1 ;
			
		while(nbr != 0 && i < 5) {
			System.out.println("Enter number "+(i+1));
			nbr = scanner.nextInt();
			arr[i] = nbr;
			i++;			
			
		}
		System.out.print("arrays contains ");
		 for ( i = 0; i < 5;i++) 
	      { 		      
	          System.out.print(" "+arr[i]); 		
	      } 
		
	}

	}


