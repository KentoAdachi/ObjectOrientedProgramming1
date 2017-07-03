class Point{
  private double x;
  private double y;
  public Point (){
    this.x = 0.0;
    this.y = 0.0;
  }
  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }
  public Point linearTransfer(){
    double x0 = 6*this.x + 4* this.y;
    double y0 = (-2) * this.x + 1* this.y;
    return new Point(x0,y0);
  }
  public String toString(){
    return ("(" + this.x + ", " + this.y + ")");
  }
}
