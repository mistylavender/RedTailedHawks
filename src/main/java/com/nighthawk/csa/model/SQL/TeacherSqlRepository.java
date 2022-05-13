package com.nighthawk.csa.model.SQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
This class has an instance of Java Persistence API (JPA)
-- @Autowired annotation. Allows Spring to resolve and inject collaborating beans into our bean.
-- Spring Data JPA will generate a proxy instance
-- Below are the CRUD methods that we can use with our database
*/
@Service
@Transactional
public class TeacherSqlRepository {

    @Autowired
    private TeacherJpaRepository jpa;

    public List<Teacher> listAll() {
        return jpa.findAll();
    }

    public void save(Teacher teacher) {
        jpa.save(teacher);
    }

    public Teacher get(long id) {
        return jpa.findById(id).get();
    }

    public void delete(long id) {
        jpa.deleteById(id);
    }
}