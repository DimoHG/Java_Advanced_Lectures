package com.softuni;

public class Animal {
   protected int age;
   protected String name;

   protected Animal(){
      this.age = 0;
      this.name = "";
   }

   protected void speak(){
      System.out.println("nomnom");
   }

   protected void printSomething(){
      System.out.println("Hello from animal");
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
