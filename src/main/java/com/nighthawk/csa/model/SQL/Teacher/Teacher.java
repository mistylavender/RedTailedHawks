package com.nighthawk.csa.model.SQL.Teacher;

import com.nighthawk.csa.model.SQL.Role.Role;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.*;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    @Size(min = 2, max = 30, message = "Name (2 to 30 chars)")
    private String firstname;

    @NonNull
    @Size(min = 2, max = 30, message = "Name (2 to 30 chars)")
    private String lastname;

    @NonNull
    @Size(min = 2, max = 30, message = "Name (2 to 30 chars)")
    private String accountName;

    @NonNull
    @Size(min = 2, max = 30, message = "Name (2 to 30 chars)")
    private String classesTaught;

    @OneToMany(fetch = EAGER)
    private Collection<Role> roles = new ArrayList<>();

    public Teacher(String firstname, String lastname, String accountName, String classesTaught, Role role) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.accountName = accountName;
        this.classesTaught = classesTaught;
        this.roles.add(role);
    }

}
