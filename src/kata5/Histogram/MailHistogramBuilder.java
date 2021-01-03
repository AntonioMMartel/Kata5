/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata5.Histogram;

import java.util.List;
import kata5.Models.Mail;
import kata5.Models.Histogram;
import java.util.Map;

/**
 * @author Antonio Miguel Martel
 */
public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> listaEmails) {
        Histogram<String> histogram = new Histogram<>();
        for (Mail email : listaEmails) {
            histogram.increment(email.getDomain());
        }

        return histogram;
    }

    
}
