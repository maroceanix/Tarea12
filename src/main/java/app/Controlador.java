package app;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.AlumnoGrupoDAO;
import pool.MyDataSource;
import vista.IVista;

public class Controlador {
	
	private IVista vista;
	private AlumnoGrupoDAO alu_gru;
	
	
	Controlador(IVista vista, AlumnoGrupoDAO al){
		this.vista=vista;
		this.alu_gru=al;
	}

	public static void main(String[] args) {
		
		/*try(Connection conn=MyDataSource.getConnection()){
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
	}*/
		

}
}
