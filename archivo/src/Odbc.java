
import java.sql.*;

/**
 * Created by Christhoval on 6/5/14.
 */
public class Odbc {
    public static void main(String []args){

        String URL = "jdbc:odbc:utp",
                username = "",
                password = "",
                nombre, apellido, sql;

        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement stmt = con.createStatement();

            sql = "select * from Clientes";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                nombre = rs.getString("Nombre");
                apellido = rs.getString("Apellido");

                System.out.println(nombre + "  " + apellido);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
