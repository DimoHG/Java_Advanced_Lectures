package com.softuni.customStack;

public class CustomStack {
    public static final int INITIAL_CAPACITY = 4;
    public static final int INITIAL_SIZE = 0;
    public static final int SHRINK_THRESHOLD = 4;

    private int[] data; // държи елементите в SmartArray
    private int size; // държи големината на SmartArray
    private int capacity;

    public CustomStack() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
        this.size = INITIAL_SIZE;
    }

    //push -> добавя елемент накрая
    public void push(int element) {
        this.ensureCapacity();
        this.data[this.size] = element;
        this.size++;
    }

    private void ensureCapacity() {
        if (this.size == this.capacity) {
            this.resize();
        }
    }

    private void resize() {
        this.capacity = this.capacity * 2;
        int temp[] = new int[capacity];

        for (int i = 0; i < this.size; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    //pop -> премахва и връща елемент от края
    public int pop() {
        this.ensureStackNotEmpty();
        this.size--;
        int itemToRemove = this.data[size];
        this.data[size] = 0;
        return itemToRemove;
    }

    //peek -> връща елемент от края
    public int peek() {
        return this.data[size - 1];
    }

    private void ensureStackNotEmpty(){
        if(this.size == 0){
            throw new IndexOutOfBoundsException("Our CustomStack is empty");
        }
    }

}
