package tech.mouctar.naissance.profiles;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.mouctar.naissance.shared.entities.Addresses;
import tech.mouctar.naissance.shared.entities.Cityhalls;
import tech.mouctar.naissance.shared.entities.Companies;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "profiles")
public class Profiles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Convert(converter = CivilityConverter.class)
    private Civility civility;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH})
    private Addresses addresses;

    @ManyToOne()
    private Cityhalls cityhalls;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH})
    private Companies companies;
}