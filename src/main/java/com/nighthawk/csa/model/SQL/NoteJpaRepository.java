package com.nighthawk.csa.model.SQL;
package com.nighthawk.csa.mvc.database.note;

import com.nighthawk.csa.mvc.database.student.Student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteJpaRepository extends JpaRepository<Note, Long> {
    List<Note> findAllByStudent(Student s);
}


