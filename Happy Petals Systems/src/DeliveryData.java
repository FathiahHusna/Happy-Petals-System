/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class DeliveryData {
    public String cust_name;
    public String cust_address;
    public String cust_postcode;
    public String cust_state;
    public String cust_phone;
    public String cust_email;
    public String r_name;
    public String r_address;
    public String r_postcode;
    public String r_state;
    
    //default constructor
    public DeliveryData()
    {
        cust_name = "xx";
        cust_address = "xx";
        cust_postcode = "xx";
        cust_state = "xx";
        cust_phone = "xx";
        cust_email = "xx";
        r_name= "xx";
        r_address= "xx";
        r_postcode= "xx";
        r_state= "xx";
    }
    
    //normal constructor
    public DeliveryData(String cust_name, String cust_address, String cust_postcode, String cust_state, String cust_phone, String cust_email, String r_name, String r_address, String r_postcode, String r_state)
    {
        this.cust_name = cust_name;
        this.cust_address = cust_address;
        this.cust_postcode = cust_postcode;
        this.cust_state = cust_state;
        this.cust_phone = cust_phone;
        this.cust_email = cust_email;
        this.r_name = r_name;
        this.r_address = r_address;
        this.r_postcode = r_postcode;
        this.r_state = r_state;
    }
}
