/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcimprove;
import java.sql.*;
/**
 *
 * @author Zahangir Alam
 */
public class JdbcExample implements DriverAction{

    @Override
    public void deregister() {
        System.out.println("Driver deregistered");
    }
    
    public static void main(String[] args) {
        try {
            Driver d = new com.mysql.jdbc.Driver();
            DriverAction action = new JdbcExample();
            DriverManager.registerDriver(d, action);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java8", "root", "1234Zah");
            PreparedStatement ps = connection.prepareStatement("insert into user(name, age) values(?,?)");
            ps.setString(1, "Morshed");
            ps.setInt(2, 18);
            int rs = ps.executeUpdate();
            if(rs>0){
                System.out.println("Data Inserted");
            }else{
                System.out.println("Data not inserted");
            }
            ps = connection.prepareStatement("select * from user");
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) +"  "+ resultSet.getString(2) + "  " + resultSet.getInt("age"));
                
            }
            
            connection.close();
            DriverManager.deregisterDriver(d);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
