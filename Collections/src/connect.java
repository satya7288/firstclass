import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class connect  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id:");
		int id=sc.nextInt();
		System.out.println("Enter your Name:");
		String name=sc.next();
		System.out.println("Enter your email:");
		String email=sc.next();
		//database connection
		try {
		//step1: load the driver class
		Class.forName("com.mysql.jdbc.Driver");
		//step2: establish connection
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/aits", "root", "root");
		System.out.println(con);
		//step3:transporting methods with authentication
		java.sql.PreparedStatement pst= con.prepareStatement("insert into stdemo values(?,?,?)");
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, email);
		//step4:updating
		int i=pst.executeUpdate();
		System.out.println("sucess"+i);
		//step5:connection close
		pst.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
