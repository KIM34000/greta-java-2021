package initiation;

public class tp44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = 1;
		    float a;
		    while (x <= 10) {
		      x++;
		      System.out.print("x = " + x);
		      if (x == 7) {
		        System.out.println("\tDivision par zero!");
		        continue;
		      }
		      a = (float) 1 / (x - 7);
		      System.out.println(" \ta = " + a);
		    }
	}

}
