/*
 講義名 : オブジェクト指向プログラミング1
 課題番号 : 20170529
 問題番号 : 問題4
 学籍番号 : BP16001
 氏名 : 足立賢人
 動作環境 : macOS(Sierra 10.12.4)
 */
class Point{
  double x,y;

  Point(double argx,double argy){
    x = argx;
    y = argy;
  }

  @Override
  public String toString(){
    return "("+x+","+y+")";
  }

  Point linearTransfer(){
    Point ret = new Point(0,0);
    ret.x = 6*this.x + 4*this.y;
    ret.y = -2*this.x + this.y;

    return ret;
  }
}
