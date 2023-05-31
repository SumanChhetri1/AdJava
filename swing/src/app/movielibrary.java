
package app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class movielibrary implements ActionListener{
    // global declaration..........
    JFrame f;
    JButton b;
    JTextField t1,t2,t3;
    
    movielibrary(){
        f= new JFrame();
        t1=new JTextField(20);
        t2=new JTextField(20);
        t3=new JTextField(20);
        b=new JButton("Insert");
        
        f.add(t1);f.add(t2);f.add(t3);f.add(b);
        FlowLayout fl=new FlowLayout(FlowLayout.CENTER,120,10);
        
        f.setSize(350,450);
        f.setLayout(fl);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b.addActionListener(this);//calling method by this............
    }
    public void actionPerformed(ActionEvent ae){
        
            int id =Integer.parseInt(t1.getText());
            String name =t2.getText();
            String genere=t3.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//sql define......
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "");// connection .......
            PreparedStatement pst=con.prepareStatement("insert into films value(?,?,?)");
            pst.setInt(1,id);
            pst.setString(2,name);
            pst.setString(3,genere);
            pst.executeUpdate();
            pst.close();
            con.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        new movielibrary();
    }
}
