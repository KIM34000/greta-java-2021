package bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Client {

	private String nom;
	private String prenom;
	private String adresseLigne1;
	private String adresseLigne2;
	private String adresseCP;
	private String adresseVille;
	private GregorianCalendar dateDeNaissance;
	
	public Client() {
        nom = "nomclient";
        prenom= "prenomClient";
        adresseLigne1="adresseClient" ;
        adresseLigne2= "adresse2Client" ;
        adresseCP= "adresseCPClient" ;
        adresseVille= "villeClient";
        dateDeNaissance=  new GregorianCalendar();

    }

	
public String getNom() {
	return nom;
}
public String getPrenom() {
	return prenom;
}
public String getAdresseLigne1() {
	return adresseLigne1;
}
public String getAdresseLigne2() {
	return adresseLigne2;
}
public String getadresseCP() {
	return adresseCP;
}
public String getadresseVille() {
	return adresseVille;
}
public GregorianCalendar getdateDeNaissance() {
	return dateDeNaissance;
}

public void setNom(String nom) {
	this.nom = nom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public void setAdresseLigne1(String adresseLigne1) {
	this.adresseLigne1 = adresseLigne1;
}
public void setAdresseLigne21(String adresseLigne2) {
	this.adresseLigne2 = adresseLigne2;
}
public void setAdresseCP(String adresseCP) {
	this.adresseCP = adresseCP;
}
public void setAdresseVille(String adresseVille) {
	this.adresseVille = adresseVille;
}
public void setdateDeNaissance(GregorianCalendar dateDeNaissance ) {
	this.dateDeNaissance = dateDeNaissance;
}

public void saisieDesInformationsClients(){
	Scanner scanner  = new Scanner(System.in);
	System.out.println("plz enter your last name");
	
	nom = scanner.nextLine();
	//System.out.println(numCpte);
	System.out.println("plz enter your first name");
	
	prenom = scanner.nextLine();
	System.out.println("plz enter your AdresseLigne1");
	
	adresseLigne1 = scanner.nextLine();
	System.out.println("plz enter your AdresseLigne2");
	
	adresseLigne2 = scanner.nextLine();
	System.out.println("plz enter your adresseCP");
	
	adresseCP = scanner.nextLine();
	System.out.println("plz enter your adresseVille");
	
	adresseVille = scanner.nextLine();	




 Date varTemp = null;
        while (varTemp == null) {
        try { 
        	System.out.println("veuillez saisir votre date de naissance dd/mm/yyyy");
        	String d1 = scanner.nextLine();

        SimpleDateFormat newDate = new SimpleDateFormat("dd/mm/yyyy");
       
        varTemp = newDate.parse(d1);
        } catch (ParseException e) {
            System.out.println("Sorry, that's not valid. Please try again.");
        }
        }
        this.dateDeNaissance= (GregorianCalendar)Calendar.getInstance(Locale.FRANCE);
        this.dateDeNaissance.setTime(varTemp);
}	
public void affichageDesInformationsBancaires() {
	System.out.println(nom);
	System.out.println(prenom);
	System.out.println(adresseLigne1);
	System.out.println(adresseLigne2);
	System.out.println(adresseCP);
	System.out.println(adresseVille);
	System.out.println(dateDeNaissance);
}
}


