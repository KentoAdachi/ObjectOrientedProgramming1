package problem2_err;
/**
	「犬」のクラス
<BR>つぎの属性をもつ。
	<UL>
	 <LI>名前
	 <LI>種類
	 <LI>年齢
	 <LI>姿勢
	</UL>
*/
public class Dog{
	String name;
	String classification;
	int age;
	String position;
	Dog (String n, String c, int a){
		name = n;
		classification = c;
		age = a;
		position = "立っている";
	}
	void sit(){
		System.out.println(this.name +",Sit!");
		this.position = "座っている";
	}
	void down(){
		System.out.println(this.name + ", Down!");
		this.position = "伏せている";
	}
	void showState(){
		System.out.println(this.name + "は" + this.position);
	}

}
