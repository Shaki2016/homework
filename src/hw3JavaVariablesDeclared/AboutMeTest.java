package hw3JavaVariablesDeclared;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe me = new AboutMe(); // Constructor initialized 
		// Variables initialization
		me.name = "Shaki";
		me.age = 25;
		me.gender = 'M';
		me.isStudent = true;
		me.experience = 5;
		me.Salary = 50000000;
		me.phoneNumber = 1234567890L;
		me.height = 5.9;
		// Method Initialized
		me.aboutMe();

		System.out.println("\n");
		AboutMe alex = new AboutMe(); 
		// Variables initialization
		alex.name = "Alex";
		alex.age = 24;
		alex.gender = 'M';
		alex.isStudent = false;
		alex.experience = 4;
		alex.Salary = 48000;
		alex.phoneNumber = 9876543210L;
		alex.height = 5.8;
		// Method Initialized
		alex.aboutMe();

	}

}
