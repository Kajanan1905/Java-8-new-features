package functionalinterface;

public interface MyFunctionalInterface {

	void print(String msg);

	default void m1() {
		System.out.println("");
	}

	static void m2() {
		System.out.println("");
	}

}
