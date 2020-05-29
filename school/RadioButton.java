import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3;
    JLabel l;
    JPanel top, center, bot;

    public RadioButton(){
        setSize(300,350);
        setTitle("Radio");

        top = new JPanel();
        top.add(new JLabel("choose picture"));
        add(top,BorderLayout.NORTH);

        center = new JPanel();
        r1= new JRadioButton("dice");
        r2= new JRadioButton("man");
        r3= new JRadioButton("box");

        ButtonGroup size = new ButtonGroup();
        size.add(r1);
        size.add(r2);
        size.add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        center.add(r1);
        center.add(r2);
        center.add(r3);
        add(center,BorderLayout.CENTER);

        bot = new JPanel();
        l = new JLabel("not chosen");
        bot.add(l);
        add(bot,BorderLayout.SOUTH);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==r1){
            ImageIcon icon =new ImageIcon("C:\\dice.jpg");
            l.setText("");
            l.setIcon(icon);
        }
        if(e.getSource()==r2){
            ImageIcon icon =new ImageIcon("C:\\man.png");
            l.setText("");
            l.setIcon(icon);
        }
        if(e.getSource()==r3){
            ImageIcon icon =new ImageIcon("C:\\box.jpg");
            l.setText("");
            l.setIcon(icon);
        }
    }

    public static void main(String[] args){
        new RadioButton();
    }
}