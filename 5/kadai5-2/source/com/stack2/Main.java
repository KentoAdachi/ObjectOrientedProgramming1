package com.stack2;
class Main{
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("stack : " + stack.getHead());
        stack.push("one");
        System.out.println("stack : " + stack.getHead());
        stack.push("two");
        System.out.println("stack : " + stack.getHead());
        stack.push("three");
        System.out.println("stack : " + stack.getHead());
        System.out.println("pop : "+stack.pop());
        System.out.println("stack : " + stack.getHead());
        System.out.println("pop : "+stack.pop());
        System.out.println("stack : " + stack.getHead());
        System.out.println("pop : "+stack.pop());
        System.out.println("stack : " + stack.getHead());
    }
}
