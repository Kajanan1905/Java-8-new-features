package functionalinterface;

import java.util.function.Function;

/*class FunctionImpl implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		return t.length();
	}

}*/

public class FunctionDemo {

	public static void main(String[] args) {

		/*
		 * FunctionImpl functionImpl = new FunctionImpl();
		 * System.out.println(functionImpl.apply("Kajanan"));
		 */

		Function<String, Integer> function = (String t) -> t.length();
		function.apply("Kajanan");

	}

}
