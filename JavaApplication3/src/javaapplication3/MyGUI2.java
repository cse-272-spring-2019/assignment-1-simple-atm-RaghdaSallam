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

/**
 *
 * @author Raghda
 */
public class MyGUI2 extends JFrame {
 
    JButton btn = new JButton("0");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btn10 = new JButton("ok");
    

    ATM m;

    public MyGUI2(Client c) {
        m = new ATM(c);
        setLayout(null);

        add(btn);
        btn.setBounds(50, 50, 20, 20);
        add(btn1);
        btn1.setBounds(70, 50, 20, 20);
        add(btn2);
        btn2.setBounds(90, 50, 20, 20);
        add(btn3);
        btn3.setBounds(50, 70, 20, 20);
        add(btn4);
        btn4.setBounds(70, 70, 20, 20);
        add(btn5);
        btn5.setBounds(90, 70, 20, 20);
        add(btn6);
        btn6.setBounds(50, 90, 20, 20);
        add(btn7);
        btn7.setBounds(70, 90, 20, 20);
        add(btn8);
        btn8.setBounds(90, 90, 20, 20);
        add(btn9);
        btn9.setBounds(50, 110, 20, 20);
        btn10.setBounds(70, 110, 20, 20);
        
        
btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
       }
});
}
}