package com.stack1;

 class Stack{
    private int element[] = new int[10];
    private int index;

    Stack(){
        index = 0;
    }

    void push(int data){
        element[index] = data;
        System.out.println("push : "+data);
        index ++;
    }

    int pop(){
        index --;
        return element[index];
    }


}
