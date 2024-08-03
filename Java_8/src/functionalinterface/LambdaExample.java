package functionalinterface;

interface Shape {
	void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("rectangle draw method");

	}

}

public class LambdaExample {

	public static void main(String[] args) {

		Shape rectangle = () -> System.out.println("rectangle draw method");
		rectangle.draw();

	}

}
