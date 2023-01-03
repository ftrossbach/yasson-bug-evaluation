package org.example.model;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;

import jakarta.json.bind.annotation.JsonbTypeDeserializer;
import jakarta.json.bind.annotation.JsonbTypeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor(access = PACKAGE)
@NoArgsConstructor(force = true, access = PRIVATE)
@JsonbTypeDeserializer(ContaineeDeserializer.class)
@JsonbTypeSerializer(ContaineeSerializer.class)
public class Containee {
	@NonNull String key;
	@NonNull String value;
}
