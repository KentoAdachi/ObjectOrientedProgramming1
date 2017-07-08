/*
 オブジェクト指向プログラミング1
 課題番号 : 5
 問題番号 : 2
 学籍番号 : BP16001 
 氏名 : 足立賢人
 作成日 : 2017/07/09
 
 Cellクラスを使ったStackの作成
 */

package com.stack2;
class Main{
    public static void main(String[] args) {
        System.out.println("正しい実行例 : ");
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

        System.out.println("\n正しくない実行例");
        System.out.println("エラー内容 :");
        System.out.println("    Exception in thread \"main\" java.lang.NullPointerException");
        System.out.println("    at com.stack2.Stack.pop(Stack.java:15)");
        System.out.println("    at com.stack2.Main.main(Main.java:6)");
        System.out.println("状況 :");
        System.out.println("    スタックが空の時にpopを実行した時");
    }
}
