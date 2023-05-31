/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;
import java.awt.*;
import javax.swing.*;
public class GridBagDemo extends JFrame{
    public GridBagDemo() 
{ 
GridBagLayout grid = new GridBagLayout();
GridBagConstraints gbc = new GridBagConstraints(); 

setLayout(grid);
setTitle("GridBag Layout Example");

//GridBagLayout layout = new GridBagLayout();
//setLayout(layout);
gbc.fill = GridBagConstraints.HORIZONTAL;
gbc.gridx = 0;
gbc.gridy = 0;
add(new JButton("Button One"), gbc); 
gbc.gridx = 0;
gbc.gridy = 1;
add(new JButton("Button two"), gbc); 
//gbc.fill = GridBagConstraints.HORIZONTAL; 
gbc.ipady = 40;
gbc.ipadx = 30;
gbc.gridx = 1;
gbc.gridy = 0;
add(new JButton("Button Three"), gbc); 
gbc.gridx = 1;
gbc.gridy = 1;
add(new JButton("Button Four"), gbc); 
gbc.gridx = 0;
gbc.gridy = 2;
//gbc.fill = GridBagConstraints.HORIZONTAL; 
gbc.gridwidth = 2;
add(new JButton("Button Five"), gbc);
//gbc.fill= GridBagConstraints.HORIZONTAL;
gbc.gridx=0;
gbc.gridy=3;
gbc.ipady = 60;
gbc.gridwidth=1;
add(new JButton("Button Six"),gbc);
gbc.gridx=1;
gbc.gridy=3;
add(new JButton("Button Seven"),gbc);

setSize(600, 600); 

setPreferredSize(getSize()); 
setVisible(true); 
setDefaultCloseOperation(EXIT_ON_CLOSE);
} 
public static void main(String[] args) 
{ 
 new GridBagDemo();
 
}
}