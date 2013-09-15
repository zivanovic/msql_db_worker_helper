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
public class DBColumn extends DBComponent
{

    private DBTypes type;
    private int N;
    private int M;
    private ArrayList<DBConstraint> decoration;

    public DBColumn(String name)
    {
        super(name);
        this.decoration = new ArrayList<>();
    }

    public void setType(DBTypes type)
    {
        this.type = type;
    }

    public void setDecoration(DBConstraint decoration)
    {
        this.decoration.add(decoration);
    }

    public DBTypes getType()
    {
        return type;
    }

    public DBConstraint getDecoration(int i)
    {
        return decoration.get(i);
    }

    public String toString()
    {
        String ret = "";
        ret = getName() + " " + type.writeString();
        int na = type.num_of_arguments();

        if (na == 1)
        {
            ret += "(" + M + ")";
        } else if (na == 2)
        {
            ret += "(" + N + ", " + M + ")";
        }

        return ret;
    }

    public void setN(int N)
    {
        this.N = N;
    }

    public void setM(int M)
    {
        this.M = M;
    }

    public int getN()
    {
        return N;
    }

    public int getM()
    {
        return M;
    }
    
    public String createSQL()
    {
        String ret=toString()+" ";
        int valn = decoration.size();
        for(int i=0;i<valn;i++)
        {
            if(decoration.get(i)==DBConstraint.NOT_NULL)
            {
                ret += decoration.get(i).toString()+",";
            }
            else
            {
                ret +=","+decoration.get(i).toString()+"("+getName()+"), ";
            }
        }
        
        if(ret.charAt(ret.length()-1)!=',')
        {
            ret+=",";
        }
        return ret;
    }
}
