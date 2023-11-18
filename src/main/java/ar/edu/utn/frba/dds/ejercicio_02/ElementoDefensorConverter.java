package ar.edu.utn.frba.dds.ejercicio_02;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ElementoDefensorConverter implements AttributeConverter<ElementoDefensor, String> {

	public String convertToDatabaseColumn(ElementoDefensor elementoDefensor) {
		return elementoDefensor.getClass().getSimpleName();
	}

	public ElementoDefensor convertToEntityAttribute(String dbData) {
		switch (dbData) {
		case "Arco":
			return new Arco();
		case "Escudo":
			return new Escudo();
		case "Espada":
			return new Espada();
		default:
			throw new IllegalArgumentException("Unknown" + dbData);
		}
	}
}
