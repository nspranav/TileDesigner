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
import javax.swing.*;

/**
 *
 * @author pranavns
 */
public class TileDesigner {

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
        mainframe.setSize(900,600);
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
        northpanel.add(toolbar);
        
        buttons=new JButton[4];
        buttons[0]=new JButton();
        
    }
    
}
