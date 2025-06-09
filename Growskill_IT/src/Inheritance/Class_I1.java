package Inheritance;
class Extend{
	void display() {
		System.out.println("Hello");
	}
}
class Extend2 extends Extend {
	void test() {
		System.out.println("Abhi");
	}
}

public class Class_I1 {
	


	public static void main(String[] args) {
		
		Extend2 obj = new Extend2();
		obj.display();
		obj.test();

	}

	}
