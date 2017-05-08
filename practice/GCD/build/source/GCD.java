/**
2つの整数の最大公約数を求めます
@author 足立賢人
@version 1.0
*/
public class GCD{
  /**
  2つの整数の最大公約数を計算します
  @return int
  @param m 大きな数
  @param n 小さな数
  */
  public static int calc(int m,int n){
    int r = 0;
    while (true) {
      r = m / n; //8 = 10 - 2: 2 = 10 - 8
      if (r == 0) {
        return n;
      }else{
        if (m > n) {
          m = n;
          n = r;
        }else{
          m = r;//10
          n = n;
        }
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(calc(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
  }
}
