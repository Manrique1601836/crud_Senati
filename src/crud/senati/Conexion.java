
package crud.senati;

import java.sql.*;

public class Conexion {
    public Connection conectar(){
    String url = "jdbc:mysql://localhost:3306/senati?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String user = "root";
    String password = "";
    Connection cn = null;
    
    try{
        cn = DriverManager.getConnection(url, user, password);
        if (cn != null){
            System.out.println("Conectado");
        }
    } catch(SQLException e){
        System.out.println(e);
    }
    return cn;
    }
    
}
