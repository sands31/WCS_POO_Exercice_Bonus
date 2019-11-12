package entities;

public class Manutentionnaire extends Employe {
	
	private String type;
	private long heuresMensuelles;

	public Manutentionnaire(String firstName, String lastName, int age, String entryDate, long heuresMensuelles) {
		super(firstName, lastName, age, entryDate);
		this.heuresMensuelles = heuresMensuelles;
		this.type = "manutentionnaire";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getChiffreAffaire() {
		return heuresMensuelles;
	}

	public void setChiffreAffaire(long heuresMensuelles) {
		this.heuresMensuelles = heuresMensuelles;
	}
	
	@Override
	public long calculerSalaire() {
		return (long) (this.heuresMensuelles * 65);
	}
	
	@Override
	public String getNom() {
		return "Le " + this.type + " " + this.getFirstName() + " " + this.getLastName();
	}
}