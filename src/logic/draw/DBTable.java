/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.draw;

import java.util.ArrayList;
import log.Log;

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

    public String createSQL()
    {
        String q = "CREATE TABLE ";
        q+=getName();
        q+="(";
        
        int numc = columns.size();
        for(int i=0;i<numc;i++)
        {
            if(columns.get(i)!=null)
            {
               DBColumn col = columns.get(i);
               q+=col.createSQL()+" ";
            }
        }
        q = q.substring(0, q.length()-1);
        q+=")";
        Log.logd(q);
        //return q;        
        return "";
    }
}
