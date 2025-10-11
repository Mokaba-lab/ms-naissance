package tech.mouctar.naissance.profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProfilesService {
    Logger log = LoggerFactory.getLogger(ProfilesService.class);
    private final ProfilesRepository profilesRepository;
    public ProfilesService(ProfilesRepository profilesRepository) {
        this.profilesRepository = profilesRepository;
    }
    public void createProfile(Profiles profile) {
        log.info("Création du nouveau compte {} ", profile.getEmail());
        profilesRepository.save(profile);
    }
}
