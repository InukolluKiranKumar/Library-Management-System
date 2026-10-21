package library;

import java.sql.Connection;
//import java.sql.SQLException;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		
		try(Connection con = DBConnection.getConnection()){
			System.out.println("Connected!");
		}
		catch(Error e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
