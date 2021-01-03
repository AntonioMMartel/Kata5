/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata5.Models;

/**
 * @author Antonio Miguel Martel
 * 
 * Modelo de un Mail.
 */
public class Mail {
    
    String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getDomain() {
        return this.mail.substring(this.mail.indexOf("@") + 1);
    }
    
    public static boolean isMail(String entrada) {
        return entrada.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");                    
    }
}
