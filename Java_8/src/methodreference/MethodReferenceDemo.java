package methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable {
	void print(String msg);
}

public class MethodReferenceDemo {

	public void display(String msg) {

		msg = msg.toUpperCase();
		System.out.println(msg);
	}

	public static int addition(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {
		// 1. Method reference to a static method
		Function<Integer, Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(4));

		// using method reference
		Function<Integer, Double> functionmethodRef = Math::sqrt;
		System.out.println(functionmethodRef.apply(9));

		// Lambda Expression
		BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> MethodReferenceDemo.addition(a, b);
		System.out.println(biFunction.apply(19, 22));

		// Using method reference
		BiFunction<Integer, Integer, Integer> biFunctionmethodRef = MethodReferenceDemo::addition;
		System.out.println(biFunctionmethodRef.apply(19, 05));

		// 2.1. Method reference to an instance method of an object
		MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();

		// LambdaExpression
		Printable printable = (msg) -> methodReferenceDemo.display(msg);
		printable.print("kajanan");

		// using method reference
		Printable printablemethodRef = methodReferenceDemo::display;
		printablemethodRef.print("kajanan_now");

		// 3.Reference to the instance of an arbitrary object
		Function<String, String> stringFunction = (input) -> input.toLowerCase();
		System.out.println(stringFunction.apply("KAJANAN"));

		// using method reference
		Function<String, String> stringFunctionMethodRef = String::toLowerCase;
		System.out.println(stringFunctionMethodRef.apply("KAJANAN_NOW"));

		// 3.1
		String[] strArray = { "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" };

		// Using Lambda
		Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));

		// Using method reference
		Arrays.sort(strArray, String::compareToIgnoreCase);

		// 4.reference to a constructor
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("watermelon");

		Function<List<String>, Set<String>> setFunction = (fruitList) -> new HashSet<>(fruitList);
		System.out.println(setFunction.apply(fruits));

		// Using method reference
		Function<List<String>, Set<String>> setFunctionMethodref = HashSet::new;
		System.out.println(setFunctionMethodref.apply(fruits));

	}

}
