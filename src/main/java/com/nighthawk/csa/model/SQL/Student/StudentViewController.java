package com.nighthawk.csa.model.SQL.Student;

import com.nighthawk.csa.ModelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

// Built using article: https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html
// or similar: https://asbnotebook.com/2020/04/11/spring-boot-thymeleaf-form-validation-example/
@Controller
public class StudentViewController {
    // Autowired enables Control to connect HTML and POJO Object to database easily for CRUD
    @Autowired
    private ModelRepository repository;

    @GetMapping("/sql/student")
    public String student(Model model) {
        List<Student> list = repository.listAll();
        model.addAttribute("list", list);
        return "sql/student";
    }

    /*  The HTML template Forms and PersonForm attributes are bound
        @return - template for person form
        @param - Person Class
    */
    @GetMapping("sql/studentcreate")
    public String studentAdd(Student person) {
        return "sql/studentcreate";
    }

    /* Gathers the attributes filled out in the form, tests for and retrieves validation error
    @param - Person object with @Valid
    @param - BindingResult object
     */
    @PostMapping("sql/studentcreate")
    public String personSave(@Valid Student student, BindingResult bindingResult) {
        // Validation of Decorated PersonForm attributes
        if (bindingResult.hasErrors()) {
            return "sql/studentcreate";
        }
        repository.save(student);
        repository.addRoleToPerson(student.getEmail(), "ROLE_STUDENT");
        // Redirect to next step
        return "redirect:/sql/studentcreate";
    }

    @GetMapping("/sql/studentupdate/{id}")
    public String personUpdate(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", repository.get(id));
        return "sql/studentupdate";
    }

    @PostMapping("/sql/studentupdate")
    public String personUpdateSave(@Valid Student student, BindingResult bindingResult) {
        // Validation of Decorated PersonForm attributes
        if (bindingResult.hasErrors()) {
            return "sql/studentupdate";
        }
        repository.save(student);
        repository.addRoleToPerson(student.getEmail(), "ROLE_STUDENT");

        // Redirect to next step
        return "redirect:/sql/studentcreate";
    }

    @GetMapping("/sql/studentdelete/{id}")
    public String personDelete(@PathVariable("id") long id) {
        repository.delete(id);
        return "redirect:/sql/student";
    }

    @GetMapping("/sql/student/search")
    public String student() {
        return "sql/student_search";
    }

}