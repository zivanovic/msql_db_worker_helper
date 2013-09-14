/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.draw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import logic.draw.DBShema;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class DCShema extends DrawComponets
{
    DBShema shema;
    
    public DCShema(String name)
    {
        super("Sheme");
        shema = new DBShema(name);
        Dimension dm = getSize();
        int title_w = shema.getDrawingName().length()*12;
        int w = dm.width < title_w ?title_w:dm.width ;
        setSize(w,60);

    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);  
        draw_me( g);
    }
    
    @Override
    public void draw_me(Graphics g)
    {
        super.draw_me(g);
        Graphics2D g2d = (Graphics2D) g.create();
        
        g2d.setColor(Color.BLACK);
        Font f = g2d.getFont();
        
        f = f.deriveFont(Font.BOLD);
        g2d.setFont(f);
        g2d.drawString(shema.getDrawingName(), position.x+5, position.y+45);
        g2d.dispose();
    }
    
    @Override
    public String toString()
    {
        return shema.toString();
    }
}
