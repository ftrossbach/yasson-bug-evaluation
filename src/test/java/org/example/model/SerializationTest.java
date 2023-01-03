package org.example.model;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;

public class SerializationTest {


	@Test
	void testSerialization(){
		Jsonb jsonb = JsonbBuilder.create();

		Container expected = new Container(List.of(new Containee("k", "v")));

		String expectedJson = jsonb.toJson(expected);
		System.out.println(expectedJson);

		assertEquals(expected, jsonb.fromJson(expectedJson, Container.class));

	}
}
