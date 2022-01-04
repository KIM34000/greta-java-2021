package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;
import javax.sql.rowset.JoinRowSet;
import javax.swing.text.StyledEditorKit.ForegroundAction;
public class saisir {

	public static void main(String[] args) {
		
		int [] arr;
		arr = new int[5]; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("chose your 5 numbers");
				
		for(int i =0; i < 5 ; i++) {
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
 
        double average = sum / length;
         
        System.out.println("Average of array : "+average);
        // calcul ===========================================================================>
        
        Arrays.sort(arr); 
        System.out.println(arr[0]);
        System.out.println(arr[4]);
}
}


//algo  1) 5values put in [] and calcaut average

//      2) Array.sort()
//      3) System.out [0], System.out [4]