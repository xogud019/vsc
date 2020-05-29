import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OrderSystem extends JFrame implements ActionListener{
    JPanel top ,menu ,toping ,size ,bot;
    JRadioButton combo, potato, meet, small, medium, large, family;
    JLabel l1;
    JButton b1,b2;
    JTextField price;
    String[] toping_food={"shrimp","olive","pineapple","peperoni","sweet potato","cheese","bacon","onion"};
    JCheckBox[] box; 
    public OrderSystem(){
        setSize(500,300);    
        setTitle("Order System");
        //top panel
        top = new JPanel();
        l1 = new JLabel("WELCOME!!");
        l1.setFont(new Font("Arial",Font.ITALIC,15));
        top.add(l1);
        add(top,BorderLayout.NORTH);

        //menu panel
        menu = new JPanel();
        menu.setLayout(new GridLayout(3,1));
        combo = new JRadioButton("Combo",true);
        combo.addActionListener(this);
        potato = new JRadioButton("Potato",true);
        potato.addActionListener(this);
        meet = new JRadioButton("Meet",true);
        meet.addActionListener(this);
        ButtonGroup type = new ButtonGroup();
        type.add(combo);
        type.add(potato);
        type.add(meet);
        menu.setBorder(BorderFactory.createTitledBorder("MENU"));
        menu.add(combo);
        menu.add(potato);
        menu.add(meet);
        add(menu,BorderLayout.WEST);

        //toping panel
        toping = new JPanel();
        toping.setLayout(new GridLayout(4,2));
        box = new JCheckBox[toping_food.length];

        for(int i=0; i<toping_food.length; i++){
            box[i]=new JCheckBox(toping_food[i]);
            toping.add(box[i]);
            box[i].addActionListener(this);
        }

        toping.setBorder(BorderFactory.createTitledBorder("TOPING"));
        add(toping,BorderLayout.CENTER);

        //size panel
        size = new JPanel();
        size.setLayout(new GridLayout(4,1));
        small = new JRadioButton("small");
        small.addActionListener(this);
        medium = new JRadioButton("medium",true);
        medium.addActionListener(this);
        large = new JRadioButton("large");
        large.addActionListener(this);
        family = new JRadioButton("family");
        family.addActionListener(this);
        ButtonGroup pSize = new ButtonGroup();
        pSize.add(small);
        pSize.add(medium);
        pSize.add(large);
        pSize.add(family);
        size.setBorder(BorderFactory.createTitledBorder("SIZE"));
        size.add(small);
        size.add(medium);
        size.add(large);
        size.add(family);
        add(size,BorderLayout.EAST);

        //bot panel
        bot = new JPanel();
        b1 = new JButton("Order");
        b1.addActionListener(this);
        b2 = new JButton("Cancel");
        b2.addActionListener(this);
        price = new JTextField(20);
        price.setEditable(false);
        bot.add(b1);
        bot.add(b2);
        bot.add(price);
        add(bot,BorderLayout.SOUTH);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        int Totalprice =0;
        if(combo.isSelected()){
            Totalprice+=2000;
        }
        if(potato.isSelected()){
            Totalprice+=1000;
        }
        if(meet.isSelected()){
            Totalprice+=1500;
        }
        for(int i=0; i<toping_food.length; i++){
            if(box[i].isSelected()){
                Totalprice+=500;
            }
        }
        if(small.isSelected()){
            Totalprice+=10000;
        }
        if(medium.isSelected()){
            Totalprice+=12000;
        }
        if(large.isSelected()){
            Totalprice+=14000;
        }
        if(family.isSelected()){
            Totalprice+=16000;
        }
        if(e.getSource()==b1){
            price.setText(Integer.toString(Totalprice));
        }
        if(e.getSource()==b2){
            System.exit(0);
        }
    }

    public static void main(String[] args){
        new OrderSystem();
    }
}