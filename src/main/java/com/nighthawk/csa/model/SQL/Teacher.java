package com.nighthawk.csa.model.SQL;

// https://projectlombok.org/features/all

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

/*
Family Information Class
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
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
    @Size(min=1,max=30)
    private String accountName;

    @NonNull
    @Size(min=1,max=30)
    private String classesTeaching;

    /* Initializer used when setting data from an API */
    public Teacher(String firstname, String lastname, String accountName, String classesTeaching) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.accountName = accountName;
        this.classesTeaching = classesTeaching;
    }
}
