import java.util.ArrayList;

public class demo {
	void read() {
		System.out.println("All are reading");
	}
	void eat() {
		System.out.println("Some of them Are eating their lunch");
	}
	void Sleep() {
		System.out.println("some of them are sleeping in the class");
	}
	public static void main(String[] args) {
		//class_name obj_name =new class_name
		demo dd=new demo();
		//object_name.method_name
		dd.Sleep();
		dd.read();
		dd.eat();
	}
}
