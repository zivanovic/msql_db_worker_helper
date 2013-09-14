/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.draw;

import java.util.ArrayList;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class DBShema extends DBComponent
{
    ArrayList<DBTable> tables;
    public DBShema(String name)
    {
        super(name);
        tables = new ArrayList<>();
    }
    
     public void addTable(DBTable col)
    {
        tables.add(col);
    }
    public void remouveTable(int id)
    {
        tables.remove(id);
    }
    
    public String toString()
    {
        return "Shema: "+getName();
    }
}
