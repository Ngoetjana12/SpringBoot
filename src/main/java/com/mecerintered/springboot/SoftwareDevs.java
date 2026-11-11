package com.mecerintered.springboot;

import java.util.List;

public class SoftwareDevs {

    private int id;
    private String name;
    private String email;
    private List<String> techStack;

    public SoftwareDevs() {
    }

    public SoftwareDevs(int id, String name, String email, List<String> techStack) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.techStack = techStack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getTechStack() {
        return techStack;
    }

    public void setListof(List<String> techStack) {
        this.techStack = techStack;
    }
}
