package ar.edu.utn.frba.dds.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;

@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

  @Override
  public Date convertToDatabaseColumn(LocalDate date_to_persist) {
    return date_to_persist == null? null: Date.valueOf(date_to_persist);
  }

  @Override
  public LocalDate convertToEntityAttribute(Date date) {
    return date == null? null : date.toLocalDate();
  }
}
