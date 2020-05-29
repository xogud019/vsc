import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class Dice extends JFrame{
    int d1, d2;
    JButton button1,button2;
    JLabel o1, o2, o3;
    JPanel panel;

    public Dice(){
        setTitle("Dice Game");
        setSize(500,300);

        ImageIcon icon = new ImageIcon("C:\\dice.jpg");
        panel = new JPanel();
        o1 = new JLabel();
        o2 = new JLabel();
        o3 = new JLabel("GOOD LUCK");
        o3.setIcon(icon);

        panel.add(o3,BorderLayout.SOUTH);
        panel.requestFocus();
        panel.setFocusable(true);
        panel.addKeyListener(new KeyListener(){
            public void keyPressed(KeyEvent e){
                int keycode=e.getKeyCode();
                if(keycode==KeyEvent.VK_ENTER){
                    d1 = (int)(Math.random()*6+1);
                    d2 = (int)(Math.random()*6+1);
                    o1.setText(""+d1);
                    o2.setText(""+d2);
                    if((d1+d2)%2==0){
                        o3.setText("Even");
                    }
                    else{
                        o3.setText("Odd");
                    }
                }
            }
            public void keyReleased(KeyEvent e){}
            public void keyTyped(KeyEvent e){}
        });

        panel.add(o1);
        panel.add(o2);
        add(panel,BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        Dice dice =new Dice();
    }
}