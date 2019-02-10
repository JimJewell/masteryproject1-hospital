package medicalemployeetest;

import org.junit.Before;

import medicalemployees.Nurse;

public class NurseTest {

	
	
	
	Nurse underTest;
	@Before
	public void setup() {
		underTest = new Nurse("Danielle", "6774");
	}
	

}
