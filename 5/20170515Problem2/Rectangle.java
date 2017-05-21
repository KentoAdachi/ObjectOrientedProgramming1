package problem2_err;
public class Rectangle{
	int width;
	int height;
	void setSize(int w, int h){
		this.width = w;
		this.height = h;
	}
	int getArea(){
		return this.width * thid.height;
	}
	public static void main(String[] args){
		//Rectangle r = new Rectangle();
		int a;
		r.setSize(3,4);
		System.out.println("幅 = " + r.width);
		System.out.println("高さ = " + r.height);
		a = r.getArea();
		System.out.println("この長方形の面積は " + a +"です。");

	}
}
