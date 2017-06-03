/*
 講義名 : オブジェクト指向プログラミング1
 課題番号 : 20170529
 問題番号 : 問題4
 学籍番号 : BP16001
 氏名 : 足立賢人
 動作環境 : macOS(Sierra 10.12.4)
 */
class Main{
  public static void main(String[] args) {
    Point A = new Point(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
    Point B = new Point(Double.parseDouble(args[2]),Double.parseDouble(args[3]));
    LineSegment line = new LineSegment(new Point(5,10),new Point(10,20));
    System.out.println("Input LineSegment : "+line);
    System.out.println("LineSegment after linearTransfer : "+line.linearTransfer());
  }
}
