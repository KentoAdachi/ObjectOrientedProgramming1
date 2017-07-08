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
    // DottedLineSegment a = new DottedLineSegment(10,10,20,20,1);
    // System.out.println(a);
    // System.out.println(a.linearTransfer());
    Input in = new Input();
    double x1 = in.inputDouble("input x1 : ");
    double y1 = in.inputDouble("input y1 : ");
    double x2 = in.inputDouble("input x2 : ");
    double y2 = in.inputDouble("input y2 : ");
    double interval = in.inputDouble("input interval : ");
    DottedLineSegment a = new DottedLineSegment(x1,y1,x2,y2,interval);
    System.out.print("Input LineSegment : ");
    System.out.println(a);
    System.out.print("LineSegment after linearTransfer : ");
    System.out.println(a.linearTransfer());
  }
}
