import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class TextField2 extends JFrame {
    JButton b1, b2, b3;
    JTextField t1;
    JPasswordField t2;
    JLabel l1, l2;
    HashMap<String, String> map = new HashMap<>();

    public TextField2(){
        setSize(300,250);
        setTitle("login");
        ButtonListener listener = new ButtonListener();
        JPanel panel = new JPanel();

        l1 = new JLabel("ID   ");
        panel.add(l1);
        t1 = new JTextField(20);
        panel.add(t1);

        l2 = new JLabel("PWD");
        panel.add(l2);
        t2 = new JPasswordField(20);
        panel.add(t2);

        b1 = new JButton("login");
        b1.addActionListener(listener);
        panel.add(b1);

        b2 = new JButton("sign"); 
        b2.addActionListener(listener);
        panel.add(b2);

        b3 = new JButton("cancel"); 
        b3.addActionListener(listener);
        panel.add(b3);

        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new TextField2();
    }

    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){

            if(e.getSource()==b1||e.getSource()==t1||e.getSource()==t2){
                String id = t1.getText();
                if(map.get(id).isEmpty()!=true){
                    JOptionPane.showMessageDialog(null, "connect", "info", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(map.get(id).isEmpty()){
                    JOptionPane.showMessageDialog(null, "no match", "info", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "no match", "info", JOptionPane.INFORMATION_MESSAGE);
                }

            }
            else if(e.getSource()==b3){
                System.exit(0);
            }

            else if(e.getSource()==b2||e.getSource()==t1||e.getSource()==t2){
                String id = t1.getText();
                String pwd = t2.getText();

                map.put(id, pwd);
            }
        }
    } 
}