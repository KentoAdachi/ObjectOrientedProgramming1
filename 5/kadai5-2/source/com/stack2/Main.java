package com.stack2;
class Main{
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("stack : " + stack.head);
        stack.push("one");
        System.out.println("stack : " + stack.head);
        stack.push("two");
        System.out.println("stack : " + stack.head);
        stack.push("three");
        System.out.println("stack : " + stack.head);
        System.out.println("pop : "+stack.pop());
        System.out.println("stack : " + stack.head);
        System.out.println("pop : "+stack.pop());
        System.out.println("stack : " + stack.head);
        System.out.println("pop : "+stack.pop());
        System.out.println("stack : " + stack.head);
    }
}
