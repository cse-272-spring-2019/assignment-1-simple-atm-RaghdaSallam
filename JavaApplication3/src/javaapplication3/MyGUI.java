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
import javax.swing.JTextField;

/**
 *
 * @author Raghda.
 */
public class MyGUI extends JFrame {

    JButton btn = new JButton("Login");
    JButton btn2 = new JButton("Login");
    JLabel label = new JLabel("Card No");
    JTextField txt = new JTextField(50);
    Client c = new Client(0, "5837");

    public MyGUI() {
        setLayout(null);
        add(label);
        label.setBounds(120, 200, 100, 30);
        add(txt);
        txt.setBounds(180,200, 100, 30);
        add(btn);
        btn.setBounds(180,240, 100, 30);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt.getText().equals(c.getcardNo())) {
                    Home m = new Home(c);
                    m.setVisible(true);
                    m.setSize(500, 600);
                    setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }

            }
        });
    }
}
