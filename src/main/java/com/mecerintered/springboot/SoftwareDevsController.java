package com.mecerintered.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-dev")
public class SoftwareDevsController {

    @GetMapping
    public List<SoftwareDevs> getSoftwareDevelopers(){
        return List.of(new SoftwareDevs(1, "Moe", "moe@gamil.com", List.of("Java", "Js", "Node")),
        new SoftwareDevs(2, "Motsei", "motsei@gmail.com",  List.of("Java", "Js", "Node")));
    }
}
