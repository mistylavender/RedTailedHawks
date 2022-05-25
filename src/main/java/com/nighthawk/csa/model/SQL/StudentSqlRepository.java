package com.nighthawk.csa.model.SQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
This class has an instance of Java Persistence API (JPA)
-- @Autowired annotation. Allows Spring to resolve and inject collaborating beans into our bean.
-- Spring Data JPA will generate a proxy instance
-- Below are some CRUD methods that we can use with our database
*/
@Service
@Transactional
public class StudentSqlRepository {

    @Autowired
    private StudentJpaRepository jpa;



    public  List<Student>listAll() {
        return jpa.findAll();
    }

    public void save(Student person) {
        jpa.save(person);
    }

    public Student get(long id) {
        return jpa.findById(id).get();
    }

    public void delete(long id) {
        jpa.deleteById(id);
    }
}