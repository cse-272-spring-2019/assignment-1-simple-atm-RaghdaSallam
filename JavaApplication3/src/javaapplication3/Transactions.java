/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Raghda
 */
public class Transactions { 
                    
    private  String type;
    private double amount;
    
   
    public Transactions(String type, double amount) {
        this.type = type;
        this.amount = amount;
     }
     public void SetType(String type){
     this.type=type;
     }
      public void SetAmount(double amount){
     this.amount=amount;
     }

        public String getType() {
        return type;
     }

         public double getAmount() {
        return amount;
     }

   
    }
     


    

