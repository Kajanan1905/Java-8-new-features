package lambdaexpressions;

interface Addable {
	int addition(int a, int b);
}

class AddableImpl implements Addable {

	@Override
	public int addition(int a, int b) {
		return (a + b);
	}

}

public class LambdaParameter {

	public static void main(String[] args) {

		Addable addable = (a, b) -> (a + b);
		int result = addable.addition(10, 20);

		System.out.println(result);

		// OR

		Addable multistatementAdd = (int a, int b) -> {
			int total = (a + b);
			return total;
		};

		System.out.println(multistatementAdd.addition(19, 22));

	}
}
