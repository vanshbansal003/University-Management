package University.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {

    Thread t;

    Splash (){

        // Importing image from icon folder and adjusting it
        ImageIcon i1;
        i1 = new ImageIcon(ClassLoader.getSystemResource("icon/first.png"));
        Image i2 = i1.getImage().getScaledInstance(1000,700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        // Adding image on to the application
        JLabel img = new JLabel(i3);
        add(img);

        // Implementing our thread
        t = new Thread(this);
        t.start();

        //setting visibility true
        setVisible(true);

        // Animation used for starting of the application
        int x = 1;
        for (int i = 2; i <= 600 ; i+=4,x+= 1) {

            setLocation(600- ((i+x)/2), 350-(i/2));
            setSize(i+3*x , i+x/2);

            try{
                Thread.sleep(10);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    // The thread runs for only 7 seconds after that next class opens
    public void run (){
        try {
            Thread.sleep(7000);
            setVisible(false);
            // next class
            new Login();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}
