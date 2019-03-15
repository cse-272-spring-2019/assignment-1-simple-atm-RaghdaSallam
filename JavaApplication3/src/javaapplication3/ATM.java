/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Raghda
 */
/*public class AtM {}*/
public class ATM {

    Client c;
    int i;
    ATM m;
    int count = 0;
    /* Transactions [] trans=new Transactions[5];*/
    ArrayList<Transactions> history = new ArrayList<Transactions>();

    public ATM(Client c) {
        this.c = c;
    }

    public void withdraw(String amount) {
        double x = Double.parseDouble(amount);
        if (c.getBalance() < x) {
            JOptionPane.showMessageDialog(null, "error balance not enough");
        } else {

            double current = c.getBalance();
            c.setBalance(current - x);

            /* for(i=4 ;i>0;i--) 
             { trans[i+1]=trans[i];
             
             }
             trans[0]=new Transactions ("withdraw",x) ;
             c.index=0;*/
            history.add(new Transactions("withdraw", x));
            count++;

        }
    }

    public String BalanceInquiry() {
        return c.getBalance() + "";
    }

    public void deposit(String amount) {
        double x = Double.parseDouble(amount);
        double current = c.getBalance();
        c.setBalance(current + x);

        /*  for(i=4;i>0;i--) 
         { trans[i]=trans[i-1];
             
         }
         trans[0]=new Transactions ("deposit",x) ;
         c.index=0;*/
        history.add(new Transactions("deposit", x));
        count++;

    }

    public Transactions prev() {
        /* if( c.index>4){
         JOptionPane.showMessageDialog(null, "No previous transaction.");
         /*return trans[0];}*/
        /*else*/
        /*  c.index++;*/
        /*  System.out.println(trans[c.index].getAmount);*/
        /* return trans[c.index++];*/
        if (count == 0) {
            return new Transactions(" no more", 0);
        } else {
            return history.get(--count);
        }

    }

    public Transactions next() {
        /* if( c.index<0){
         JOptionPane.showMessageDialog(null, "No more transaction.");
         /*return trans[0];}*/
        /* else*/
        /*  c.index--;*/

        /* System.out.println(w.get);*/
        /* return trans[c.index--]; */
        if (count == 0||count==history.size()-1) {
            return new Transactions(" no more", 0);
        } else {
            return history.get(++count);
        }

    }
    /*public void printing () 
     {
     }*/

}
