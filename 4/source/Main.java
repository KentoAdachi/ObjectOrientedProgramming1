/*
 講義名 : オブジェクト指向プログラミング1
 課題番号 : 20170612
 問題番号 : 問題3
 学籍番号 : BP16001
 氏名 : 足立賢人
 動作環境 : macOS(Sierra 10.12.4)
 */
class Main{
  public static void main(String[] args) {
    DottedLineSegment a = new DottedLineSegment(10,10,20,20,1);
    System.out.println(a);
    System.out.println(a.linearTransfer());
  }
}
