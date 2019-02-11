package hospital;

public class Patient {

	public static final int BLOOD_LEVEL = 20;
	public static final int HEALTH_LEVEL = 10;
	private String patientName;
	private String patientID;
	private int patientBlood;
	private int patientHealth;

//	Patient Constructor
	public Patient(String patientName, String patientID, int patientBlood, int patientHealth) {
		this.patientName = patientName;
		this.patientID = patientID;
		this.patientBlood = patientBlood;
		this.patientHealth = patientHealth;

	}

	public String getPatientName() {
		return patientName;
	}

	public String getPatientID() {
		return patientID;
	}

	public int getBloodLevel() {
		return patientBlood;
	}

	public int getHealthLevel() {
		return patientHealth;
	}

	public static int getFinalBloodLevel() {
		return BLOOD_LEVEL;
	}

	public static int getFinalHealthLevel() {
		return HEALTH_LEVEL;
	}

	public void decreaseBloodLevelByTWO() {
		this.patientBlood -= 2;
	}

	public void decreaseBloodLevelByFive() {
		this.patientBlood -= 5;
	}

	public void deathByVampire() {
		this.patientBlood = 0;
		this.patientHealth = 0;

	}

	public void increaseHealthbyFive() {
		this.patientHealth += 5;
	}

	@Override
	public String toString() {
		return "|Patient: " + getPatientName() + ", > Patient ID: " + getPatientID() + ", > Blood Volume: " + getBloodLevel()
				+ ", > Overall Health: " + getHealthLevel() ;
		

	}

	public void healToFullHealth() {
		this.patientHealth = 10;

	}

	public void tick() {
		patientHealth -= 1;
		patientBlood += 2;
		return;
	}

}
