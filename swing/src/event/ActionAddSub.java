/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ActionAddSub implements ActionListener{
    // global declaration..........
    JFrame f;
    JButton add,sub;
    JTextField t1,t2,t3;
    
    ActionAddSub(){
        f= new JFrame();
        t1=new JTextField(20);
        t2=new JTextField(20);
        add=new JButton("Add");
        sub= new JButton("Subtract");
        t3=new JTextField(20);
        
        f.add(t1);f.add(t2);f.add(add);f.add(sub);f.add(t3);
        FlowLayout fl=new FlowLayout(FlowLayout.CENTER,120,10);
        
        f.setSize(350,450);
        f.setLayout(fl);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add.addActionListener(this);//calling method by this............
        sub.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            int a =Integer.parseInt(t1.getText());
            int b =Integer.parseInt(t2.getText());
            int sum=a+b;
            t3.setText(String.valueOf(sum));
        }
        else if(ae.getSource()==sub){
            int a =Integer.parseInt(t1.getText());
            int b =Integer.parseInt(t2.getText());
            int sub=a-b;
            t3.setText(String.valueOf(sub));      
        }
    }
    public static void main(String args[]){
        new ActionAddSub();
    }
}
