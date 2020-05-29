import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBox extends JFrame{
    public CheckBox(){
        setSize(150,300);
        setTitle("checkBox");

        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new GridLayout(0,1));
        
        JCheckBox c1 = new JCheckBox("kim");
        JCheckBox c2 = new JCheckBox("song");
        JCheckBox c3 = new JCheckBox("park");
        JCheckBox c4 = new JCheckBox("min");
        JCheckBox c5 = new JCheckBox("joo");

        panel.add(c1);
        panel.add(c2);
        panel.add(c3);
        panel.add(c4);
        panel.add(c5);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new CheckBox();
    }
}