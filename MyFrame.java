import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyFrame extends JFrame {
    private JButton button;
    private JLabel label;
    private Date time;
    SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
    String nowTime ="";

    public MyFrame(){
        this.setSize(300,200);
        this.setTitle("CAL");

        JPanel panel = new JPanel();
        button = new JButton("Check");
        label = new JLabel("time is:"+nowTime);
        button.addActionListener(e->{
            time = new Date();
            nowTime = format1.format(time);
            label.setText("time is:"+nowTime);
            
        });
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        MyFrame mF = new MyFrame();
    }

}