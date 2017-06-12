class RectangleCore{

  public static void main(String[] args) {
    Rectangle rects[] = new Rectangle[5];
    rects[0] = new Rectangle(2,4);
    rects[1] = new Rectangle(6,10);
    rects[2] = new Rectangle(8,8);
    rects[3] = new Rectangle(12,5);
    rects[4] = new Rectangle(4,16);
    for (int i = 0; i < 5; i++) {
      System.out.println("幅 = "+rects[i].width+ " 高さ = "+rects[i].height + " 面積 = " + rects[i].getArea());  
    }


  }
}
