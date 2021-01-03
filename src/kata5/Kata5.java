/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata5;
import java.sql.*;
/**
 * @author Antonio Miguel Martel
 */
public class Kata5 {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        
        /* Obtenemos una conneccion con la base de datos. En este caso como es
        de sqlite lo hacemos con la direccion. Si fuera oracle seria con el
        usuario y el puerto/ip de la base de datos...etc */
        Connection connection = DriverManager.getConnection("jdbc:sqlite:data/Base_datos.db");
        
        /*Creas un objeto Statement al que le entran sentencias de SQL como strings
        Y despues uno ResultSet para guardar las salidas de esas sentencias*/
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from people");
        
        //Y vamos llamando a las diferentes salidas de mis resultados.
        while(resultSet.next()){
            System.out.println(resultSet.getString("email"));
        }
        statement.close();
    }

}
