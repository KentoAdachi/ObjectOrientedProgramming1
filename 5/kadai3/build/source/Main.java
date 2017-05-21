/**
課題番号:問題3<br>
作成年月日:2017/05/21<br>
長方形を定義し、面積が同じものがあれば表示する
@author BP16001 足立賢人
@version 1.0(2017/05/21)
*/
class Main{
  /**
  rectangleインスタンス同士の面積を比較する
  @param a Rectangleクラスのインスタンス
  @param b Rectangleクラスのインスタンス
  @return true - 面積が等しいとき  false - 面積が等しく無いとき
  */
  static boolean cmpArea(Rectangle a,Rectangle b){

    a.getArea();
    b.getArea();
    return a.area == b.area;
  };
  /**
  長方形を定義し、面積が同じものがあれば表示する
  @param args コマンドライン引数
  */
  public static void main(String[] args) {
    Rectangle rect[] = {
      new Rectangle(10,3),
      new Rectangle(4,12),
      new Rectangle(15,6),
      new Rectangle(5,6),
      new Rectangle(6,8),
      new Rectangle(9,10),
    };
    for (int i = 0;i < rect.length;i ++) {
      for (int j = i+1;j < rect.length;j ++) {
        if (cmpArea(rect[i],rect[j])) {
          System.out.println("rect["+i+"]と"+"rect["+j+"]は同じ面積です");
        }
      }
    }
  }
}
