package pre.pro;

import java.sql.*;

public class App {
    public static String url = "jdbc:mysql://localhost:3306/school";
    public static String user = "root";
    public static String password = "mody";

    public static void readAllUser() {

        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is Successful to the database" + url);
            String query = "select * from students";
            PreparedStatement statement = connection.prepareStatement(query);
            
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("StudentId");
                String fname = rs.getString("FirstName");
                String lname = rs.getString("LastName");
                String s_age = rs.getString("Age");

                System.out.println(id + fname + lname + s_age);

            }
            connection.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void insertUser() {
        try {
            // DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is Successful to the database" + url);
            String query = "insert into students (StudentId,FirstName,LastName,Age)values (?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, "111");
            ps.setString(2, "mohamed");
            ps.setString(3, "elgazzar");
            ps.setString(4, "17");
            ps.executeUpdate();

            connection.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void updateUser() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is Successful to the database" + url);

            String query="update students set FirstName=?, LastName=? ,Age=? where StudentId=?";
            PreparedStatement ps =connection.prepareStatement(query);
            ps.setString(1, "mhmd");
            ps.setString(2, "GAZZAR");
            ps.setString(3, "25");
            ps.setInt(4, 111);
            ps.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
public static void deleteUser(){
    try {
        // DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("Connection is Successful to the database" + url);

        String query="delete from students where StudentId=?";
        PreparedStatement ps =connection.prepareStatement(query);
        ps.setInt(1, 111);
        ps.executeUpdate();
        connection.close();

    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
    public static void main(String args[]) {
        // insertUser();
        // readAllUser();
        // updateUser();
        // readAllUser();
        deleteUser();
        readAllUser();

    }

}
