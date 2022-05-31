package com.nighthawk.csa.model.SQL.Note;
import java.util.List;

import com.nighthawk.csa.model.SQL.Student.Student;
import org.springframework.data.jpa.repository.JpaRepository;


//need to import JpaRepository
public interface NoteJpaRepository extends JpaRepository<Note, Long> {
    List<Note> findAllByStudent(Student s);
}