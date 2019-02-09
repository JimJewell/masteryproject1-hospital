package hospital;

public class Patient {

	private static final int BLOOD_LEVEL = 20;
	private static final int HEALTH_LEVEL = 10;
	private String name;
	private String id;

//	Patient Constructor
	public Patient(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public static int getBloodLevel() {
		return BLOOD_LEVEL;
	}

	public static int getHealthLevel() {
		return HEALTH_LEVEL;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

}
