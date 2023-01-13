package jdbc.dbConnection;


import java.sql.*;
import com.mysql.cj.jdbc.*;

public class App {
    public  App() {

        String url = "jdbc:mysql://localhost:3306/connect";
        String user = "root";
        String password = "mody";
        try {
            DriverManager.registerDriver(new  com.mysql.cj.jdbc.Driver());
            
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is Successful to the database" + url);

          
            connection.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new App();
        System.out.println("Mahmoud changed");
    }

}
