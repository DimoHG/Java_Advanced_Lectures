package com.softuni.test;

import com.softuni.Dog;
import com.softuni.test.PackagePrivateExample;
import sortByNameAndAge.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Pesho", "Peshov", 100, 1000);
        Person person2 = new Person("Ivan", "Ivanov", 100, 1000);
        Person person3 = new Person("Georgi", "Georgiev", 100, 1000);
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        personList.add(person3);

        University university = new University("TU Sofia", personList);
        university.getStudents().remove(2);

        System.out.println();


    }

}
