//Conexion con base de datos
package inversiones;

import java.sql.*;

public class dbconnection {
   static String bd = "escolapinversiones";
   static String login = "root";
   static String password = "";
   static String url = "jdbc:mysql://localhost/"+bd;

   Connection conn = null;
   //Constructor de conexion con la db
   public dbconnection() {
      try{
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(url,login,password);

         if (conn!=null){
            System.out.println("Conexión a "+bd+" correcta");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
	   public Connection getConnection(){
	      return conn;
	   }

	   public void closeconn(){
	      conn = null;
	   }
}

