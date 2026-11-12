package com.mecerintered.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>();

    @GetMapping("api/v1/students")
    public List<Student> getallStudents() {

        Student student = new Student(1, "Motsei", "Sefanyetso", "motsei@gmail.com", "Java");
        Student student2 = new Student(1, "Thabi", "Smith", "thabio@gmail.com", "Java");
        Student student3 = new Student(1, "Hishaam", "Kraft", "hishaam@gmail.com", "Java");

        students.add(student);
        students.add(student2);
        students.add(student3);

        return students;

    }

    @GetMapping("/api/v1/students/1")
    public Student getStudentId(@PathVariable int studId) {

        for (Student student : getallStudents()) {

            studId = student.id();
            if (student.id() == studId) {
                return student;
            }
        }
        return null;
    }

}
