package com.nighthawk.csa.model.SQL;

import lombok.*;
import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;

/*
Person is a POJO, Plain Old Java Object.
First set of annotations add functionality to POJO
--- @Setter @Getter @ToString @NoArgsConstructor @RequiredArgsConstructor
The last annotation connect to database
--- @Entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    @Size(min=1,max=30)
    private String firstname;

    @NonNull
    @Size(min=1, max=30)
    private String lastname;

    @NonNull
    @Size(min=1,max=30)
    private String className;

    @NonNull
    @Size(min=1, max=30)
    private Integer periodNumber;

    @ManyToMany(fetch = EAGER)
    private Collection<ArtPieces> artpieces = new ArrayList<>();





    /* Initializer used when setting data from an API */
    public Student(String firstname, String lastname, String className, Integer periodNumber, ArtPieces artpieces) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.className = className;
        this.periodNumber = periodNumber;
        this.artpieces.add(artpieces);
    }


}