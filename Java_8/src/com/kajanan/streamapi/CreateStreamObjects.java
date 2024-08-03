package com.kajanan.streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {

	public static void main(String[] args) {

		// Create a Stream
		Stream<String> stream = Stream.of("A", "B", "C");
		stream.forEach(System.out::println);

		// Create stream from sources
		Collection<String> collection = Arrays.asList("Java", "J2EE", "Spring", "Hibernate");
		Stream<String> collectionStream = collection.stream();
		collectionStream.forEach(System.out::println);

		List<String> list = Arrays.asList("Java", "J2EE", "Spring", "Hibernate", "Spring");
		Stream<String> listStream = list.stream();
		listStream.forEach(System.out::println);

		Set<String> set = new HashSet<>(list);
		Stream<String> setStream = set.stream();
		setStream.forEach(System.out::println);

		String[] strArray = { "Kajanan", "Methu" };
		Stream<String> strArrayStream = Arrays.stream(strArray);
		strArrayStream.forEach(System.out::println);
	}

}
