/*
 講義名 : オブジェクト指向プログラミング1
 課題番号 : 20170612
 問題番号 : 問題3
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
  LineSegment(double x1,double y1,double x2,double y2){
    this.a = new Point(x1,y1);
    this.b = new Point(x2,y2);
  }

  double length(){
    double ret;
    ret = (b.getx()-a.getx())*(b.getx()-a.getx()) + (b.gety()-a.gety())*(b.gety()-a.gety());
    ret = Math.sqrt(ret);

    return ret;
  }

  LineSegment linearTransfer(){
    LineSegment ret = new LineSegment(new Point(0,0),new Point(0,0));
    ret.a = this.a.linearTransfer();
    ret.b = this.b.linearTransfer();
    return ret;
  }
}
