class Main{
	public static void main(String[] args){
		Rectangle r1 = new Rectangle();
		System.out.println("r1"+r1);
		Rectangle r2 = new Rectangle(12,15);
		System.out.println("r2"+r2);
		Rectangle r3 = new Rectangle(30,40);
		System.out.println("r3"+r3);
		System.out.println("r3はr1と面積が等しいか? = " + r3.hasSameArea(r1));
		r3.setSize(25,8);
		r1=null;
		System.out.println("r3"+r3);
		System.out.println("r3はr1と面積が等しいか? = " + r3.hasSameArea(r1));
	}

}
