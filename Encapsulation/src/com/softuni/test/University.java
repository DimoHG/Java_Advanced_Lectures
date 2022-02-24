package com.softuni.test;

import sortByNameAndAge.Person;

import java.util.Collections;
import java.util.List;

public class University {
    private String name;
    private List<Person> students;

    public University(String name, List<Person> students){
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public List<Person> getStudents() {
        return Collections.unmodifiableList(students);
    }
}
