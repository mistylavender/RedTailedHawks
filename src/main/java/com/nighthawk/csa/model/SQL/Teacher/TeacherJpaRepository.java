//package com.nighthawk.csa.model.SQL.Teacher;
//
//import com.nighthawk.csa.model.SQL.Student.Student;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;
//public interface TeacherJpaRepository extends JpaRepository<Teacher, Long>{
//        Student findByEmail(String email);
//
//        List<Teacher> findAllByOrderByNameAsc();
//
//        // JPA query, findBy does JPA magic with "Name", "Containing", "Or", "Email", "IgnoreCase"
//        List<Teacher> findByNameContainingIgnoreCaseOrEmailContainingIgnoreCase(String name, String email);
//    /* Custom JPA query articles, there are articles that show custom SQL as well
//       https://springframework.guru/spring-data-jpa-query/
//       https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
//     */
//
//// Custom JPA query
//@Query(
//        value = "SELECT * FROM Person p WHERE p.name LIKE ?1 or p.email LIKE ?1",
//        nativeQuery = true)
//    List<Student> findByLikeTermNative(String term);
//    /*
//        https://www.baeldung.com/spring-data-jpa-query
//     */
//        }
//
//        }
