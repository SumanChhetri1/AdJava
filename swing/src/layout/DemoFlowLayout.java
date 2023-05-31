/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;
import java.awt.*;
import javax.swing.*;
public class DemoFlowLayout {
    public static void main(String[] args) 
    {
        JFrame f=new JFrame();
        f.setSize(700,600);
        f.setVisible(true); 
        //
        JButton b1=new JButton("1"); 
        JButton b2=new JButton("2"); 
        JButton b3=new JButton("3"); 
        JButton b4=new JButton("4"); 
        JButton b5=new JButton("5");
        JButton b6 = new JButton("6");


        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5); 
        f.add(b6);
        f.add(b1);
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 120, 20);
        f.setLayout(fl);
        //setting flow layout of right alignment

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

     

