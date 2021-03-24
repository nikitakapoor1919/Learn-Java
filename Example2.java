package Introduction;

interface Interface2 {
	// static method
	static void staticMethod() {
		System.out.println("I'm Static Method of Interface2.");
	}

}

public class Example2 implements Interface2 {

	public static void main(String[] args) {

		// Call static method of MyInterface
		MyInterface.staticMethod();

		staticMethod();

	}

	static void staticMethod() {
		System.out.println("I'm Static Method of Example2.");
	}
}
