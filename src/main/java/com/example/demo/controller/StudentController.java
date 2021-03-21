package com.example.demo.controller;

import com.example.demo.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private static final List<Student> STUDENTS = List.of(
            new Student(1L, "James Bond"),
            new Student(2L, "Maria Jones"),
            new Student(3L, "Anna Smith")
    );

    @GetMapping("/{studentId}")
    public Student getStudent( final @PathVariable("studentId") Long studentId ){

        return STUDENTS.stream()
                       .filter( e -> e.getStudentId().equals( studentId ) )
                       .findFirst()
                       .orElseThrow( () -> new RuntimeException( "Student with id " + studentId + " not found" ) );

    }

}
