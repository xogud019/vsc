import javax.swing.*;
import java.awt.*;

public class NumberPad extends JFrame{
    public NumberPad(){
        setSize(400,800);
        setTitle("CellPhone");
        setLayout(new GridLayout(0,3));

        for(int i=0; i<12; i++){
            if(i==9){
                JButton button = new JButton("*");    
                add(button);
            }
            else if(i==10){
                JButton button = new JButton("0");
                add(button);
            }
            else if(i==11){
                JButton button = new JButton("#");
                add(button);
            }
            else{
                JButton button = new JButton(Integer.toString(i+1));
                add(button);
            }
        }
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        NumberPad pad = new NumberPad();
    }
}