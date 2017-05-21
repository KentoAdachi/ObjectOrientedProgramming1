/**
長方形
@version 1.0
@author 足立賢人
*/
class Rectangle{
  int width;
  int height;
  int area;
  /**
  コンストラクタ
  @param w 幅
  @param h 高さ
  */
  Rectangle(int w,int h){
    //メンバとローカル変数の名前が被らなければthisを省略してコードを短くできる
    width =w;
    height=h;
  }
  /**
  面積を求めてメンバ変数areaに格納
  */
  void getArea(){
    area = width * height;
  }
}
