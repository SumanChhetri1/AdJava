
package swing;
import javax.swing.*;
public class Form {
    Form(){
        JFrame f=new JFrame("Form");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextArea ta= new JTextArea("Welcome To The Registration page");//TextArea.........
        ta.setBounds(8, 10, 200, 20);
        
        JLabel username=new JLabel("UserName:");// label.....
        username.setBounds(8, 35, 100, 20);
        JTextField txtname= new JTextField();//textfield..........
        txtname.setBounds(75, 35, 100, 20);
        
        JLabel password=new JLabel("Password:");
        password.setBounds(8, 65, 100, 20);
        JPasswordField txtpass= new JPasswordField();// passwordfield.......
        txtpass.setBounds(75, 65, 100, 20);
        
        JLabel course=new JLabel("Course:");
        course.setBounds(8, 95, 100, 20);
        JCheckBox cb1=new JCheckBox("C++");// check box...........
        cb1.setBounds(55,95, 47, 20);
        JCheckBox cb2=new JCheckBox("Java");
        cb2.setBounds(110,95, 60, 20);
        
        JLabel gender=new JLabel("Gender:");
        gender.setBounds(8, 115, 100, 20);
        JRadioButton rb1=new JRadioButton("Male",true);// radio button.........
        rb1.setBounds(55,115, 60, 20);
        JRadioButton rb2=new JRadioButton("Female");
        rb2.setBounds(120,115, 70, 20);
        JRadioButton rb3=new JRadioButton("Others");
        rb3.setBounds(195,115, 80, 20);
        ButtonGroup bg=new ButtonGroup();// button group..........
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        JLabel nation=new JLabel("Country:");
        nation.setBounds(8, 145, 100, 20);
        String country[]={"Nepal","India","Usa","Bhutan"};// array for storing values........
        JComboBox cb=new JComboBox(country);// combo box ......
        cb.setBounds(65,145, 70, 20);
        
        String data[][]={{"1","Ram","Chitwan"},{"2","Hari","Pokhara"},{"3","Sita","Kathmandu"}};// 2d array.........
        String column[]={"ID","Name","Address"};
        JTable t=new JTable(data,column);// table..........
        JScrollPane sp=new JScrollPane(t);// scrollpane..........
        sp.setBounds(8, 180, 200, 50);

        
        JButton save= new JButton("Save");// button...........
        save.setBounds(150, 250, 80, 20);
        
        f.add(ta);
        f.add(username);
        f.add(txtname);
        f.add(password);
        f.add(txtpass);
        f.add(save);
        f.add(course);
        f.add(cb1);
        f.add(cb2);
        f.add(gender);
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);
        f.add(nation);
        f.add(cb);
        f.add(sp);
        
        
    }
    public static void main(String args[]){
        new Form();
    }
}
