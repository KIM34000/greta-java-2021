package initiation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.naming.AuthenticationException;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 aujourdhui();
		 maintenant();
		 saisirDate();
		}
		public static void aujourdhui(){
		    Date maDate = new Date();
		    //make format the date
		    SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy");//		   
		    System.out.println("aujourd'hui nous sommes le " + DateFormat.format(maDate));
			//System.out.println( maDate); 
		}   	    	
		  
		
		public static void maintenant(){
			 Date maDate = new Date();
			 SimpleDateFormat DateFormat = new SimpleDateFormat("HH:mm:ss");
			 System.out.println("current times is "+ DateFormat.format(maDate));			
		   
		}
		public static void saisirDate(){
		    
			Scanner scanner_obj = new Scanner(System.in);
			System.out.println("write day: ");
			String day = scanner_obj.nextLine();
			System.out.println("today day is:" +day);
			Scanner scanner_month = new Scanner(System.in);
			System.out.println("write month: ");			
			String month = scanner_obj.nextLine();
			System.out.println("today month is:" +month);
			Scanner scanner_year = new Scanner(System.in);
			System.out.println("write year: ");			
			String year = scanner_year.nextLine();
			System.out.println("today year is:" +year);
			
			
		}
	

}
