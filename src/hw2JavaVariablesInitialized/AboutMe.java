package hw2JavaVariablesInitialized;

public class AboutMe {
	// Declaring and initializing variables
	String myName = "Mohammed Shaki Islam"; // String variable declared and initialized
	String myAddress = "13714 Beth Dr , Warren MI USA 48088 ";
	int myAge = 44; // int variable declared and initialized
	float myHeight = 5.11f; // float variable declared and initialized
	int myWeight = 179; // int variable declared and initialized
	char myGender = 'M'; // char variable declared and initialized
	boolean fullTimeStudent = false; // boolean variable declared and initialized

	// Constructor declared and initialized
	public AboutMe() {
		System.out.println(": ------------ This is all about Myself ------------:");
	}

	public static void main(String[] args) {
		// Instantiating the AboutMe class
		AboutMe aboutMeObject = new AboutMe(); // Object instantiated and constructor called
		System.out.println(" Name: " + aboutMeObject.myName);
		System.out.println(" Address: " + aboutMeObject.myAddress);
		System.out.println(" Age: " + aboutMeObject.myAge);
		System.out.println(" My Height: " + aboutMeObject.myHeight);
		System.out.println(" My Gender: " + aboutMeObject.myGender);
		System.out.println(" My weight is: " + aboutMeObject.myWeight + " lb");
		System.out.println(" Full Time Student : " + aboutMeObject.fullTimeStudent);

	}

}
