/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class FruitBasketData {
     public String name;
    public String price;
    
    //default constructor
    public FruitBasketData(){
        name = "xxx";
        price = "xxx";
    }
    
     //normal constructor
    public FruitBasketData(String name, String price){
        this.name = name;
        this.price = price;
    }
    
}
