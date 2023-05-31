/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;
import java.awt.*;
import javax.swing.*;
public class DemoBorderLayout {
     public static void main(String[] args) 
    { 
        JFrame f=new JFrame();


        JButton b1=new JButton("NORTH");
        JButton b2=new JButton("SOUTH");
        JButton b3=new JButton("EAST..."); 
        JButton b4=new JButton("WEST");
        JTextField tf=new JTextField("CENTER..Hello!");

        f.add(b1,BorderLayout.NORTH); 
        f.add(b2,BorderLayout.SOUTH); 
        f.add(b3,BorderLayout.EAST); 
        f.add(b4,BorderLayout.WEST); 
        f.add(tf,BorderLayout.CENTER);

        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

