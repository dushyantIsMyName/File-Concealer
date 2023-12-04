package dB;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    public static Connection connection = null;
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fileHider?useSSL=false", "root", "Dushyant@1170");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
    public static void closeConnection(){
        if(connection!=null){
            try {
                connection.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
