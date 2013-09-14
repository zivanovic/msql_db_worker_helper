/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.draw;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class DBComponent
{
    private String name;
    
    public DBComponent(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String getDrawingName()
    {
        return "- "+name+" -";
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    
    
    
    
}
