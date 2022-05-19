package com.nighthawk.csa.model.SQL;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/*
Extends the JpaRepository interface from Spring Data JPA.
-- Java Persistent API (JPA) - Hibernate: map, store, update and retrieve data
-- JpaRepository defines standard CRUD methods
-- Via JPA the developer can retrieve data from relational databases to Java objects and vice versa.
 */
public interface StudentJpaRepository extends JpaRepository<Student, Long> {
    List<Student> findAllByOrderByName();

    List<Student> findByNameContainingIgnoreCase(String firstname);


    @Query(
            value = "SELECT * FROM Student p WHERE p.firstname LIKE ?1",
            nativeQuery = true)
    List<Student> findByLikeTermNative (String term);
}