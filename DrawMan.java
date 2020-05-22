import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawMan extends JFrame implements MouseListener {
    ImageIcon icon = new ImageIcon("C:\\man.png");
    JPanel panel = new JPanel();
    Image img;
    String pic ="C:\\man.png";
    public DrawMan(){
        addMouseListener(this);
        setSize(1000,1000);
        setLayout(null);
        setTitle("man");
        img = Toolkit.getDefaultToolkit().getImage(pic);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void mouseClicked(MouseEvent e){
        Graphics g = getGraphics();
        g.drawImage(img, e.getX(), e.getY(), this);
    }

    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}

    public static void main(String[] args){
        DrawMan dm = new DrawMan();
    }
}