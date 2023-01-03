package org.example.model;

import java.lang.reflect.Type;

import jakarta.json.bind.serializer.DeserializationContext;
import jakarta.json.bind.serializer.JsonbDeserializer;
import jakarta.json.stream.JsonParser;

public class ContaineeDeserializer implements JsonbDeserializer<Containee> {
	@Override
	public Containee deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
		String key = null;
		String value = "";
		while (parser.hasNext()) {
			var event = parser.next();
			if (event == JsonParser.Event.KEY_NAME && parser.getString().equals("key")) {
				parser.next(); // move to VALUE
				key = parser.getString();
			} else if (event == JsonParser.Event.KEY_NAME && parser.getString().equals("value")) {
				parser.next(); // move to VALUE
				value = parser.getString();
			}
		}
		assert key != null;
		return new Containee(key, value);
	}
}
