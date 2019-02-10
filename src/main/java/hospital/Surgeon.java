package hospital;

public class Surgeon extends Employee {

	private String pay = "$120,000";
	private boolean surgery;
	
	public Surgeon(String name, String id, boolean surgery) {
		super(name, id);
		this.surgery = false;
		}

	@Override
	public String calculatePay() {
		return pay;
	}

	public void toggleSurgery() {
		surgery = !surgery;
		
	}

	public boolean getPerformingSurgery() {
		return surgery;
	}

	
		

	}


	

	




	
	


	
	


