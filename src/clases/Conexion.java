package clases;

import java.sql.*;
public class Conexion {
   // Conexion Local
    
    public static Connection conectar(){
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_productos", "root","");
            return cn;
        }catch(SQLException e){
            System.out.print("Error en la conexion Local"+ e);
        }
        return (null);
    } 
}