import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextField1 extends JFrame{
    JButton button;
    JTextField input1, input2, result;

    public TextField1(){
        setSize(250,300);
        setTitle("GCD");
        ButtonListener listener = new ButtonListener();
        JPanel panel = new JPanel();
        
        panel.add(new JLabel("num1:"));
        input1 = new JTextField(15);
        panel.add(input1);
        
        panel.add(new JLabel("num2:"));
        input2 = new JTextField(15);
        panel.add(input2);
        
        panel.add(new JLabel("gcd:"));
        result = new JTextField(15);
        result.setEditable(false);
        panel.add(result);

        button = new JButton("OK");
        button.addActionListener(listener);
        panel.add(button);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==button||e.getSource()==input1||e.getSource()==input2){
                String n = input1.getText();
                String m = input2.getText();
                int v1 = Integer.parseInt(n);
                int v2 = Integer.parseInt(m);

                result.setText(" "+gcd(v1,v2));
                input1.requestFocus();
                input2.requestFocus();
            }
        }
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
        TextField1 text= new TextField1();
    }
}