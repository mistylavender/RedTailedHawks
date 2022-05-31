package com.nighthawk.csa.consoleUI;
import java.util.List;


public class NoteJPARepo {
}



//need to import JpaRepository
public interface NoteJpaRepository extends JpaRepository<Note, Long> {
    List<Note> findAllByPerson(Person p);
}