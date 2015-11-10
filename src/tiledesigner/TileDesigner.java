/*
 * Assignment 4
 * Application to Graphially demonstrate a Tile Designer
 * Programmers: Ns Pranav(Z1751125), Sneha Manthani(Z1748183)
 * Due Date:11-13-2015
 */
package tiledesigner;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class TileDesigner {
    
    //private final String imagename[]={"pat1.gif","pat2.gif","pat3.gif","pat4.gif","pat5.gif"};
    
    private JFrame mainframe;
    private JPanel southpanel;
    private TileCanvas centerpanel;
    private JPanel northpanel;
    private JToolBar toolbar;
    private JButton[] buttons;
    private JButton reset;
    
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
        //Object ob= new Object();
        //System.out.println(ob.toString());
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
        
        northpanel =new JPanel(new BorderLayout());
        centerpanel=new TileCanvas();
        centerpanel.setLayout(new BorderLayout());
        //centerpanel.setBackground(Color.red);
        southpanel=new JPanel(new BorderLayout());
        southpanel.setBackground(Color.blue);
        mainframe.add(northpanel,BorderLayout.NORTH);
        mainframe.add(centerpanel,BorderLayout.CENTER);
        mainframe.add(southpanel,BorderLayout.SOUTH);
        
        toolbar= new JToolBar();
        toolbar.setRollover(true);
        northpanel.add(toolbar);
        
        buttons=new JButton[5];
        buttons[0]=new JButton();
        buttons[1]=new JButton();
        buttons[2]=new JButton();
        buttons[3]=new JButton();
        buttons[4]=new JButton();
        try 
        {
        //Image img = ImageIO.read(getClass().getResource("resources/pat1.gif"));
        buttons[0].setIcon(new ImageIcon("resources/pat1.gif"));
        buttons[1].setIcon(new ImageIcon("resources/pat2.gif"));
        buttons[2].setIcon(new ImageIcon("resources/pat3.gif"));
        buttons[3].setIcon(new ImageIcon("resources/pat4.gif"));
        buttons[4].setIcon(new ImageIcon("resources/pat5.gif"));
        } 
        catch (Exception ex) 
        {
            
        }
        toolbar.add(buttons[0]);
        toolbar.add(buttons[1]);
        toolbar.add(buttons[2]);
        toolbar.add(buttons[3]);
        toolbar.add(buttons[4]);
        
        reset=new JButton("Reset");
        southpanel.add(reset);
        
        //action listeners
         buttons[0].addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            
            centerpanel.selectedTile=0;
         }          
      });
         
         buttons[1].addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            
            centerpanel.selectedTile=1;
         }          
      });
         
         buttons[2].addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            
            centerpanel.selectedTile=2;
         }          
      });
         
         buttons[3].addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            
            centerpanel.selectedTile=3;
         }          
      });
         
          buttons[4].addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            
            centerpanel.selectedTile=4;
         }          
      });
         reset.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            
            centerpanel.ResetGridTile();
         }          
      });
         
       
    }
    
}
