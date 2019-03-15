/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Raghda
 */
public class Home extends JFrame {

    JButton btn = new JButton("Withdraw");
    JButton btn1 = new JButton("Deposit");
    JButton btn2 = new JButton("Previous");
    JButton btn3 = new JButton("Next");
    JButton balance = new JButton("Balance");
    JLabel label = new JLabel(" ");
    ATM m;

    public Home(Client c) {
        m = new ATM(c);
        setLayout(null);

        add(btn);
        btn.setBounds(80, 80, 100, 30);
        add(btn1);
        btn1.setBounds(340, 80, 100, 30);
        add(balance);
        balance.setBounds(80, 120, 100, 30);
        add(btn2);
        btn2.setBounds(80, 160, 100, 30);
        add(btn3);
        btn3.setBounds(340, 160, 100, 30);
        add(label);
        label.setBounds(340, 120, 100, 30);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 String Entered=JOptionPane.showInputDialog("Enter amount");
              /*  ATM m=new ATM(c);*/
                m.withdraw(Entered);
             
            }
        });
        balance.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                label.setText(m.BalanceInquiry());
            }
        });

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String Entered=JOptionPane.showInputDialog("Enter amount");
              /* ATM m=new ATM(c);*/
                m.deposit(Entered);
                   
                

            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 /* ATM m= new ATM(c);*/
                    Transactions w =m.prev();
                     label.setText(w.getType()+w.getAmount());
                    
                 
                    
                }
        });   
                  
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
            /*    ATM m= new ATM(c);*/
            
                    Transactions w =m.next();
                     label.setText(w.getType()+w.getAmount());
                    
            } 
        });
    }
}
        
      
    

