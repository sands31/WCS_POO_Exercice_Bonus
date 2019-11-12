package entities;

public class Vendeur extends Commercial {
	

	public Vendeur(String firstName, String lastName, int age, String entryDate, long chiffreAffaire) {
		super(firstName, lastName, age, entryDate, chiffreAffaire);
		this.setType("vendeur");
	}

	@Override
	public long calculerSalaire() {
		return super.calculerSalaire() + 400;
	}
	
	@Override
	public String getNom() {
		return "Le " + this.getType() + " " + this.getFirstName() + " " + this.getLastName();
	}
}