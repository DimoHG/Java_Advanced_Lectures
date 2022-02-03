package com.softuni.customStack;

public class Main {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack();
        for (int i = 0; i < 6; i++) {
            customStack.push(i);
        }

        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
    }
}
