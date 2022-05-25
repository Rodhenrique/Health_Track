package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
  private static ConnectionManager instance;
	  
  public static ConnectionManager getInstance(){
    if (instance == null){
      instance = new ConnectionManager();
    }
    return instance;
  }
		  
  public Connection getConnection(){
	 Connection con = null;
	 try{
		 Class.forName("Oracle.jdbc.driver.OracleDriver");
		 con = DriverManager.getConnection("","","");
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 
	 return con;
  }		  
}
