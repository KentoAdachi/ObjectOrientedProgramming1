class Rectangle{
	int width;
	int height;
//Rectangle(int w, int h){
	 Rectangle(){
	 	this.width = 10;
	 	this.height = 20;
	 }


	Rectangle(int w, int h){
		this.width = w;
		this.height = h;
	}

	int getArea(){
		return this.width * this.height;
	}

	void setSize(int w, int h){
		this.width = w;
		this.height = h;
	}

	// boolean hasSameArea (Rectangle r1,Rectangle r2){
	// 	return (r1.getArea() == r2.getArea());
	// }
		String hasSameArea(Rectangle other){
			if (other == null) return "false";
			else return String.valueOf(this.getArea() == other.getArea());
		}


	public String toString(){
		//return ("長方形は、幅 = " +  thid.width + "、"
		return ("長方形は、幅 = " +  this.width + "、"
			+ "高さ = " + this.height + "、"
			+ "面積 = " + this.getArea() + "です。");
	}

}
