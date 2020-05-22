import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener{
    JButton[] button = new JButton[9];
    JOptionPane pane = new JOptionPane();
    char turn ='X';
    public TicTacToe(){
        setSize(300,300);
        setTitle("TicTacToe");
        setLayout(new GridLayout(3,3));
        for(int i=0; i<9; i++){
            button[i] = new JButton(" ");
            button[i].addActionListener(this);
            add(button[i]);
        }
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        for(int i=0; i<9; i++){
            if(e.getSource()==button[i]&&button[i].getText().equals(" ")==true){
                if(turn =='X'){
                    button[i].setText("X");
                    turn = 'O';
                }
                else{
                    button[i].setText("O");
                    turn ='X';
                }
            }
            
            //Horizon
            if(button[0].getText().equals(" ")==false&&(button[0].getText().equals(button[1].getText())&&button[1].getText().equals(button[2].getText()))){
                JOptionPane.showMessageDialog(null, button[0].getText()+" win", "end", JOptionPane.CLOSED_OPTION);
                return;
            }
            else if(button[3].getText().equals(" ")==false&&(button[3].getText().equals(button[4].getText())&&button[4].getText().equals(button[5].getText()))){
                JOptionPane.showMessageDialog(null, button[3].getText()+" win", "end", JOptionPane.CLOSED_OPTION);
                return;
            }
            else if(button[6].getText().equals(" ")==false&&(button[6].getText().equals(button[7].getText())&&button[7].getText().equals(button[8].getText()))){
                JOptionPane.showMessageDialog(null, button[6].getText()+" win", "end", JOptionPane.CLOSED_OPTION);
                return;
            }

            //vertical
            if(button[0].getText().equals(" ")==false&&(button[0].getText().equals(button[3].getText())&&button[3].getText().equals(button[6].getText()))){
                JOptionPane.showMessageDialog(null, button[0].getText()+" win", "end", JOptionPane.CLOSED_OPTION);
                return;
            }
            else if(button[1].getText().equals(" ")==false&&(button[1].getText().equals(button[4].getText())&&button[4].getText().equals(button[7].getText()))){
                JOptionPane.showMessageDialog(null, button[1].getText()+" win", "end", JOptionPane.CLOSED_OPTION);
                return;
            }
            else if(button[2].getText().equals(" ")==false&&(button[2].getText().equals(button[5].getText())&&button[5].getText().equals(button[8].getText()))){
                JOptionPane.showMessageDialog(null, button[2].getText()+" win", "end", JOptionPane.CLOSED_OPTION);
                return;
            }

            //diagonal
            if(button[0].getText().equals(" ")==false&&(button[0].getText().equals(button[4].getText())&&button[4].getText().equals(button[8].getText()))){
                JOptionPane.showMessageDialog(null, button[0].getText()+" win", "end", JOptionPane.CLOSED_OPTION);
                return;
            }
            else if(button[2].getText().equals(" ")==false&&(button[1].getText().equals(button[4].getText())&&button[4].getText().equals(button[6].getText()))){
                JOptionPane.showMessageDialog(null, button[2].getText()+" win", "end", JOptionPane.CLOSED_OPTION);
                return;
            }
        }
    }
    public static void main(String[] args){
        TicTacToe ttt= new TicTacToe();
    }
}