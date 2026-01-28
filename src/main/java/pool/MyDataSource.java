package pool;

import java.sql.Connection;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class MyDataSource {
	private static HikariConfig configuracion=new HikariConfig();
	private static HikariDataSource datasource;
	static {
		configuracion.setJdbcUrl("jdbc:mysql://localhost/alumno02?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false");
		configuracion.setUsername("mar");
		configuracion.setPassword("alumno");
		configuracion.addDataSourceProperty("maximumPoolSize", 1);
		configuracion.addDataSourceProperty("cachePrepStmts", "true");
		configuracion.addDataSourceProperty("prepStmtCacheSize", "250");
		configuracion.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
		
		datasource= new HikariDataSource(configuracion);
	}
	private MyDataSource() {}
	public static Connection getConnection() throws Exception{
		return datasource.getConnection();
	}
}
