/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Kevin
 */
public class Person {
    private String firstName;
    private String lastName;
    private String Street;
    private int StreetNo;
    private String ZIP;
    private String City;

    public Person(String firstName, String lastName, String Street, int StreetNo, String ZIP, String City) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Street = Street;
        this.StreetNo = StreetNo;
        this.ZIP = ZIP;
        this.City = City;
    }
    
    
    
}
