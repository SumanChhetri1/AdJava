/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionDemo implements ActionListener{
    // global declaration..........
    JFrame f;
    JButton b;
    JTextField t1,t2;
    
    ActionDemo(){
        f= new JFrame();
        t1=new JTextField(20);
        t2=new JTextField(20);
        b= new JButton("copy");
        
        f.add(t1);f.add(b);f.add(t2);
        FlowLayout fl=new FlowLayout(FlowLayout.CENTER,120,10);
        
        f.setSize(350,450);
        f.setLayout(fl);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b.addActionListener(this);//calling method by this............
    }
    public void actionPerformed(ActionEvent ae){
        String s=t1.getText();
        t2.setText(s);
    }
    public static void main(String args[]){
        new ActionDemo();
    }
}
