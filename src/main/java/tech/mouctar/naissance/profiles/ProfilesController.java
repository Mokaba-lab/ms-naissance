package tech.mouctar.naissance.profiles;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("profiles")
public class ProfilesController {

    Logger log = LoggerFactory.getLogger(ProfilesController.class);

    @PostMapping
    public void create(Profiles compte) {
        log.info("Create profile: " + compte.getFirstName() + " " + compte.getLastName());
        log.trace("Create profile: " + compte.getEmail());
        log.warn("Create profile: " + compte.getEmail());

    }
}
