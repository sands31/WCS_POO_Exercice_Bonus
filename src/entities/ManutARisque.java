package entities;

public class ManutARisque extends Manutentionnaire implements EmployeARisque {
	
	public ManutARisque(String firstName, String lastName, int age, String entryDate, long heuresMensuelles) {
		super(firstName, lastName, age, entryDate, heuresMensuelles);
		this.setType("manutentionnaire à risque");
	}
	
	@Override
	public long calculerSalaire() {
		return super.calculerSalaire() + primeMensuelle();
	}
}