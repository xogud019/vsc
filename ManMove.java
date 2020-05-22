import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ManMove extends JFrame{
    int img_x = 500, img_y = 400;

    public ManMove(){
        setSize(1000,1000);
        JButton button1 = new JButton("");
        ImageIcon icon1 = new ImageIcon("C:\\man.png");
        button1.setIcon(icon1);
        button1.setLocation(img_x, img_y);
        JPanel panel = new JPanel();
        panel.add(button1);
        panel.requestFocus();
        panel.setFocusable(true);
        
        panel.addMouseListener(new MouseListener(){
            public void mousePressed(MouseEvent e){
                img_x = e.getX();
                img_y = e.getY();
                button1.setLocation(img_x,img_y);
            }
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
            public void mouseClicked(MouseEvent e){}

        });

        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        ManMove manmove = new ManMove();
    }
}