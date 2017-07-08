package com.stack2;
class Stack{
    private Cell head;
    Cell getHead(){
        return head;
    }
    void push(String data){
        Cell p = new Cell(data);
        p.setNext(head);
        head = p;
        System.out.println("push : "+ data);
    }
    Object pop(){
        Cell ret = head;
        head = head.getNext();
        return ret.getElement();
    }
}
