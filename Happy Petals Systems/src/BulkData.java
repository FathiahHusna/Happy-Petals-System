/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class BulkData {
    
     public String name;
    public String price;
    
    //default constructor
    public BulkData(){
        name = "xxx";
        price = "xxx";
    }
    
     //normal constructor
    public BulkData(String name, String price){
        this.name = name;
        this.price = price;
    }
}
