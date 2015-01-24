package net.duguying.common;

/**
 * Created by rex on 2015/1/23.
 */
public class SqlHelper {
    public SqlHelper() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            System.out.println("Class com.mysql.jdbc.Driver dose not exist!");
        }

    }


}
