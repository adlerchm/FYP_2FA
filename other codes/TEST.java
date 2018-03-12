//
//test
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TEST {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//try
	    //{
	        //System.out.println("Loading driver...");
	        //Class.forName("com.mysql.jdbc.Driver");
	        //System.out.println("Driver loaded!");
	   // }
	    //catch(ClassNotFoundException e)
	    //{
	    //    throw new RuntimeException("Cannot find the driver in the classpath!", e);
	    //}

	    //-------------------------------------
	    //  Driver loaded, let's try establishing a connection.
		
		
	    //-------------------------------------
	    String url = "jdbc:mysql://go2factorauthentication.webstarterz.com:3306/cp976758_useraccount";
	    String username = "cp976758_hongwei";
	    String password = "hongwei1993";
	    Connection connection = null;
	    try
	    {
	        System.out.println("Connecting database...");
	        connection = DriverManager.getConnection(url, username, password);
	        System.out.println("Database connected!");
	    }
	    catch (SQLException e)
	    {
	        throw new RuntimeException("Cannot connect the database!", e);
	    } 
	    finally 
	    {
	        System.out.println("Closing the connection.");
	        if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
	    }
		
	}
}
