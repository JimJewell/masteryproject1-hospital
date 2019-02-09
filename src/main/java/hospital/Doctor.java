package hospital;

public class Doctor extends Employee {

	private String pay = "$90,000";
	private String specialty;
	
	public Doctor(String name, String id, String specialty) {
		super(name, id);
		this.specialty = specialty;
	
	}

	@Override
	public String calculatePay() {
		// TODO Auto-generated method stub
		return pay;
	}

	public String getSpecialty() {
		return specialty;
	}

}
