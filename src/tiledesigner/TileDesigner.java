/*
 * Assignment 4
 * Application to Graphially demonstrate a Tile Designer
 * Programmers: Ns Pranav(Z1751125), Sneha Manthani(Z1748183)
 * Due Date:11-13-2015
 */
package tiledesigner;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author pranavns
 */
public class TileDesigner {
    
    private final String imagename[]={"pat1.gif","pat2.gif","pat3.gif","pat4.gif","pat5.gif"};
    
    private JFrame mainframe;
    private JPanel southpanel;
    private JPanel centerpanel;
    private JPanel northpanel;
    private JToolBar toolbar;
    private JButton[] buttons;
    
    public TileDesigner()
    {
        prepareGUI();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        TileDesigner td=new TileDesigner();
        
    }
    
    private void prepareGUI()
    {
        mainframe= new JFrame("Tile Designer");
        mainframe.setVisible(true);
        mainframe.setSize(400,400);
        mainframe.setLayout(new BorderLayout());
        mainframe.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent windowEvent){
	        System.exit(0);
         }
        });
        
        northpanel =new JPanel(new FlowLayout());
        centerpanel=new JPanel(new BorderLayout());
        centerpanel.setBackground(Color.red);
        southpanel=new JPanel(new BorderLayout());
        southpanel.setBackground(Color.blue);
        mainframe.add(northpanel,BorderLayout.NORTH);
        mainframe.add(centerpanel,BorderLayout.CENTER);
        mainframe.add(southpanel,BorderLayout.SOUTH);
        
        toolbar= new JToolBar();
        toolbar.setRollover(true);
        northpanel.add(toolbar);
        
        buttons=new JButton[4];
        buttons[0]=new JButton();
        buttons[1]=new JButton();
        buttons[2]=new JButton();
        buttons[3]=new JButton();
        try 
        {
        //Image img = ImageIO.read(getClass().getResource("resources/pat1.gif"));
        buttons[0].setIcon(new ImageIcon("resources/pat1.gif"));
        buttons[1].setIcon(new ImageIcon("resources/pat2.gif"));
        buttons[2].setIcon(new ImageIcon("resources/pat3.gif"));
        buttons[3].setIcon(new ImageIcon("resources/pat4.gif"));
        } 
        catch (Exception ex) 
        {
            
        }
        toolbar.add(buttons[0]);
        toolbar.add(buttons[1]);
        toolbar.add(buttons[2]);
        toolbar.add(buttons[3]);
    }
    
}
