package entities;

public class TechnARisque​ extends Technicien implements EmployeARisque {
	
	public TechnARisque​(String firstName, String lastName, int age, String entryDate, int unitesProduites) {
		super(firstName, lastName, age, entryDate, unitesProduites);
		this.setType("technicien à risque");
	}
	
	@Override
	public long calculerSalaire() {
		return super.calculerSalaire() + primeMensuelle();
	}
}
