package hospital;

import java.util.Collection;
import java.util.HashMap;

import medicalemployees.Nurse;
import medicalemployees.Surgeon;

public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Hospital highStMercy = new Hospital();
		
		Surgeon jerry = new Surgeon("Jerry", "888", "Plastic", "Surgeon", false);
		Nurse n1 = new Nurse("Sunshine", "444" , "RN");
	
		
		Patient bob = new Patient("Bob", "002", 20, 10);
		
		jerry.toggleSurgery();
		System.out.println(jerry.getName() + " is performing surgery? " + jerry.getPerformingSurgery());
		jerry.repairPatient(bob);
		System.out.println(bob.getPatientName() + " is recovering from surgery ");
		
		

	}

}
