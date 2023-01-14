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
<<<<<<< HEAD
        System.out.println("Mahmoud Adam changed");
	int z = 10;
	System.out.println(z);
=======
<<<<<<< HEAD
<<<<<<< HEAD
        System.out.println("Mahmoud changed");
=======
>>>>>>> 6a21d1b0cf7ef64b8c78072c4c2c2dbb80a5fdbf
=======
        System.out.println("Mahmoud changed and Eslam");
        int x;
        x=6;
        System.out.println("x= "+x);

>>>>>>> 54504206fa9d8118b6d18948be6df346493283ab
>>>>>>> 967d496104c07977a70918b6b1b892ddf2063fe5
    }

}
