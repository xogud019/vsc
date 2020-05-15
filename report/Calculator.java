import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame{
    private String[] label ={"BackSpace","","","CE","C"
                            ,"7","8","9","/","sqrt"
                            ,"4","5","6","*","%"
                            ,"1","2","3","-","1/x"
                            ,"0","+/-",".","+","-"};
    public Calculator(){
        setSize(550,250);
        JPanel mainPanel = new JPanel();
        JPanel textPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0,5,3,3));
        JButton[] buttons = new JButton[label.length];
        

        for(int i=0; i<label.length; i++){
            buttons[i]= new JButton(label[i]);
            buttons[i].setBackground(Color.YELLOW);
            buttonPanel.add(buttons[i]);
        }

        JTextField f1= new JTextField(45);
        textPanel.add(f1);

        mainPanel.add(textPanel);
        mainPanel.add(buttonPanel);
        add(mainPanel);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        Calculator cal = new Calculator();
    }
}