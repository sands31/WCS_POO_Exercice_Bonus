package entities;

public abstract class Employe {
	
	private String firstName;
	private String lastName;
	private int age;
	private String entryDate;
	
	
	public Employe(String firstName, String lastName, int age, String entryDate) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.entryDate = entryDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEntryDAte() {
		return entryDate;
	}

	public void setEntryDAte(String entryDate) {
		this.entryDate = entryDate;
	}
	
	public abstract long calculerSalaire();
	
	public String getNom() {
		return "L'employé " + this.firstName + " " + this.lastName;
	}

}
