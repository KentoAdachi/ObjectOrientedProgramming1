/**
課題番号:問題3<br>
作成年月日:2017/05/21<br>
長方形の定義
@version 1.0(2017/05/21)
@author BP16001 足立賢人
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
