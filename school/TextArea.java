import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextArea extends JFrame implements ActionListener{
    JTextField t1;
    JTextArea a1;

    public TextArea(){
        setSize(300,150);
        setTitle("TextArea");

        t1 = new JTextField(20);
        t1.addActionListener(this);

        a1 = new JTextArea(5,20);
        a1.setEditable(false);

        add(t1,BorderLayout.NORTH);
        add(a1,BorderLayout.CENTER);

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String[] arr = t1.getText().split(" ");
        int v1 = Integer.parseInt(arr[0]);
        int v2 = Integer.parseInt(arr[1]);

        a1.append(Integer.toString(gcd(v1,v2)));
        t1.selectAll();
        a1.setCaretPosition(a1.getDocument().getLength());
    }

    public static int gcd(int v1, int v2){
        int answer =0;
        int temp=1;

        while(v1>v2?temp<=v2:temp<=v1){
            if(v1%temp==0&&v2%temp==0){
                answer =temp;
            }
            temp++;
        }

        return answer;
    }

    public static void main(String[] args){
        new TextArea();
    }
}