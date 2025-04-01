package uicontrols.practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;






public class Database_connection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host ="root@localhost";
		String port = "3306";
		//String databasename1="sakila";
		//Connection con =DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/sakila","root","Um@11Q22021");
		//Connection con =DriverManager.getConnection("jdbc:mysql://root@localhost:3306/sakila","root","Um@11Q22021");
		Connection con =DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/sakila","root","Um@11Q22021");
		
		//root username
		//Um@11Q22021 password
		//database name is sakila
		
	
	
		Statement st=con.createStatement();
		String s="update sakila.actor  set first_name = 'umas' where actor_id =1";
		//st.executeQuery(s);
		st.executeUpdate(s);
		
		
		ResultSet rs1=  st.executeQuery("select * from sakila.actor where actor_id =1;");
		//by default new value will be store in first index
		while(rs1.next())
		{
		System.out.println(rs1.getString("last_update"));
		
		}
		con.close();
		System.out.println("he");
	}

}
