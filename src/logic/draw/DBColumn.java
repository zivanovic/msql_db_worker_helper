/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.draw;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class DBColumn extends DBComponent
{

    private DBTypes type;
    private int N;
    private int M;
    private DBConstraint decoration;

    public DBColumn(String name)
    {
        super(name);
    }

    public void setType(DBTypes type)
    {
        this.type = type;
    }

    public void setDecoration(DBConstraint decoration)
    {
        this.decoration = decoration;
    }

    public DBTypes getType()
    {
        return type;
    }

    public DBConstraint getDecoration()
    {
        return decoration;
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
}
