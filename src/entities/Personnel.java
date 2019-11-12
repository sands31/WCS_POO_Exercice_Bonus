package entities;

import java.util.ArrayList;

public class Personnel {
	
	private ArrayList<Employe> personnel;
	
	public Personnel() {
		this.personnel = new ArrayList<Employe>();		
	}
	
	public void ajouterEmploye(Employe employe) {
		this.personnel.add(employe);		
	}
	
	public void afficherSalaires() {
		for (int i = 0; i < personnel.size(); i++) {
			System.out.println(personnel.get(i).getNom() + " gagne " + personnel.get(i).calculerSalaire() + ".");
		}	
	}
	
	public double salaireMoyen() {
		double salairesTotaux = 0;
		int count = 0;
		for (int i = 0; i < personnel.size(); i++) {
			salairesTotaux += personnel.get(i).calculerSalaire();
			count ++;
		}
		return salairesTotaux / count;
	}
}
