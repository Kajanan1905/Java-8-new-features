package com.kajanan.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		String email = null;

		// of, empty, ofNullable
		Optional<Object> emptyOptional = Optional.empty();

		if (emptyOptional.isPresent()) {
			System.out.println(emptyOptional.get());
		} else {
			System.out.println("No value present");
		}

		/*
		 * Optional<Object> emaiOptional = Optional.of(email);
		 * System.out.println(emaiOptional);
		 */
		// of -> internally provide null check

		Optional<String> stringOptional = Optional.ofNullable(email);
		String defaultOptional = stringOptional.orElse("default@gmail.com");
		System.out.println(defaultOptional);

		String defaultOptional2 = stringOptional.orElseGet(() -> "default@gmail.com");
		System.out.println(defaultOptional2);

		String defaultOptional3 = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email is not exist"));
		System.out.println(defaultOptional3);

		if (stringOptional.isPresent()) {
			System.out.println(stringOptional.get());
		} else {
			System.out.println("No value present");
		}

	}

}
