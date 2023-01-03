package org.example.model;

import jakarta.json.bind.serializer.JsonbSerializer;
import jakarta.json.bind.serializer.SerializationContext;
import jakarta.json.stream.JsonGenerator;

public class ContaineeSerializer implements JsonbSerializer<Containee> {
	@Override public void serialize(Containee obj, JsonGenerator generator, SerializationContext ctx) {
		generator.writeStartObject();
		generator.write("key", obj.key);
		generator.write("value", obj.value);
		generator.writeEnd();
	}
}
