import java.sql.Date;
import java.util.Random;

public class javautil {

	public static void main(String[] args) {
		//for date 
		java.util.Date d=new java.util.Date();
		System.out.println(d);
		//random number generation
		Random r=new Random();
		int i=r.nextInt(10000);
		System.out.println(i);
	}
}
