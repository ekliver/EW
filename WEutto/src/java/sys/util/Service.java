package sys.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Service {

    private static Connection conexion = null;

    public static Connection getConexion() throws Exception {

        String url = "jdbc:odbc:access";
        String usuario = "";
        String pwd = "";

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
        conexion = DriverManager.getConnection(url, usuario, pwd);

        return conexion;
    } //getConexion


} //Service
