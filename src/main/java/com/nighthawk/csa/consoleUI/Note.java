package com.nighthawk.csa.consoleUI;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Person student;

    @NotNull
    @Column(columnDefinition="TEXT")
    private String text;
}