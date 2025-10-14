package tech.mouctar.naissance.profiles;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.mouctar.naissance.shared.services.ValisationsService;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Slf4j
@Service
public class ProfilesService {
    private final ProfilesRepository profilesRepository;
    private final ValisationsService valisationsService;


    public void createProfile(Profiles profile) {
        log.info("Création du nouveau compte {} ", profile.getEmail());
        this.valisationsService.validateEmail(profile.getEmail());
        this.valisationsService.validatePhone(profile.getPhone());
        this.profilesRepository.save(profile);
    }
    public List<Profiles> search() {
        return profilesRepository.findAll();
    }

    public Profiles readProfile(int id) {
      Optional<Profiles> profilesOptional = this.profilesRepository.findById(id);
      return profilesOptional.orElseThrow(
              () -> new EntityNotFoundException("Aucune entity ne correspond aux paramètres fournis"));
    }

    public Profiles updateProfile(int id, Profiles compte) {
        Profiles profileInDataBase = this.readProfile(id);
        profileInDataBase.setFirstName(compte.getFirstName());
        profileInDataBase.setLastName(compte.getLastName());
        profileInDataBase.setEmail(compte.getEmail());
        profileInDataBase.setPhone(compte.getPhone());
        return profilesRepository.save(profileInDataBase);
    }
    public void deleteProfile(int id) {
        Profiles profileInDataBase = this.readProfile(id);
        this.profilesRepository.delete(profileInDataBase);
    }
}
