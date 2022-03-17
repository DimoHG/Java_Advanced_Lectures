package com.softuni;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private String name;

    public static void main(String[] args) {
        Class clazz = Example.class;
        Method[] methods = clazz.getDeclaredMethods();

        for(Method method : methods){
            Author annotation = method.getAnnotation(Author.class);
            if(annotation != null){

                System.out.println(method.getName() + " " + annotation.name());
            }
        }
    }


}
