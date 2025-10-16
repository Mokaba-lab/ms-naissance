package tech.mouctar.naissance.shared.services;

import org.springframework.stereotype.Component;

@Component
public class ValisationsService {

    public void validateEmail(String email) {
        if (email == null) {
            throw new RuntimeException("Le Email est obligatoire");
        }
        if (!email.contains("@") || email.indexOf("@") == email.length() - 1) {
            throw new RuntimeException("Le Email est invalide");
        }
    }
    public void validatePhone(String phone) {
        if (phone == null) {
            throw new RuntimeException("Le Phone est obligatoire");
        }
        if (phone.length() != 15) {
            throw new RuntimeException("Le Phone est invalide");
        }
    }
}
