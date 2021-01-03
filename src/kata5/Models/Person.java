/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata5.Models;

/**
 * @author Antonio Miguel Martel
 */
public class Person {
    
    private final String name;
    private String address, companyName;
    private final Mail mail;

    public Person(String name, String address, String mail, String companyName) {
        this.name = name;
        this.address = address;
        this.mail = new Mail(mail);
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Mail getMail() {
        return mail;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    
    
}
