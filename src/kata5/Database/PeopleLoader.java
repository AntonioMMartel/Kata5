/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata5.Database;

import java.util.List;
import kata5.Models.Person;

/**
 * @author Antonio Miguel Martel
 */
public interface PeopleLoader {
    
    List<Person> load();
    
}
