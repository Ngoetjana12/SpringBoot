package com.mecerintered.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {


    @GetMapping
    public List<Student> getallStudents(){
        return List.of(
                new Student(1, "Motsei", "Sefanyetso", "motsei@gmail.com", "Java"),
                new Student(1, "Thabi", "Smith", "thabio@gmail.com", "Java"),
                new Student(1, "Hishaam", "Kraft", "hishaam@gmail.com", "Java")
                );
    }

}
