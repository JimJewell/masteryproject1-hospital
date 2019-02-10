package hospital;

public class VampireJanitor extends Employee implements CanSweep, CanDrawBlood {

	private String pay = "$40,000";
			
	public VampireJanitor(String name, String id) {
		super(name, id);
	}

	@Override
	public String calculatePay() {
		return pay;
	}

	@Override
	public void sweep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.deathByVampire();
		
		
	}

}
