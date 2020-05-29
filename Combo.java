import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Combo extends JFrame implements ActionListener{
    JLabel l;

    public Combo(){
        setSize(300,350);
        setTitle("Combo");

        String[] arr = {"dice","box"};
        JComboBox arrList = new JComboBox(arr);
        arrList.setSelectedIndex(0);
        arrList.addActionListener(this);

        l = new JLabel();
        l.setHorizontalAlignment(JLabel.CENTER);
        changePicture(arr[arrList.getSelectedIndex()]);
        add(arrList,BorderLayout.NORTH);
        add(l,BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        JComboBox cb = (JComboBox)e.getSource();
        String name = (String)cb.getSelectedItem();
        changePicture(name);
    }

    public void changePicture(String name){
        ImageIcon icon = new ImageIcon("C:\\"+name+".jpg");
        l.setIcon(icon);
        if(icon!=null){
            l.setText(null);
        }
        else{
            l.setText("image not fount");
        }
    }

    public static void main(String[] args){
        new Combo();
    }
}