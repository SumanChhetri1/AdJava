/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyDemo implements KeyListener {
    JFrame f;
    JTextField t1,t2,t3;
    JButton b;
    
    KeyDemo(){
        f= new JFrame();
        t1=new JTextField(20);
        t2=new JTextField(20);
        b=new JButton("Ok");
        t3=new JTextField(20);
        
        f.add(t1);f.add(t2);f.add(t3);f.add(b);
        FlowLayout fl=new FlowLayout(FlowLayout.CENTER,120,10);
        
        f.setSize(350,450);
        f.setLayout(fl);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b.addKeyListener(this);//calling method by this............
    }
    public void keyPressed(KeyEvent ke){
        int a= Integer.parseInt(t1.getText());
        int b= Integer.parseInt(t2.getText());
        
        if(ke.getKeyChar()=='a'){
            int sum;
            sum=a+b;
            t3.setText(String.valueOf(sum));
        }
        else if(ke.getKeyChar()=='s'){
            int diff;
            diff=a-b;
            t3.setText(String.valueOf(diff));
        }
        else{
            System.out.println("Press Either A or S");
        }
    }
        public void keyReleased(KeyEvent ke){
            
        }
        public void keyTyped(KeyEvent ke){
        
            
        }
        public static void main(String args[]){
        new KeyDemo();
    }
        

}
    

