/*
 講義名 : オブジェクト指向プログラミング1
 課題番号 : 20170529
 問題番号 : 問題4
 学籍番号 : BP16001
 氏名 : 足立賢人
 動作環境 : macOS(Sierra 10.12.4)
 */
class LineSegment{
  Point a;
  Point b;

  @Override
  public String toString(){
    return a+"->"+b;
  }

  LineSegment(Point a,Point b){
    this.a = a;
    this.b = b;
  }

  LineSegment linearTransfer(){
    LineSegment ret = new LineSegment(new Point(0,0),new Point(0,0));
    ret.a = this.a.linearTransfer();
    ret.b = this.b.linearTransfer();
    return ret;
  }
}
