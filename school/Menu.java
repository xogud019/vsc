import javax.swing.*;

public class Menu extends JFrame{
    public Menu(){
        setSize(400,200);
        setTitle("Menu");

        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("File");
        menu.add(new JMenuItem("new File"));
        menu.add(new JMenuItem("new Folder"));
        menu.add(new JMenuItem("open File"));
        menu.add(new JMenuItem("open Folder"));
        menu.add(new JMenuItem("close"));
        mb.add(menu);

        mb.add(new JMenu("Edit"));
        mb.add(new JMenu("Selection"));
        mb.add(new JMenu("view"));
        mb.add(new JMenu("go"));
        mb.add(new JMenu("run"));
        mb.add(new JMenu("terminal"));
        mb.add(new JMenu("help"));

        setJMenuBar(mb);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new Menu();
    }
}