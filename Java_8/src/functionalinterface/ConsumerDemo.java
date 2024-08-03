package functionalinterface;

import java.util.function.Consumer;

/*class ConsumerImpl implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}*/

public class ConsumerDemo {

	public static void main(String[] args) {
		/*
		 * ConsumerImpl consumerImpl = new ConsumerImpl();
		 * consumerImpl.accept("Kajanan");
		 */

		Consumer<String> consumer = (t) -> System.out.println(t);
		consumer.accept("Kajanan");
	}

}
