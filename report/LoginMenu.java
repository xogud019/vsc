import javax.swing.*;
import java.awt.*;

public class LoginMenu extends JFrame {
    public LoginMenu(){
        setSize(300,200);
        setTitle("Login Menu");

        JPanel panel = new JPanel();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();
        
        JLabel label1=  new JLabel("ID");
        JLabel label2=  new JLabel("PWD");
        JTextField f1 = new JTextField(10);
        JTextField f2 = new JTextField(10);
        panelA.add(label1);
        panelA.add(f1);

        panelB.add(label2);
        panelB.add(f2);

        panel.add(panelA);
        panel.add(panelB);
        add(panel);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        LoginMenu LM = new LoginMenu();
    }
}