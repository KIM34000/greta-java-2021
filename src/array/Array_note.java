package array;

public class Array_note {
		
		 static double note[][] = {
		 { 4.75, 5.00, 5.75, 5.25 },
		 { 3.00, 5.25, 4.75, 6.00 },
		 { 4.25, 5.00, 4.75, 5.52 }
		 };

		 /**
		 * Ceci crée un tableau pour les moyennes
		 */
		 double moyenne[] = new double[3];

		 /**
		 * Ceci calcule les moyennes
		 */
		 public void calculeMoyennes() {
		 double sum;
		 for (int i = 0; i < 3; ++i) {
		 sum = 0.0;
		 for(int j=0;j< 4;++j){
		 sum += note[i][j];
		 }
		 moyenne[i] = sum/4;
		 }
		 }

		 /**
		 * affiche les notes stockées et leurs moyennes
		 */
		 public void afficheNotesMoy() {
		 for (int i = 0; i < 4; ++i) {
		 System.out.print("\tét." + i);
		 }
		 System.out.println("\tmoyenne");
		 for (int i = 0; i < 3; ++i) {
		 System.out.print("Grp " + i + '\t');
		 for (int j = 0; j < 4; ++j) {
		 System.out.print(note[i][j] + "\t");
		 }
		 System.out.println(moyenne[i]);
		 }
		 }
		 /**
		 * Méthode pour tester
		 **/
		


	}

