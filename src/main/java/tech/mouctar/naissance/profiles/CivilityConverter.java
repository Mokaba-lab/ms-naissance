package tech.mouctar.naissance.profiles;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class CivilityConverter implements AttributeConverter<Civility, String> {

    @Override
    public String convertToDatabaseColumn(Civility civility) {
        if (civility == null) {
            return null;
        }
        return civility.getLabel(); // 👉 enregistre "Monsieur" dans la base
    }

    @Override
    public Civility convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }

        // On retrouve l'enum correspondant à la description
        for (Civility c : Civility.values()) {
            if (c.getLabel().equalsIgnoreCase(dbData)) {
                return c;
            }
        }
        throw new IllegalArgumentException("Civility inconnue en base : " + dbData);
    }
}
