package initiation;

public class tp4exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i, n, som;
        som = 0;
        for (i = 0; i < 4; i++) {
            System.out.println(i+"give a score");
            n = Clavier.lireInt();
            som += n;
            System.out.println("score now= " + som);
        }
        int averageScore;
        averageScore = som/4;
        System.out.println("total score  = " + averageScore);
        if(averageScore >=10) {
        	System.out.println("admis");
        }else if(8 <= averageScore ) {
        	System.out.println("admissible");
        }else {
        	System.out.println("recalé");
        }
        }
	
	
	}

