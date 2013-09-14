/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import javax.swing.JComponent;
import log.Log;
import logic.draw.DBComponent;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
class DrawComponets extends JComponent
{
    private String type;
    protected Point position;
    ArrayList<DCConector>connections;
    protected boolean selected;
  
    public DrawComponets(String type)
    {        
        this.type = type;
        position = new Point(10, 10);
        setSize(70, 100);
        
        connections = new ArrayList<>();
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);  
        draw_me( g);
    }
    
    public void draw_me(Graphics g)
    {
         Graphics2D g2d = (Graphics2D) g.create();
         int thickness = 2;

         //draw border
         BasicStroke bs = new BasicStroke(thickness);
         g2d.setStroke(bs);
         if(selected)
         {
             g2d.setColor(Color.GREEN);
         }
         else
         {
             g2d.setColor(Color.GRAY);
         }
         
         RoundRectangle2D roundedRectangle;
         roundedRectangle = new RoundRectangle2D.Float(position.x-(thickness/2), position.y-(thickness/2), getWidth()+thickness, getHeight()+thickness, 20, 20);
         g2d.draw(roundedRectangle);
         g2d.setColor(Color.decode("11840100"));
         g2d.fillRoundRect(position.x, position.y, getWidth(), getHeight(), 20, 20);
         bs = new BasicStroke(1);
         g2d.setStroke(bs);
         g2d.setColor(Color.GRAY);
         roundedRectangle = new RoundRectangle2D.Float(position.x, position.y, getWidth(), 20, 20, 20);
         g2d.draw(roundedRectangle);
      
         //type
         g2d.setColor(Color.BLACK);
         g2d.drawString(type, position.x+5, position.y+15);
         
         g2d.dispose();         
    }

    public boolean isEnterd(Point point)
    {
        int w = getWidth();
        int h = getHeight();
        
        if(position.x < point.x && point.x < (position.x+w))
        {
            if(position.y < point.y && point.y <((position.y+h)))
            {                
                return true;
            }
        }
        
        return false;
    }
    
    public Point getPosition()
    {
        return position;
    }
    
    public void update_position(Point point)
    {
        position = point;
    }
    
    public void addConnection(DCConector c)
    {
        connections.add(c);
    }
    
    public void removeConnection(DCConector c)
    {
        connections.remove(c);
    }

    public Point getConnectionPoint(Point ep)
    {
        /*
         * A                       B
         * ._______________________.
         * |    |                  |
         * |    | ep               |
         * |____*__________________|
         * |____|__________________|
         * C                       D
         * 
         */
        
        Point A = new Point (position.x, position.y);
        Point B = new Point (position.x+getWidth(), position.y);
        Point C = new Point (position.x, position.y+getHeight());
        Point D = new Point (position.x+getWidth(), position.y+getHeight());
        
        double distAB = new Line2D.Float(A, B).ptLineDist(ep);
        double distBD = new Line2D.Float(B, D).ptLineDist(ep);
        double distDC = new Line2D.Float(D, C).ptLineDist(ep);
        double distAC = new Line2D.Float(A, C).ptLineDist(ep);
        
        if(distAB<distBD && distAB<distDC && distAB<distAC)
        {
            return new Point((position.x+getWidth())/2,position.y);
        }
        else if(distBD<distAB && distBD<distDC && distBD<distAC)
        {
            return new Point((position.x+getWidth()),(position.y+getHeight()));
        }
        else if(distDC<distAB && distDC<distBD && distDC<distAC)
        {
            return new Point((position.x+getWidth())/2,(position.y+getHeight()));
        }
        else if(distAC<distAB && distAC<distBD && distAC<distDC)
        {
            return new Point(position.x,(position.y+getHeight())/2);
        }
        else
        {
            return null;
        }
    }
    
    public void setSelected(boolean selected)
    {
        this.selected = selected;
    }
}
