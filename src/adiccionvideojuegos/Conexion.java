
package adiccionvideojuegos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    static String URL ="jdbc:mysql://localhost:3306/adiccion";
    static String USUARIO = "root";
    static String CONTRASEÑA = "";
    Connection con;
    
    public Conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            System.out.println("Conexion establecida...");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("No se pudeo establecer la conexion: "+e);
        }    
    }
    public Connection getConnection(){
        return con;
    }
}

