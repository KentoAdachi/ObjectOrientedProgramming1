package com.stack1;

 class Stack{
    private int element[] = new int[10];
    private int index;

    Stack(){
        index = 0;
    }

    protected void push(int data){
        element[index] = data;
        index ++;
    }

    protected int pop(){
        index --;
        return element[index];
    }
}
