package hospital;

public class Receptionist extends Employee {

	private String receptionistPay = "$45,000";
	
	public Receptionist(String name, String id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String calculatePay() {
		// TODO Auto-generated method stub
		return receptionistPay;
	}

}
