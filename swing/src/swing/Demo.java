/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;
import javax.swing.*;
public class Demo {
    Demo(){
        JFrame f=new JFrame("Title");
        JButton b= new JButton("OK");
        b.setBounds(35, 30, 20, 15);
        f.add(b);
        //container lai paramerers deko..........
        f.setSize(350, 450);
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String args[]){
        new Demo();
    }
    
}
