/*
 講義名 : オブジェクト指向プログラミング1
 課題番号 : 20170612
 問題番号 : 問題3
 学籍番号 : BP16001
 氏名 : 足立賢人
 動作環境 : macOS(Sierra 10.12.4)
 */
class DottedLineSegment extends LineSegment{
  double interval;
  DottedLineSegment(double x1, double y1, double x2, double y2){
    super(x1,y1,x2,y2);
    this.interval = 0;
  }

  DottedLineSegment(double x1, double y1, double x2, double y2, double interval){
    super(x1,y1,x2,y2);
    this.interval = interval;
  }
  DottedLineSegment(Point a,Point b,double interval){
    super(a,b);
    this.interval = interval;
  }

  String makeForm(){
    String ret = new String();

    for (int i = 0;i < this.length();i++ ) {
      ret += "-";
      for (int j = 0;j < this.interval;j++ ) {
        ret += " ";
      }
    }

    return ret;
  }

  @Override
  DottedLineSegment linearTransfer(){
    DottedLineSegment ret = new DottedLineSegment(0,0,0,0);
    ret.a = this.a.linearTransfer();
    ret.b = this.b.linearTransfer();
    ret.interval = this.interval;
    return ret;
  }

  @Override
  public String toString(){
    return  this.a + this.makeForm() + this.b;
  }
}
