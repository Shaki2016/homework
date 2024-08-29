package hw5JavaMethods;

public class MyFamily {
	// Initialize some int type variables
	public int child1Age = 10;
	public int child2Age = 9;
	public int child3Age = 11;
	public int child4Age = 2;

	// Implement a return type method
	public int myFamily() {
		int sum = child1Age + child2Age + child3Age + child4Age;
		System.out.println("The sum of my childrens age is: " + sum);
		return sum;

	}

	// Main method
	public static void main(String[] args) {

		MyFamily family = new MyFamily();
		family.myFamily();
	}

}
