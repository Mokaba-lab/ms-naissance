package tech.mouctar.naissance.shared.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import tech.mouctar.naissance.shared.entities.Addresses;
import tech.mouctar.naissance.shared.repositorys.AddressesRepository;

@AllArgsConstructor
@Component
public class AddressesService {

    private final AddressesRepository addressesRepository;

    public Addresses createAddresses(Addresses addresse) {
        if (addresse == null) {
            throw new IllegalArgumentException("Adresse ne peut pas être nulle lors de la création.");
        }
        return addressesRepository.save(addresse);
    }

}
