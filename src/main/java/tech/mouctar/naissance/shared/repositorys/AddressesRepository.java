package tech.mouctar.naissance.shared.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.mouctar.naissance.shared.entities.Addresses;

public interface AddressesRepository extends JpaRepository<Addresses, Integer> {
}
