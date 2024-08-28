package hw3JavaVariablesDeclared;

public class AboutMe {
	// Variables declared
	String name; // Name variable (String type)
	int age; // Age variable (int type)
	char gender; // Gender variable (char type)
	boolean isStudent; // isStudent variable (boolean type)
	byte experience; // Experience variable (byte type)
	int Salary; // Salary variable (short type)
	long phoneNumber; // PhoneNumber variable (long type)
	double height; // Height variable (double type)

	// Constructor declared
	public AboutMe() {
		System.out.println(": ------------ This is all about Myself ------------:");

	}

	// method implemented
	public void aboutMe() {

		System.out.print("Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nStudent: " + isStudent
				+ "\nExperience: " + experience + "\nSalary: " + Salary + "\nPhone Number: " + phoneNumber
				+ "\nHeight: " + height);
	}

}
