package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 */
public final class App {

    //private static final String Sonu = null;

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//registering driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tesst1", "root", "root");
            //connecton to jdbc
            String Query = "insert into table1 values(?,?,?,?,?,?,?)"; //query as string
            PreparedStatement ps = con.prepareStatement(Query); //storing query or prepering query in prepered statement
            ps.setString(1, "Sonu");
            ps.setInt(2, 50);
            ps.setInt(3, 5000);
            ps.setString(4, "ITIT");
            ps.setString(5, "Austrelia");
            ps.setInt(6, 20);
            ps.setInt(7, 24);
            boolean rs = ps.execute(); //executing query and storing it into result set
            if(rs){
                System.out.println("query executed succesfully");
            }
            else{
                System.out.println("An error occured");
            }
            
           /* System.out.println("Names :-");
            while(rs.next()) {
                System.out.println(rs.getString("name"));}*/
            
            con.close();
        } catch(SQLException | ClassNotFoundException se) {
            System.out.println(se.getMessage());
    }
}}
