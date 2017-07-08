package com.stack1;

public class Main{
    public static void main(String[] args) {
        System.out.println("正しい実行例");

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("pop :"+ stack.pop());
        System.out.println("pop :"+ stack.pop());
        System.out.println("pop :"+ stack.pop());

        System.out.println("\n正しくない実行例");
        //エラー実行例
        System.out.println("エラー内容 :");
        System.out.println("    Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: -1");
        System.out.println("    at com.stack1.Stack.pop(Stack.java:18)");
	    System.out.println("    at com.stack1.Main.main(Main.java:6)");
        System.out.println("状況 :");
        System.out.println("    スタックが空の時にpopを実行した時");
    }
}
