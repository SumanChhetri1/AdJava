/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyTypedDemo implements KeyListener {
    JFrame f;
    JTextField t1,t2;
    
    
    KeyTypedDemo(){
        f= new JFrame();
        t1=new JTextField(20);
        t2=new JTextField(20);
        
        f.add(t1);f.add(t2);
        FlowLayout fl=new FlowLayout(FlowLayout.CENTER,120,10);
        
        f.setSize(350,450);
        f.setLayout(fl);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        t1.addKeyListener(this);//calling method by this............
    }
    public void keyPressed(KeyEvent ke){

    }
        public void keyReleased(KeyEvent ke){
            
        }
        public void keyTyped(KeyEvent ke){
        String a= t1.getText();
        
        
        if(a=="yes"){
            
            t2.setText("Welcome");
        }
        else if(a=="no"){
            t2.setText("Bye");
        }
        else{
            System.out.println("Press Either yes or no");
        }
            
        }
        public static void main(String args[]){
        new KeyTypedDemo();
    }
        

}
    