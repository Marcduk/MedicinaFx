
package fuentes;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;

public class Conexion {
    
    private Connection conexion;
    private Statement st;
    
    public Conexion() {
        try{
      
     Class.forName("org.postgresql.Driver");
     conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PEDIDOS","postgres","123");
     st = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
     System.out.println("CONEXIÓN ESTABLECIDA");
  }

catch(Exception ex) 
  {
      Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
      System.out.println("Error de conexión"+ex.getMessage());
  }  
    }
    
    public ResultSet CONSULTAR(String sql) throws SQLException{
    
    return st.executeQuery(sql);
    }
    
    public int GUARDAR(String sql) throws SQLException{
    
    return st.executeUpdate(sql);
    }
    
    public void CERRAR(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
   


