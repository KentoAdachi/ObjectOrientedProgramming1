package problem2_err;

public class dogTest{
	public static void main(String[] args){
		Dog myDog = new Dog("Hana", "Labrador Retriever", 5);
		myDog.showState();
		myDog.sit();
		myDog.showState();
		myDog.down();	
		myDog.showState();
		Dog cousinDog = new Dog("Jones", "Scotch Terrier", 3);
		cousinDog.showState();
		cousinDog.sit();
		cousinDog.showState();
		cousinDog.down();
		cousinDog.showState();
	}
}

