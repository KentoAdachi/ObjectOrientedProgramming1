/**
2つの整数の最大公約数を求めます
@author 足立賢人
@version 1.0
*/
public class GCD{
  /**
  2つの整数の最大公約数を計算します
  @return int
  @param m 割られる数
  @param n 割る数
  */
  public static int calc(int m,int n){
    int r;
    while (true) {
      r = m/n;
      if (r == 0) {
        return n;
      }else{
        m = n;
        n = r;
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(calc(100,3));
  }
}
