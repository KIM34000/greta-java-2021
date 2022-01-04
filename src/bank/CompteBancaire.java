package bank;

import java.util.Scanner;

public class CompteBancaire {

	private Integer numCpte;
	private String nomCpte;
	private Float solde;
public CompteBancaire() {
	numCpte=-1;
	nomCpte="un compte";
	solde=0f;
}
public Integer getNumCpte() {
	return numCpte;
}
public String getNomCpte() {
	return nomCpte;
}
public Float getSolde() {
	return solde;
}
public void setNumCpte(Integer numCpte) {
	this.numCpte = numCpte;
}
public void setNomCpte(String nomCpte) {
	this.nomCpte = nomCpte;
}
public void setSolde(Float solde ) {
	this.solde = solde;
}
public void saisieDesInformationsBancaires(){
	System.out.println("plz enter your bank acount");
	Scanner scanner  = new Scanner(System.in);
	numCpte = scanner.nextInt();
	//System.out.println(numCpte);
	System.out.println("plz enter your name");
	Scanner nom  = new Scanner(System.in);
	nomCpte = nom.nextLine();
	System.out.println("plz enter your amount");
	Scanner amount  = new Scanner(System.in);
	solde = amount.nextFloat();
	
}
public void affichageDesInformationsBancaires() {
	System.out.println(numCpte);
	System.out.println(nomCpte);
	System.out.println(solde);
}

@Override
public String toString() {
	return "Compte numéro" + this.numCpte;
}
}
