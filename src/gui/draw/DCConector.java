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
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class DCConector extends DrawComponets
{

    private Point start;
    private Point end;
    

    public DCConector()
    {
        super("connet");
        selected = false;
        update_position(new Point(0, 0));
        setSize(0, 0);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        draw_me(g);
    }

    @Override
    public void draw_me(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g.create();
        int thickness = 2;
        BasicStroke bs = new BasicStroke(thickness);
        g2d.setStroke(bs);
        if (selected)
        {
            g2d.setColor(Color.GREEN);
        } else
        {
            g2d.setColor(Color.BLACK);
        }
        if (start != null && end != null)
        {
            g2d.drawLine(start.x, start.y, end.x, end.y);
            //arrow head
            Polygon arrowHead = new Polygon();  
            arrowHead.addPoint( 0,5);
            arrowHead.addPoint( -5, -5);
            arrowHead.addPoint( 5,-5);
            
            AffineTransform tx = new AffineTransform();
            Line2D.Double line = new Line2D.Double(start.x,start.y,end.x,end.y);
            
            tx.setToIdentity();
            double angle = Math.atan2(line.y2-line.y1, line.x2-line.x1);
            tx.translate(line.x2, line.y2);
            tx.rotate((angle-Math.PI/2d));  
            g2d.setTransform(tx);   
            g2d.fill(arrowHead);
            
        }
        
        g2d.dispose();
    }

    public Point getStart()
    {
        return start;
    }

    public Point getEnd()
    {
        return end;
    }

    public void setStart(Point start)
    {
        this.start = start;
    }

    public void setEnd(Point end)
    {
        this.end = end;
    }
 
    public void togleSelected()
    {
        this.selected = !this.selected;
    }

    boolean isClicked(Point point)
    {
        boolean ret = false;
        if(start==null || end == null)
        {
            return false;
        }
        double dist = new Line2D.Float(start, end).ptLineDist(point);
        if (dist <= 2)
        {
            ret = true;
        }
        return ret;
    }
}
