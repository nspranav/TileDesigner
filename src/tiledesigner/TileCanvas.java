/*
 * Assignment 4
 * Application to Graphially demonstrate a Tile Designer
 * Programmers: Ns Pranav(Z1751125), Sneha Manthani(Z1748183)
 * Due Date:11-13-2015
 */
package tiledesigner;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author pranavns
 */
class TileCanvas extends JPanel implements MouseListener
{
   
int gridWidth;
int gridHeight;
int startX,startY;

static final int squareSide = 25; int gridRows,gridCols=5;						
int[][] tilesArray = new int[gridRows][gridCols];  //row is y, col is x
public int selectedTile;
String[] images = {"resources/pat1.gif","resources/pat2.gif","resources/pat3.gif","resources/pat4.gif","resources/pat5.gif"};
Image[] imageA = new Image[5]; //hold 5 gifs
Image[][] gif2dArray = new Image[5][5];

public TileCanvas()
{
     selectedTile = 0;
     LoadImageArray();
     ResetGridTile();
     CreateMouseListener();
}

public void LoadImageArray()	// Use toolkit to fill imageA..5 gifs}
{
    for(int i=0;i<5;i++)
    {
        imageA[i] = (Image) Toolkit.getDefaultToolkit().getImage(images[i]);
    }
}
public void ResetGridTile()
{
  for(int row=0;row<5;row++)
  {
      for(int col=0;col<5;col++)
      {
          gif2dArray[row][col] = null;  
      }
  }
  
  this.repaint();  //draw empty grid
}
	
public void CreateMouseListener()//Add mouselistener to Center panel..need mouse methods at bottom
{ 
    addMouseListener(this);
}


//user has clicked a tile on panel, now has clicked in the 5 x 5 grid
public void mouseClicked(MouseEvent arg0) 							  
{
    int x=arg0.getX();
    int y=arg0.getY();
                  //if it was a valid click in grid
 if(x >= startX && x <= startX+gridWidth && y >= startY && y <= startY+gridWidth)
 {
   int xIndex = (x-startX)/squareSide; //will be an integer of square clicked
   int yIndex = (y-startY)/squareSide; //wil be an integer of squear clicked
       
   //            col      row     
   gif2dArray[xIndex][yIndex] = imageA[selectedTile];
    this.repaint();  //show new grid
 }
}

public void setSectedTile(int s)
{
    this.selectedTile=s;
}
public void paintComponent(Graphics g)	//Implementing paint component
{ 
  super.paintComponent(g);
  gridWidth = gridCols*squareSide;
  gridHeight = gridRows*squareSide;
  int panelWidth = getWidth();
  int panelHeight = getHeight();
  startX = (panelWidth-gridWidth)/2;//get starting point to draw grid based 
  

 //Drawing empty grid of 5*5 with an inner outer loop
  
  for(int row=0;row<5;row++)
  {
      for(int col=0;col<5;col++)
      {
          g.drawRect(startX+(squareSide*row), startY+(squareSide*col), squareSide, squareSide);
          g.drawImage(gif2dArray[row][col], startX+(squareSide*row), startY+(squareSide*col), this);
      }
  }
 
}

    @Override
    public void mousePressed(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 
 //copy gif image array over to the drawing grid with inner outer loop


