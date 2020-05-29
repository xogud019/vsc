import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UpDown extends JFrame implements ActionListener{
    final static int randomNum = (int)(Math.random()*9+1);
    private JButton[] button = new JButton[9];
    private JPanel panel;
    private JLabel output, information;

    public UpDown(){
        setTitle("UP&DOWN");
        setSize(400,200);

        panel = new JPanel();
        panel.setLayout(new GridLayout(0,9));

        information = new JLabel("push the bellow button");
        output = new JLabel("Good Luck");
        for(int i=1; i<10; i++){
            button[i-1]= new JButton(Integer.toString(i));
            button[i-1].addActionListener(this);
            panel.add(button[i-1]);
        }

        add(information, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(output, BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        UpDown ud = new UpDown();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JButton b = (JButton)e.getSource();
        int user = Integer.parseInt(""+b.getText().charAt(0));

        if(user == randomNum){
            output.setText("correct");
        }
        else if(user>randomNum){
            output.setText("down");
        }
        else{
            output.setText("up");
        }
    }

}