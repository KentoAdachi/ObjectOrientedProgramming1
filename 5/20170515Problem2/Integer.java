package problem2_err;

/* 1から100までの和を求める：整数オブジェクトが自分自身に100までの整数を足しこむことで和の計算を行う */
class Integer{
	int value;
	Integer(int value){
		this.value = value;
	}
    	void sum(int e){
		for (int i = this.value + 1; i <=e; i++){
			this.value = this.value + i;
	  	}
	}
	public static void main(String[] args){
		Integer one = new Integer(1);
		one.sum(100);
		System.out.println("1から100までの和 = " + value);
//System.out.println("1から100までの和 = " + one.value);
	}
}
