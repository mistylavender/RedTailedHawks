package com.nighthawk.csa.model;

import com.nighthawk.csa.model.SQL.Student;
import com.nighthawk.csa.model.SQL.StudentSqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class StudentViewController {

    @Autowired
    private StudentSqlRepository repository;

    @GetMapping("/database/student")
    public String student(Model model) {
        List<Student> studentList = repository.listAll();
        model.addAttribute("studentList", studentList);
        return "database/student";
    }

    @GetMapping("/database/studentcreate")
    public String studentAdd(Student student) {
        return "database/studentcreate";
    }

    @PostMapping("/database/studentcreate")
    public String studentSave(@Valid Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "database/studentcreate";
        }
        repository.save(student);

    }
}
