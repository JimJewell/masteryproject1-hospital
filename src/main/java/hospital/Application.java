package hospital;

import java.util.Scanner;

import medicalemployees.Doctor;
import medicalemployees.Nurse;
import medicalemployees.Surgeon;
import nonmedicalemployee.Janitor;
import nonmedicalemployee.Receptionist;
import nonmedicalemployee.VampireJanitor;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//    create hospital object
		Hospital highStMercy = new Hospital(100);

//    create staff
		Doctor d1 = new Doctor("Dr. Buzzsaw", "10", "Orthopedic", "MD");
		Doctor d2 = new Doctor("Dr. Suess", "11", "Rhyme", "Doctor");
		Doctor d3 = new Doctor("Dr. Evil", "1mil", "Laser", "Doctor");
		Doctor d4 = new Doctor("Dr. Doom", "666", "Destruction", "Doctor");
		Doctor d5 = new Doctor("Dr. House", "8", "Sobriety", "Doctor");
		Surgeon s1 = new Surgeon("Dr. McCoy", "47", "Bone", "Surgeon", false);
		Surgeon s2 = new Surgeon("Dr. Jekyl", "222", "Psyciatric", "Surgeon", false);
		Surgeon s3 = new Surgeon("Dr. Heart", "4", "Cardiac", "Surgeon", false);
		Nurse n1 = new Nurse("Nurse Betty", "000", "Registered Nurse");
		Nurse n2 = new Nurse("Nurse Danielle", "67", "Registered Nurse");
		Nurse n3 = new Nurse("Nurse Abbey", "918", "Registered Nurse");
		Janitor j1 = new Janitor("Groundskeeper Willie", "45", "Janitor", false);
		VampireJanitor v1 = new VampireJanitor("Vampire Count", "3", "Night Custodian", false);
		Receptionist r1 = new Receptionist("Operator", "9", "Unit Clerk", false);
		Receptionist r2 = new Receptionist("Volunteer", "0", "Greeter", false);

//		add staff
		highStMercy.addEmployee(d1);
		highStMercy.addEmployee(d2);
		highStMercy.addEmployee(d3);
		highStMercy.addEmployee(d4);
		highStMercy.addEmployee(d5);
		highStMercy.addEmployee(s1);
		highStMercy.addEmployee(s2);
		highStMercy.addEmployee(s3);
		highStMercy.addEmployee(n1);
		highStMercy.addEmployee(n2);
		highStMercy.addEmployee(n3);
		highStMercy.addEmployee(j1);
		highStMercy.addEmployee(v1);
		highStMercy.addEmployee(r1);
		highStMercy.addEmployee(r2);

//		create patients
		Patient p1 = new Patient("John Doe", "001", 10, 5);
		Patient p2 = new Patient("Jane Smith", "002", 15, 8);
		Patient p3 = new Patient("Gene Adkins", "003", 5, 2);
		Patient p4 = new Patient("Eli Bum", "004", 18, 3);
		Patient p5 = new Patient("Who Cares", "005", 20, 10);

//		add patients
		highStMercy.addPatient(p1);
		highStMercy.addPatient(p2);
		highStMercy.addPatient(p3);
		highStMercy.addPatient(p4);
		highStMercy.addPatient(p5);

//		Welcome 
//		System.out.println("...................................................................................................................." );
		System.out.println("Welcome to High Street Mercy Hospital");
		System.out.println("Our mission is to provide the best patient care that you can afford!");
		System.out.println(
				"....................................................................................................................");

		boolean MainMenu = true;

		while (MainMenu) {

			System.out.println("Please Choose A Numerical Option From The Hospital Database");

			System.out.println("1. Review Employee Records ");
			System.out.println("2. Review Hospital Patient Census");
			System.out.println("3. Provide Care for a Patient");
			System.out.println("4. Provide Care for All Patients");
			System.out.println("5. Instruct Custodial Services to Clean Hospital");
			System.out.println("6. Process Patient Admission");   // For Future release date.
			System.out.println("7. Place a Hospital Employee on Leave of Absence");

			String mainMenuSelection = input.nextLine();

			switch (mainMenuSelection) {

			case "1":
				highStMercy.returnAllEmployees();

				break;

			case "2":
				highStMercy.returnAllPatients();

				break;

			case "4":
				highStMercy.healAllPatients();
				System.out.println("High St Mercy's Patients Thank You!");
				highStMercy.returnAllPatients();
				System.out.println("You are a natural born healer!");
				break;

			case "5":
				j1.toggleSweeping();
				j1.sweep(highStMercy);
				highStMercy.getCleanliness();
				System.out.println(j1.getName() + " is cleaning " + j1.getIsSweeping());
				System.out.println("Hospital cleanliness: " + highStMercy.getCleanliness() + "%");
				break;

			case "3":

				boolean individualCareMenu = true;
				while (individualCareMenu) {
					System.out.println("Who would you like to care for?");
					highStMercy.getPatientNames();

					String patientSelected = input.nextLine();
					Patient patientChoice = highStMercy.getPatient(patientSelected);
					System.out.println(
							patientChoice.getPatientID() + " is ready to receive care.  What care will you perform?");

					System.out.println("1. Provide Care for " + patientChoice.getPatientName());
					System.out.println("2. Take a blood sample from " + patientChoice.getPatientName());
					System.out.println("You can return to the main menu at any time by typing \"Exit\"");

					String individualCareMenuSelection = input.nextLine().toLowerCase();

					switch (individualCareMenuSelection) {

					case "1":
						patientChoice.healToFullHealth();
						System.out.println(patientChoice.getPatientName() + "thanks you for your care.");
						System.out.println(patientChoice.getHealthLevel());
						break;
					case "2":
						patientChoice.decreaseBloodLevelByFive();
						System.out.println(patientChoice.getPatientName()
								+ "says, how much blood did you take? I'm going to pass out.");
						System.out.println(patientChoice.getBloodLevel());
						break;
					case "exit":
						individualCareMenu = false;
						System.out.println("Thank goodness you are no longer trying to care for individual patients!");
						break;

					}
				}
			}

//		Surgeon jerry = new Surgeon("Jerry", "888", "Plastic", "Surgeon", false);
//		Nurse n1 = new Nurse("Sunshine", "444" , "RN");
//	
//		
//		Patient bob = new Patient("Bob", "002", 20, 10);
//		
//		jerry.toggleSurgery();
//		System.out.println(jerry.getName() + " is performing surgery? " + jerry.getPerformingSurgery());
//		jerry.repairPatient(bob);
//		System.out.println(bob.getPatientName() + " is recovering from surgery ");

		}

	}
}