package Introduction;

interface MyInterface {
	// static method
	static void staticMethod() {
		System.out.println("I'm Static Method of MyInterface.");
	}

	// Public and abstract method of Interface
	void nonStaticMethod();
}

public class Example1 implements MyInterface {

	public static void main(String[] args) {

		// Call static method of MyInterface
		MyInterface.staticMethod();

		Example1 object = new Example1();
		object.nonStaticMethod();

	}

	@Override
	public void nonStaticMethod() {
		System.out.println("I'm Non Static Method of MyInterface.");
	}
}
