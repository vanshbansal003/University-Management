package University.management.system;

import java.sql.ResultSet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField textFieldName ;
    JPasswordField passwordField;
    JButton login , back;

    Login(){

        // Username added to application
        JLabel labelName = new JLabel("Username");
        labelName.setBounds(40,20,100,20);
        add(labelName);
        // text field to add your username
        textFieldName = new JTextField();
        textFieldName.setBounds(150,20,150,20);
        add(textFieldName);

        // Password label added to application
        JLabel labelPass = new JLabel("Password");
        labelPass.setBounds(40,70,100,20);
        add(labelPass);
        // Add password field to add password
        passwordField = new JPasswordField();
        passwordField.setBounds(150,70,150,20);
        add(passwordField);

        // ADD login button
        login = new JButton("Login");
        login.setBounds(40,140,120,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        // Add back button
        back = new JButton("Back");
        back.setBounds(180,140,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        //  login image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/second.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(350,20,200,200);
        add(img);

        // Background image
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/loginback.png"));
        Image i22 = i11.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel image = new JLabel(i33);
        image.setBounds(0,0,600,300);
        add(image);


        setSize(600,300);
        setLocation(500,250);
        setLayout(null);

        setVisible(true);
    }
   @Override
   public void actionPerformed(ActionEvent e){
        if(e.getSource() == login){
            String username = textFieldName.getText();
            String password = new String(passwordField.getPassword());

            String query = "select * from login where username = '" +username+"' and password = '"+password+"'";
            try{
                Conn c =new Conn();
                ResultSet resultset = c.statement.executeQuery(query);
                if(resultset.next()){
                    setVisible(false);
                    //next class
                    new main_class();
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid username or password");
                }
            }catch(Exception E){
                E.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
