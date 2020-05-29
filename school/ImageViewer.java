import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageViewer extends JFrame implements ActionListener{
    JLabel l;
    JMenuItem open, exit;

    public ImageViewer(){
        setSize(600,300);
        setTitle("Image Viewer");

        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("File");
        open = new JMenuItem("open");
        open.addActionListener(this);
        menu.add(open);

        exit = new JMenuItem("exit");
        exit.addActionListener(this);
        menu.add(exit);
        mb.add(menu);
        mb.add(new JMenu("help"));
        setJMenuBar(mb);

        l= new JLabel();
        JPanel panel = new JPanel();
        panel.add(l, "CENTER");
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source == open){
            JFileChooser fc = new JFileChooser();
            int r = fc.showOpenDialog(this);
            if(r==JFileChooser.APPROVE_OPTION){
                String name = fc.getSelectedFile().getAbsolutePath();
                l.setIcon(new ImageIcon(name));
            }
            if(source==exit){
                System.exit(0);
            }
        }
    }

    public static void main(String[] args){
        new ImageViewer();
    }
}