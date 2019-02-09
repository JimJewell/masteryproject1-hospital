package hospital;

public class Nurse extends Employee {

	String pay = "$50,000";

	public Nurse(String name, String id) {
		super(name, id);
		
	}

	@Override
	public String calculatePay() {
		return pay;
	}

}
