package University.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class AddFaculty extends JFrame {

    JTextField textName,textFather,textAddress,
              textPhone,textEmail,textM10,textM12,textAadhar ;
    JComboBox courseBox , departmentBox;
    JButton Submit,Cancel;
    JLabel empText;
    JDateChooser cdob ;
    Random ran = new Random();
    long ID = Math.abs((ran.nextLong() % 9000L)+1000L);

    AddFaculty(){

        getContentPane().setBackground((new Color(166,162,252)));

        // Heading
        JLabel heading = new JLabel(("New Teacher Details"));
        heading.setBounds(310,30,500,50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);

        // Name Text Fields
        JLabel name = new JLabel("Name");
        name.setBounds(50,150,100,30);
        name.setFont(new Font("serif",Font.BOLD,30));
        add(name);
        textName = new JTextField();
        textName.setBounds(200,150,200,30);
        add(textName);

        //Father Name Text Field
        JLabel fname = new JLabel("Father Name");
        fname.setBounds(410,150,200,30);
        fname.setFont(new Font("serif",Font.BOLD,30));
        add(fname);
        textFather = new JTextField();
        textFather.setBounds(600,150,200,30);
        add(textFather);

        //Employee ID
        JLabel empID = new JLabel("Employee ID");
        empID.setBounds(50,200,200,30);
        empID.setFont(new Font("serif",Font.BOLD,30));
        add(empID);
        empText = new JLabel(""+ID);
        empText.setBounds(250,200,150,30);
        empText.setFont(new Font("serif",Font.BOLD,30));
        add(empText);

        // DOB Enter Text
        JLabel dob = new JLabel("Date Of Birth");
        dob.setBounds(410,200,200,30);
        dob.setFont(new Font("serif",Font.BOLD,30));
        add(dob);
       cdob = new JDateChooser();
       cdob.setBounds(600,200,150,30);
       add(cdob);

       // Address
        JLabel address = new JLabel("Address");
        address.setBounds(50,250,200,30);
        address.setFont(new Font("serif",Font.BOLD,30));
        add(address);
        textAddress = new JTextField();
        textAddress.setBounds(200,250,150,30);
        add(textAddress);

        // Phone
        JLabel phone = new JLabel("Phone");
        phone.setBounds(410,250,200,30);
        phone.setFont(new Font("serif",Font.BOLD,30));
        add(phone);
        textPhone = new JTextField();
        textPhone.setBounds(600,250,150,30);
        add(textPhone);

        // Email
        JLabel email = new JLabel("Email ID");
        email.setBounds(50,300,200,30);
        email.setFont(new Font("serif",Font.BOLD,30));
        add(email);
        textEmail = new JTextField();
        textEmail.setBounds(200,300,200,30);
        add(textEmail);

        // Xth Marks
        JLabel M10 = new JLabel("Class X (%)");
        M10.setBounds(400,300,200,30);
        M10.setFont(new Font("serif",Font.BOLD,20));
        add(M10);
        textM10 = new JTextField();
        textM10.setBounds(600,300,150,30);
        add(textM10);

        // 12th Marks
        JLabel M12 = new JLabel("Class XII (%)");
        M12.setBounds(50,350,200,30);
        M12.setFont(new Font("serif",Font.BOLD,20));
        add(M12);
        textM12 = new JTextField();
        textM12.setBounds(200,350,150,30);
        add(textM12);

        // Aadhar Number
        JLabel AadharNo = new JLabel("Aadhar Number");
        AadharNo.setBounds(400,350,200,30);
        AadharNo.setFont(new Font("serif",Font.BOLD,20));
        add(AadharNo);
        textAadhar = new JTextField();
        textAadhar.setBounds(600,350,150,30);
        add(textAadhar);

        // Qualification
        JLabel Qualification =  new JLabel("Qualification");
        Qualification.setBounds(50,400,200,30);
        Qualification.setFont(new Font("serif",Font.BOLD,20));
        add(Qualification);
        String course[] = {"B.Tech","BBA","BCA","BSC","MSC","MBA","MCA","MCom","MA","BA"};
        courseBox = new JComboBox<>(course);
        courseBox.setBounds(200,400,150,30);
        courseBox.setBackground(Color.WHITE);
        add(courseBox);

        //Department
        JLabel Department =  new JLabel("Department");
        Department.setBounds(400,400,200,30);
        Department.setFont(new Font("serif",Font.BOLD,20));
        add(Department);
        String department[] = {"Computer Science","Electronics","Mechanical","Civil","IT"};
        departmentBox = new JComboBox<>(department);
        departmentBox.setBounds(200,400,150,30);
        departmentBox.setBackground(Color.WHITE);
        add(departmentBox);

        Submit = new JButton("Submit");
        Submit.setBounds(250,550,120,30);
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);

        Cancel = new JButton("Submit");
        Cancel.setBounds(450,550,120,30);
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        add(Cancel);







        setSize(900,700);
        setLocation(350,50);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new AddFaculty();
    }
}
