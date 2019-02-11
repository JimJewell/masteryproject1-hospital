package nonmedicalemployee;

import hospital.Hospital;
import hospital.Patient;
import medicalemployees.CanDrawBlood;

public class VampireJanitor extends Janitor implements CanSweep, CanDrawBlood {

	private String pay = "$40,000";

	public VampireJanitor(String name, String id, String job, boolean sweep) {
		super(name, id, job, false);
	}

	@Override
	public String calculatePay() {
		return pay;
	}

	@Override
	public void sweep(Hospital hospital) {
		hospital.sanitizeHospital();

	}

	@Override
	public void drawBlood(Patient patient) {
		patient.deathByVampire();

	}

	@Override
	public String toString() {
		return "|Name: " + getName() + ", >" + "  Employee ID: " + getId() + ", >" + "  Title: " + getJob() + ", >" + "  Currently Sweeping: " + getIsSweeping() + "|";
	}
}
