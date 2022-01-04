package array;

import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

public class notes {

	public static void main(String[] args) {
		int [] arr;
		arr = new int[10]; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("chose 10 notes ");
				
		for(int i =0; i < 10 ; i++) {
			System.out.println("input number "+i);
			int nbr = scanner.nextInt();
			arr[i] = nbr;
		}
		// calcul =========================================================================>
				 // getting array length
		        float length = arr.length;
		 
		        // default sum value.
		        float sum = 0;
		 
		        // sum of all values in array using for loop
		        for (int i = 0; i < arr.length; i++) {
		            sum += arr[i];
		        }
		 
		        float average = sum / length;
		         
		        System.out.println("Average of array : "+average);
		        // calcul ===========================================================================>
		        int count = 0;
		        for(int i=0; i < 10; i++) {
		        	if(arr[i] > average ) {
		        		count++;		        		
		        	}		        	
		        }
		        System.out.println(count + " Students higher than average score");
	}

}
//algo
//1) cakcyk average
//2) in boucle for if else condition if students notes est bigger than average