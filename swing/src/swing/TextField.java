/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;
import javax.swing.*;
public class TextField {
     TextField(){
        JFrame f=new JFrame("Title");
        f.setSize(350, 450);
        f.setVisible(true);
        f.setLayout(null);
        
        JTextField t= new JTextField();
        t.setBounds(35, 30, 100, 20);
        f.add(t);
        
        
    }
    public static void main(String args[]){
        new TextField();
    }
}
