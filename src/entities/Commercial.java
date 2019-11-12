package entities;

public class Commercial extends Employe {
	
	private String type;
	private long chiffreAffaire;

	public Commercial(String firstName, String lastName, int age, String entryDate, long chiffreAffaire) {
		super(firstName, lastName, age, entryDate);
		this.chiffreAffaire = chiffreAffaire;
		this.type = "commercial";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(long chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
	
	@Override
	public long calculerSalaire() {
		return (long) (this.chiffreAffaire * 0.2);
	}
	
	@Override
	public String getNom() {
		return "Le " + this.type + " " + this.getFirstName() + " " + this.getLastName();
	}
}