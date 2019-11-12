package entities;

public class Representant extends Commercial {
	

	public Representant(String firstName, String lastName, int age, String entryDate, long chiffreAffaire) {
		super(firstName, lastName, age, entryDate, chiffreAffaire);
		this.setType("représentant");
	}

	@Override
	public long calculerSalaire() {
		return super.calculerSalaire() + 800;
	}
	
	@Override
	public String getNom() {
		return "Le " + this.getType() + " " + this.getFirstName() + " " + this.getLastName();
	}
}