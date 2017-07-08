package com.stack1;

public class Stack{
    int element[] = new int[10];
    int index;

    Stack(){
        index = 0;
    }

    void push(int data){
        element[index] = data;
        index ++;
    }

    int pop(){
        index --;
        return element[index];
    }
}
