package hospital;

public class Surgeon extends Employee {

	private String pay = "$120,000";
	
	public Surgeon(String name, String id) {
		super(name, id);
		}

	@Override
	public String calculatePay() {
		return pay;
	}

	
		

	}


	

	




	
	


	
	


