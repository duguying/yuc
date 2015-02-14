package net.duguying.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by rex on 2015/1/23.
 */
public class SqlHelper {
    public SqlHelper() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class com.mysql.jdbc.Driver dose not exist!");
            return;
        }

        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            if (conn!=null){
                System.out.println("Connect Mysql Success!");
            }else{
                System.out.println("Connect Mysql Failed!");
                return;
            }
        } catch (SQLException ex) {
            System.out.println("Connect Mysql Failed!");
            return;
        }


    }


}
