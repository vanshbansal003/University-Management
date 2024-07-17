package University.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection conn ;
    Statement statement;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///universitymanagement", "root","123456");
            statement = conn.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
