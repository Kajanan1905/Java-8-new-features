package lambdaexpressions;

//Functional Interface
interface Shape {
	void draw();
}

//Classes implements the Shape
class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle class : draw() method");

	}

}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square class : draw() method");

	}

}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle class : draw() method");

	}

}

public class LambdaExmaple {

	public static void main(String[] args) {
		// Lambda expression can be assigned to the value of reference variable
		Shape rectangle = () -> System.out.println("Rectangle class : draw() method");

		/*
		 * @Override public void draw() {
		 * System.out.println("Square class : draw() method");
		 * 
		 * }
		 */

		Shape square = () -> System.out.println("Square class : draw() method");
		Shape circle = () -> System.out.println("Circle class : draw() method");

		print(rectangle);
		print(square);
		print(circle);

		// OR

		// passing lambda expression as a method parameter
		print(() -> System.out.println("Rectangle class : draw() method"));
		print(() -> System.out.println("Square class : draw() method"));
		print(() -> System.out.println("circle class : draw() method"));

	}

	// pass a lambda expression as method parameter
	private static void print(Shape shape) {

		shape.draw();

	}

}
