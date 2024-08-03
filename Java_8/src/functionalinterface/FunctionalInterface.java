package functionalinterface;

import java.io.PrintWriter;

public interface FunctionalInterface {

	public void execute();// exactly one abstract method
	

	public default void print(String tex) {
		System.out.println(tex);
	}

	public static void print(PrintWriter writer, String text) {

		writer.write(text);

	}

}
