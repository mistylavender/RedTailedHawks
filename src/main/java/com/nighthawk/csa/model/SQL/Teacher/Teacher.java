package com.nighthawk.csa.model.SQL.Teacher;

import com.nighthawk.csa.model.SQL.Role.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.FetchType.EAGER;

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
