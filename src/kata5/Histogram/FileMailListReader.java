/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata5.Histogram;

import kata5.Models.Mail;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Antonio Miguel Martel
 * Lee de un fichero los emails que tengan sentido.
 */
public class FileMailListReader {
    
    public static List<Mail> read(String filename){
        List<Mail> lista = new ArrayList<>();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
            
            while(true) {
                String line = reader.readLine();
                if(line == null) break;
                if(Mail.isMail(line)){
                    lista.add(new Mail(line));
                }
                
            }
        } catch (FileNotFoundException exception) {
            System.out.println("No se ha encontrado el archivo. File not found exception" +
                                exception.getMessage());
        } catch (IOException exception) {
            System.out.println("Error de entrada salida. IO exception" +
                                exception.getMessage());
            
        }
        
        
        
        return lista;
    }
    
}
