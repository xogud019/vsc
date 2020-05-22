import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class Dice extends JFrame{
    int d1, d2;
    JButton button1,button2;
    JLabel output;

    public Dice(){
        setTitle("Dice Game");
        setSize(300,200);
        JPanel panel = new JPanel();
        button1 = new JButton(""+d1);
        panel.add(button1);
        button2 = new JButton(""+d2);
        panel.add(button2);
        output = new JLabel("GOOD LUCK");
        panel.add(output,BorderLayout.SOUTH);
        panel.requestFocus();
        panel.setFocusable(true);
        panel.addKeyListener(new KeyListener(){
            public void keyPressed(KeyEvent e){
                int keycode=e.getKeyCode();
                if(keycode==KeyEvent.VK_ENTER){
                    d1 = (int)(Math.random()*6+1);
                    d2 = (int)(Math.random()*6+1);
                    button1.setText(""+d1);
                    button2.setText(""+d2);
                    if((d1+d2)%2==0){
                        output.setText("Even");
                    }
                    else{
                        output.setText("Odd");
                    }
                }
            }
            public void keyReleased(KeyEvent e){}
            public void keyTyped(KeyEvent e){}
        });
        panel.setLayout(new GridLayout(0,2));
        add(panel,BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        Dice dice =new Dice();
    }
}