package app;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import pool.MyDataSource;

public class App {

	public static void main(String[] args) {
		//menú->
		
		try(Connection conn=MyDataSource.getConnection()){
			DatabaseMetaData metadata=conn.getMetaData();
			String[] types= {"TABLES"};
			ResultSet tables = metadata.getTables(null, null, "%", types);
			while(tables.next()) {
				System.out.println(tables.getString("TABLE_NAME"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
