import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    public MyFrame(){
        setSize(400,600);
        setTitle("KIm`s New");
        //setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        JButton b1 = new JButton("b1");
        b1.setBackground(Color.RED);
        JButton b2 = new JButton("b2");
        b2.setBackground(Color.BLUE);
        JButton b3 = new JButton("b3");
        b3.setBackground(Color.BLACK);
        JButton b4 = new JButton("b4");
        b4.setBackground(Color.GREEN);
        JButton b5 = new JButton("b5");
        b5.setBackground(Color.CYAN);

        panel.add(b1);
        b1.setLocation(150, 50);
        panel.add(b2);
        b2.setLocation(150, 150);
        panel.add(b3);
        b3.setLocation(150, 250);
        panel.add(b4);
        b4.setLocation(150, 350);
        panel.add(b5);
        b5.setLocation(150, 450);
        add(panel);
       
        //getContentPane().setBackground(Color.DARK_GRAY);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        MyFrame f= new MyFrame();
    }
}