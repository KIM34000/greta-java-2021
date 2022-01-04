package array;

import java.util.Scanner;

public class MultiDimension {
	int dimension[][] = new int [3][4];
	
	public void fillDimension() {
	for(int i = 0; i < dimension.length; i++) {
		for(int j = 0; j <dimension[0].length; j++) {
			dimension[i][j] = alea(0, 10);
			System.out.println(dimension[i][j]);
		}
	}
	}
	
	public static int alea(int lower, int higher ){
		 int random = (int)(Math.random() * (higher-lower + 1)) + lower;
		 return random;
		 }
	
	public void fillArray(int l, int c) {
		int dimenArray[][] = new int [l][c];
		for(int i = 0; i < dimenArray.length; i++) {
			System.out.println("Line number " + i);
			for(int j = 0; j <dimenArray[0].length; j++) {
				dimenArray[i][j] = alea(0, 10);
				System.out.println(dimenArray[i][j]);
			}
		}
	}
	
	public void fillByHand() {
		int dimenHand[][] = new int [2][3];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < dimenHand.length; i++) {
			System.out.println("Line number " + i);
			for(int j = 0; j <dimenHand[0].length; j++) {
				System.out.println("Choose the number for place " + i +j);	
				dimenHand[i][j] = scanner.nextInt();
				System.out.println(dimenHand[i][j]);
			}
		}
		
	}
}
