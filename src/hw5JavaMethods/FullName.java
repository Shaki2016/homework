package hw5JavaMethods;

public class FullName {

	public String fullName(String fName, String lName) {
		String fullName = fName + " " + lName;
		System.out.println("Family Member: " + fullName);
		return fullName;
	}

	// Main method
	public static void main(String[] args) {
		FullName fn = new FullName();

		fn.fullName("Mohammed", "Islam");
		fn.fullName("Seikh", "Hasina");
		fn.fullName("Khaleda", "Zia");
		fn.fullName("Mohammed", "Yunus");
	}
}
