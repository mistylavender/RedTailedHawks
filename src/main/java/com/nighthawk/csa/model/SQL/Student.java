package com.nighthawk.csa.model.SQL;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/*
Person is a POJO, Plain Old Java Object.
First set of annotations add functionality to POJO
--- @Setter @Getter @ToString @NoArgsConstructor @RequiredArgsConstructor
The last annotation connect to database
--- @Entity
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
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

    @NonNull
    @Size(min=1,max=30)
    private String description;

    @NonNull
    @Size(min=1,max=30)
    private String artPieceTitle;

    /* Initializer used when setting data from an API */
    public Student(String firstname, String lastname, String className, Integer periodNumber, String description, String artPieceTitle) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.className = className;
        this.periodNumber = periodNumber;
        this.description = description;
        this.artPieceTitle = artPieceTitle;
    }


}