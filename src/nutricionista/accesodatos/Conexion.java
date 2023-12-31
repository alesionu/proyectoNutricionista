
package nutricionista.accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    private static final String URL= "jdbc:mariadb://localhost:3306/";
    private static final String BD= "nutricionista";
    private static final String USUARIO= "root";
    private static final String PASS= "";
    private static Connection connection;

    public Conexion() {
    }
    
    public static Connection getConexion(){
    
        if (connection == null ){
            
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + BD, USUARIO, PASS);
                
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectar el Driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectar con la Base de Datos");
            }
        }
        
        return connection;
}
    
}
