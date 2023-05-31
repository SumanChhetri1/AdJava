/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;
import javax.swing.*;
public class TableScroll {
    TableScroll(){
        
        JFrame f=new JFrame("Table Scrollable");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String data[][]={{"1","Ram","Chitwan"},{"2","Hari","Pokhara"}};
        String column[]={"ID","Name","Address"};
        JTable t=new JTable(data,column);
        
        JScrollPane sp=new JScrollPane(t);
        sp.setBounds(8, 35, 200, 200);
        
        f.add(sp); 
    }
    
    public static void main(String args[]){
            new TableScroll();
        }
    
    
}
