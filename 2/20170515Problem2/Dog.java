package problem2_err;
/**
	�u���v�̃N���X
<BR>���̑��������B
	<UL>
	 <LI>���O
	 <LI>���
	 <LI>�N��
	 <LI>�p��
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
		position = "�����Ă���";
	}
	void sit(){
		System.out.println(this.name + ", Sit!);
		this.position = "�����Ă���";
	}
	void down(){
		System.out.println(this.name + ", Down!");
		this.position = "�����Ă���";
	}
	void showState(){
		System.out.println(this.name + "��" + this.position);
	}

}

