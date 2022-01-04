package initiation;

import java.util.Scanner;
import java.util.Arrays;
public class exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("write the first number ");			
		int number1 = scanner.nextInt();
		System.out.println("write the second number");
		int number2 = scanner.nextInt();
		System.out.println("write the third number");
		int number3 = scanner.nextInt();
		System.out.println("write the fourth number");
		int number4 = scanner.nextInt();
		System.out.println("The biggest number is :");
		
		// initializing unsorted int array
//		int iArr[] = {number1,number2,number3,number4};
		// let us print all the elements available in list
//	      for (int number : iArr) {
//	         System.out.println("Number = " + number);
//	      }
		// sorting array
//	      Arrays.sort(iArr);
//		System.out.println(iArr[3]);
		if(number1>number2) {
			if(number1>number3) {
				
				if(number1>number4) {
					System.out.println(number1 +" is the biggest number");
				}else {
					System.out.println(number4 +" is the biggest number");
				}
			}else {
				if(number3>number4) {
					System.out.println(number3 +" is the biggest number");
				}else {
					System.out.println(number4 +" is the biggest number");
				}
			}
		}else {
		if(number2>number3) {
			if(number2>number4) {
				System.out.println(number2 +" is the biggest number");
			}else {
				System.out.println(number4 +" is the biggest number");
			}
		}else {
			if(number3>number4) {
				System.out.println(number3 +" is the biggest number");
			}else {
				System.out.println(number4 +" is the biggest number");
			}
		}
		}
		
		
		
		
	}	
	}


