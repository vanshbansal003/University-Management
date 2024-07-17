package University.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {

    main_class(){
        // Adding background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540,750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel img = new JLabel(i3);
        add(img);

        // Menu Bar
        JMenuBar mb = new JMenuBar();

        // Items in Menu Bar
        // 1) New Information
        JMenu newInfo = new JMenu("New Information");
        newInfo.setForeground(Color.BLACK);
        mb.add(newInfo);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        newInfo.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        newInfo.add(studentInfo);

        //2) Detail
        JMenu Detail = new JMenu("Detail");
        newInfo.setForeground(Color.BLACK);
        mb.add(Detail);

        JMenuItem facultyDetails = new JMenuItem("View Faculty Details");
        facultyDetails.setBackground(Color.WHITE);
        Detail.add(facultyDetails);

        JMenuItem studentDetails = new JMenuItem("View Student Details");
        studentInfo.setBackground(Color.WHITE);
        Detail.add(studentInfo);

        // 3) Leave
        JMenu leave = new JMenu("Apply leave");
        newInfo.setForeground(Color.BLACK);
        mb.add(leave);

        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.WHITE);
        leave.add(facultyLeave);

        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.WHITE);
        leave.add(studentLeave);

        //4) leave Details
        JMenu leaveDetails = new JMenu("Apply leave");
        leaveDetails.setForeground(Color.BLACK);
        mb.add(leaveDetails);

        JMenuItem facultyLeaveDetails = new JMenuItem("Faculty Leave Details");
        facultyLeaveDetails.setBackground(Color.WHITE);
        facultyLeaveDetails.addActionListener(this);
        leaveDetails.add(facultyLeaveDetails);

        JMenuItem studentLeaveDetails = new JMenuItem("Student Leave Details");
        studentLeaveDetails.setBackground(Color.WHITE);
        studentDetails.addActionListener(this);
        leaveDetails.add(studentLeaveDetails);

         //5) Exam
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLACK);
        mb.add(exam);

        JMenuItem examDetail = new JMenuItem("Examination Result");
        examDetail.setBackground(Color.WHITE);
        examDetail.addActionListener(this);
        exam.add(examDetail);

        JMenuItem examMarks = new JMenuItem("Examination Marks");
        examMarks.setBackground(Color.WHITE);
        examMarks.addActionListener(this);
        exam.add(examMarks);

        //6) Update info
        JMenu updateInfo  = new JMenu("Update Details");
        updateInfo.setForeground(Color.BLACK);
        mb.add(updateInfo);

        JMenuItem updatefacultyinfo = new JMenuItem( "Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);

        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);

        //7) Fees
        JMenu Fees = new JMenu("Fee Details");
        Fees.setForeground(Color.BLACK);
        mb.add(Fees);

        JMenuItem Feestructure = new JMenuItem("Fee Structure");
        Feestructure.setBackground(Color.WHITE);
        Feestructure.addActionListener(this);
        Fees.add( Feestructure);

        JMenuItem feesForm  = new JMenuItem(" fees Form ");
        feesForm.setBackground(Color.WHITE);
        feesForm.addActionListener(this);
        Fees.add(feesForm);

        //8) Utility
        JMenu utility = new JMenu( "Utility");
        utility.setForeground(Color.BLACK);
        mb.add(utility);

        JMenuItem Notepad = new JMenuItem("Notepad");
        Notepad.setBackground(Color.WHITE);
        Notepad.addActionListener(this);
        utility.add( Notepad);

        JMenuItem Calculator  = new JMenuItem("Calculator");
        Calculator.setBackground(Color.WHITE);
        Calculator.addActionListener(this);
        utility.add(Calculator);

        //9) About
        JMenu about = new JMenu("");
        about.setForeground(Color.BLACK);
        mb.add(about);

        JMenuItem About = new JMenuItem("About");
        About.setBackground(Color.WHITE);
        About.addActionListener(this);
        about.add(About);

        //10) Exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLACK);
        mb.add(exit);

        JMenuItem Exit = new JMenuItem("Exit");
        Exit.setBackground(Color.WHITE);
        Exit.addActionListener(this);
        exit.add(Exit);



        //Adding Menu bar on page
        setJMenuBar(mb);
        // Setting the size
        setSize(1540 , 850);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        JMenuItem source = (JMenuItem) e.getSource(); // Get The Source JMenu Item
        if(source.getText().equals("Exit")){
            System.exit(15);
        } else if (source.getText().equals("Calculator")) {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new main_class();
    }
}
