/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata5.Database;

import static java.lang.System.exit;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import kata5.Models.Person;

/**
 * @author Antonio Miguel Martel
 */
public class SqlitePersonLoader implements PeopleLoader {
    
    @Override
    public List<Person> load() {
        //SELECT COUNT(*) FROM PEOPLE where city="Hamilton";
        List<Person> people = new ArrayList<>();
        //cargamos la base de datos con su driver y 
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:data/Base_datos.db");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from people");
            
            //Obtenemos los datos que queremos
            while(resultSet.next()){
                people.add(new Person(resultSet.getString("first_name") + " " + resultSet.getString("last_name") ,
                        resultSet.getString("address"),
                        resultSet.getString("email"),
                        resultSet.getString("company_name")));
            }
            statement.close();

        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("No se ha podido cargar el driver: \"org.sqlite.JDBC\". ");
            System.out.println("Interrumpiendo ejecucion..");
            exit(0);
        } catch (SQLException sQLException) {
            System.out.println("Ha habido un problema extrayendo datos de la base de datos.");
            System.out.println("Interrumpiendo ejecucion..");
            exit(0);
        }
        return people;
    }

}