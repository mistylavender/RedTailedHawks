package com.nighthawk.csa.model.SQL.Note;
import com.nighthawk.csa.model.SQL.Student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


//need to import JpaRepository
public interface NoteJpaRepository extends JpaRepository<Note, Long> {
    List<Note> findAllByStudent(Student s);
}