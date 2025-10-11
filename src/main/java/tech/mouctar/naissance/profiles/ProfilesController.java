package tech.mouctar.naissance.profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("profiles")
public class ProfilesController {
    Logger logger = LoggerFactory.getLogger(ProfilesController.class);
    private final ProfilesService profilesService;
    public ProfilesController(ProfilesService profilesService) {
        this.profilesService = profilesService;
    }
    @PostMapping
    public void create(@RequestBody Profiles compte) {
        logger.info("Création du compte " + compte.getEmail());
        profilesService.createProfile(compte);
    }
}
