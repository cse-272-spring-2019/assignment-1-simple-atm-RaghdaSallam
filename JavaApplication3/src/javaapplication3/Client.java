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
public class Client {

    private double balance;
    private String cardNo;
    int index=0;
   /* int count=0;*/

    public Client(double balance, String cardNo) {
        this.balance = balance;

        this.cardNo = cardNo;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getcardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
    
    
    
}