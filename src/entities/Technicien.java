package entities;

public class Technicien extends Employe {
	
	private String type;
	private int unitesMensuelles;

	public Technicien(String firstName, String lastName, int age, String entryDate, int unitesMensuelles) {
		super(firstName, lastName, age, entryDate);
		this.unitesMensuelles = unitesMensuelles;
		this.type = "technicien";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public int getUnitesProduites() {
		return unitesMensuelles;
	}

	public void setUnitesProduites(int unitesMensuelles) {
		this.unitesMensuelles = unitesMensuelles;
	}
	
	@Override
	public long calculerSalaire() {
		return (long) (this.unitesMensuelles * 5);
	}
	
	@Override
	public String getNom() {
		return "Le " + this.type + " " + this.getFirstName() + " " + this.getLastName();
	}


}