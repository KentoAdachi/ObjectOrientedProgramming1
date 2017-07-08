package com.stack2;

class Cell{
    private Object element;
    private Cell next;
    Cell(Object element){
        this.element = element;
    }
    Object getElement(){
        return element;

    }
    Cell getNext(){
        return next;
    }
    void setElement(Object element){
        this.element = element;
    }
    void setNext(Cell next){
        this.next = next;
    }
    public String toString(){
        String s = (String)this.element;
        if (this.next == null){
            return s;
        }else {
            return (s + " <-- " + (this.next).toString());
        }
    }
}
