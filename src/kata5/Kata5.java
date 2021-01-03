/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata5;
import java.util.ArrayList;
import java.util.List;
import kata5.Database.*;
import kata5.Histogram.*;
import kata5.Models.*;
/**
 * @author Antonio Miguel Martel
 */
public class Kata5 {


    public static void main(String[] args) {
        //Input
        PeopleLoader sqliteDatabaseLoader = new SqlitePersonLoader();
        List<Mail> mails = new ArrayList<>();
        List<Person> people = sqliteDatabaseLoader.load();
        
        for (Person person : people) {
            
            mails.add(person.getMail());
        }
        
        
        Histogram histograma = MailHistogramBuilder.build(mails);
        HistogramDisplay histogramDisplay = new HistogramDisplay(histograma);
        histogramDisplay.setCotaBaja(2);
        histogramDisplay.execute();
    }

}
