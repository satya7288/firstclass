import java.sql.*;

public class connect {
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aits", "root", "root");
        System.out.println(con);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
