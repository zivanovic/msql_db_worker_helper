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
public class DBTable extends DBComponent
{
    ArrayList<DBColumn> columns;
    public DBTable(String name)
    {
        super(name);
        columns = new ArrayList<>();
    }
    
    public void addColumn(DBColumn col)
    {
        columns.add(col);
    }
    public void remouveColumn(int id)
    {
        columns.remove(id);
    }
    
    public String toString()
    {
        return "Table: "+getName();
    }
}
