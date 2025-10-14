package tech.mouctar.naissance.profiles;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("profiles")
public class ProfilesController {
    private final ProfilesService profilesService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void create(@RequestBody Profiles compte) {
        log.info("Création du compte " + compte.getEmail());
        profilesService.createProfile(compte);
    }
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Profiles> search() {
        return this.profilesService.search();
    }
    @GetMapping("/{id}")
    public Profiles read(@PathVariable int id) {
        return this.profilesService.readProfile(id);
    }
    @PutMapping("{id}")
    public Profiles update(@PathVariable int id, @RequestBody Profiles compte) {
        return this.profilesService.updateProfile(id, compte);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        this.profilesService.deleteProfile(id);
    }
}
